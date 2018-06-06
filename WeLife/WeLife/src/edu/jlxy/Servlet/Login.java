package edu.jlxy.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import edu.jlxy.Module.entity.UserEntity;
import edu.jlxy.Module.table.impl.UserImpl;
import edu.jlxy.util.ConnectionFactory;
import edu.jlxy.util.ResultSetUtil;

public class Login extends HttpServlet {

	/**
	 * SendDynamic_handle
	 */
	private static final long serialVersionUID = -4410821345226285713L;

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ConnectionFactory cf = ConnectionFactory.getInstance();
		Connection connection = cf.makeConnection();
		try {
			connection.setAutoCommit(false);
		} catch (SQLException e3) {
			e3.printStackTrace();
		}
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		try {
			System.out.println(connection.getAutoCommit());
		} catch (SQLException e1) {
			e1.printStackTrace();
		}


		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();// 获取session
		session.setAttribute("currentuser", username);
        //String curruentUser = session.getAttribute("currentuser").toString();
		
		System.out.println("=======doPost=======");
		System.out.println("username ==>" + username);
		System.out.println("password ==>" + password);
		UserEntity userEntity = UserEntity.getInstance();
		UserImpl userImpl = new UserImpl();
		ResultSetUtil resultSetUtil = ResultSetUtil.getInstance();

		userEntity.setuid1(username);
		userEntity.setpwd(password);
		try {
			//查询所有用户名
			ResultSet resultSet = userImpl.queryAllUId(connection);
			boolean isExist=resultSetUtil.isRepat(username, resultSet);
			System.out.println("该用户名是否存在："+isExist);
			String forward = null;
			//比较用户名
			if (isExist) {
				//若用户名校验成功，再校验密码
				resultSet = userImpl.queryPwd(connection, userEntity);
				isExist=resultSetUtil.isRepat(password, resultSet);
				System.out.println("密码是否匹配："+isExist);
				if (isExist) {
					
					System.out.println("登录成功!");
					forward = "/PersonalPage.jsp";
					RequestDispatcher requestDispatcher = request.getRequestDispatcher(forward);
					requestDispatcher.forward(request, response);
				}else {
					
					//发出警告信息，提示错误
					out.print(
							"<script language='javascript'>alert('用户名或密码错误！');window.location.href='Login.jsp';</script>");
					//跳转到原来页面
					
				}
			} else {
				
				out.print(
						"<script language='javascript'>alert('用户名或密码错误！');window.location.href='Login.jsp';</script>");
//				forward = "/Login.jsp";
//				RequestDispatcher requestDispatcher = request.getRequestDispatcher(forward);
//				requestDispatcher.forward(request, response);
				
			}
		} catch (Exception e) {
			try {
				e.printStackTrace();
				connection.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}finally {
			try {if (connection!=null) {
				out.flush();
				out.close();
				connection.close();
				System.out.println("=======连接关闭！=======");
			}
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		}

		// String forward=null;
		// if (username.equals("222")&&password.equals("222")) {
		//
		// forward="/WEB-VIEW/PersonalPage.jsp";
		//
		//
		// RequestDispatcher
		// requestDispatcher=request.getRequestDispatcher(forward);
		// requestDispatcher.forward(request, response);
		//
		// //resp.sendRedirect(req.getContextPath()+"/Demo13/success.jsp");
		//
		// }else {
		//
		// forward="/WEB-VIEW/Navigation.jsp";
		//// forward="http://www.jikexueyuan.com";
		// RequestDispatcher
		// requestDispatcher=request.getRequestDispatcher(forward);
		// requestDispatcher.forward(request, response);
		//
		//
		// }

	}
}

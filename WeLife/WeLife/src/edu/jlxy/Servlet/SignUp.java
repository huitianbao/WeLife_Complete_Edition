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

import edu.jlxy.Module.entity.UserEntity;
import edu.jlxy.Module.table.impl.UserImpl;
import edu.jlxy.util.ConnectionFactory;
import edu.jlxy.util.ResultSetUtil;

public class SignUp extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6548870728623203387L;


	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ConnectionFactory cf = ConnectionFactory.getInstance();
		Connection connection = cf.makeConnection();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		UserEntity userEntity = UserEntity.getInstance();
		UserImpl userImpl = new UserImpl();
		
		ResultSetUtil resultSetUtil = ResultSetUtil.getInstance();
		String forward = null;

		try {
			connection.setAutoCommit(false);
			System.out.println("事务自动提交："+connection.getAutoCommit());
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		String username = request.getParameter("name");
		String password = request.getParameter("psd");
		String confirm = request.getParameter("confrimpsd");
		String realname = request.getParameter("realname");
		int age = Integer.parseInt(request.getParameter("age"));
		String job = request.getParameter("job");
		System.out.println("=======doPost=======");
		System.out.println("username ==>" + username);
		System.out.println("password ==>" + password);
		System.out.println("confirm ==>" + confirm);
		System.out.println("realname ==>" + realname);
		System.out.println("age ==>" + age);
		System.out.println("job ==>" + job);
		try {
			// 验证密码
			if (!password.equals(confirm)) {
				// 清除confrimpsd文本框內容
				out.print("<script language='javascript'>alert('两次输入密码不匹配！');"
						+ "window.location.href='Signup.jsp'"
						+ "</script>");
			} else {

				userEntity.setuid1(username);
				userEntity.setpwd(password);
				userEntity.setname(realname);
				userEntity.setAge(age);
				userEntity.setjob(job);
				// 查询所有用户名
				ResultSet resultSet = userImpl.queryAllUId(connection);
				boolean isExist = resultSetUtil.isRepat(username, resultSet);
				System.out.println("该用户名是否存在：" + isExist);
				// 比较用户名
				if (isExist) {
					out.print("<script language='javascript'>alert('该用户名已被占用！');"
							+ "window.location.href='Signup.jsp'"
							+ "</script>");
				} else {

					userImpl.insert(connection, userEntity);
					connection.commit();
					System.out.println("注册成功！");
					forward = "/PersonalPage.jsp";
					RequestDispatcher requestDispatcher = request.getRequestDispatcher(forward);
					requestDispatcher.forward(request, response);

				}
			}
		} catch (Exception e) {
			try {
				e.printStackTrace();
				connection.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				if (connection != null) {
					
					out.flush();
					out.close();
					connection.close();
					System.out.println("=======连接关闭！=======");
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}}
		

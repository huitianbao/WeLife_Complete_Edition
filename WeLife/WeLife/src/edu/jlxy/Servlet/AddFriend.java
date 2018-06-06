package edu.jlxy.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jlxy.Module.entity.FriendEntity;
import edu.jlxy.Module.entity.UserEntity;
import edu.jlxy.Module.table.impl.FriendImpl;
import edu.jlxy.util.ConnectionFactory;
import edu.jlxy.util.ResultSetUtil;

public class AddFriend extends HttpServlet {

	private static final long serialVersionUID = -8354028380749402129L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		///////////////////////////////////////////////
		FriendEntity friendEntity = new FriendEntity();
		UserEntity userEntity = UserEntity.getInstance();
		FriendImpl friendImpl = new FriendImpl();
		friendEntity.setuid(userEntity.getuid1());
		friendEntity.setfid(request.getParameter("friendId"));
		ResultSetUtil resultSetUtil = ResultSetUtil.getInstance();
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		String forward = null;

		try {
			connection.setAutoCommit(false);
			// 查询自己的好友fid
			ResultSet resultSet = friendImpl.queryMyFriendFid(connection, friendEntity);
			if (!resultSetUtil.isRepat(request.getParameter("friendId"), resultSet)) {
				friendImpl.insert(connection, friendEntity);
				connection.commit();
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
//					out.write("<script>");
//					out.write("location.reload();");
//					out.write("</script>");
					forward = "/AddFriend2.jsp";
					response.sendRedirect(forward);
//					RequestDispatcher requestDispatcher = request.getRequestDispatcher(forward);
//					requestDispatcher.forward(request, response);
					return;
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		////////////////////////////////////////

	}
}

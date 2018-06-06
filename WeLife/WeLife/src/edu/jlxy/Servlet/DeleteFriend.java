package edu.jlxy.Servlet;

import java.io.IOException;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.jlxy.Module.entity.FriendEntity;
import edu.jlxy.Module.table.impl.FriendImpl;
import edu.jlxy.util.ConnectionFactory;

public class DeleteFriend extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2447927196704879408L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		////////////////////////////////////////
		FriendEntity friendEntity = FriendEntity.getInstance();
		FriendImpl friendImpl = new FriendImpl();
		friendEntity.setuid(request.getParameter("uid"));
		friendEntity.setfid(request.getParameter("fid"));
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		try {
			connection.setAutoCommit(false);
			friendImpl.delete(connection, friendEntity);
			connection.commit();

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
					connection.close();
					System.out.println("=======连接关闭！=======");
					response.sendRedirect("PersonalPage.jsp");
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		///////////////////////////////////////

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
	
}

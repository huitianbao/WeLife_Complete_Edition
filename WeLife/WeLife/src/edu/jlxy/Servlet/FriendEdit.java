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

public class FriendEdit extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6775838661394461953L;


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		////////////////////////////////////////
		FriendEntity friendEntity=FriendEntity.getInstance();
		FriendImpl friendImpl=new FriendImpl();
		friendEntity.setuid(request.getParameter("uid"));
		friendEntity.setfid(request.getParameter("fid"));
		friendEntity.setl1(request.getParameter("l1"));
		friendEntity.setl2(request.getParameter("l2"));
		friendEntity.setl3(request.getParameter("l3"));
		friendEntity.setl4(request.getParameter("l4"));
		friendEntity.setl5(request.getParameter("l5"));
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		try {			
			connection.setAutoCommit(false);
			friendImpl.update(connection, friendEntity);
			connection.commit();
			
		} catch (Exception e) {
			try {
				e.printStackTrace();
				connection.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}finally {
			try {if (connection!=null) {
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

package edu.jlxy.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.jlxy.Module.entity.FriendEntity;
import edu.jlxy.Module.entity.UserEntity;
import edu.jlxy.Module.table.impl.FriendImpl;
import edu.jlxy.Module.table.impl.UserImpl;
import edu.jlxy.util.ConnectionFactory;
import edu.jlxy.util.ResultSetUtil;

public class SearchFriend extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6963973765969517015L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		PrintWriter out = response.getWriter();
		////////////////////////////////////////
		
		UserEntity userEntity = new UserEntity();
		UserEntity userEntity2=UserEntity.getInstance();
		UserImpl userImpl = new UserImpl();
		userEntity.setuid1(request.getParameter("friendId"));
				
		FriendEntity friendEntity = new FriendEntity();
		FriendImpl friendImpl = new FriendImpl();
		friendEntity.setuid(userEntity2.getuid1());
		friendEntity.setfid(request.getParameter("friendId"));
				
		String forward = null;
		ResultSetUtil resultSetUtil = ResultSetUtil.getInstance();
		try {
			connection.setAutoCommit(false);
			ResultSet resultSet = userImpl.queryUId(connection, userEntity);			
			if (resultSet.next()) {
				
				String[][] result = resultSetUtil.getResultSet(resultSet, 1);
				if(userEntity.getuid1().equals(userEntity2.getuid1()))
				{	
					
					request.setAttribute("searchResult", "你无法添加自己为好友 (～￣▽￣)～");
					request.setAttribute("isExit", "false");
				}else {
					
					request.setAttribute("searchResult", result[0][0]);
					request.setAttribute("isExit", "true");
					
					//添加好友
					 ResultSet resultSet2 = friendImpl.queryMyFriendFid(connection, friendEntity);
					if (!resultSetUtil.isRepat(request.getParameter("friendId"), resultSet2)) {
						
						friendImpl.insert(connection, friendEntity);
						connection.commit();
					}else {
						request.setAttribute("searchResult", "已经是你的好友(～￣▽￣)～");
						request.setAttribute("isExit", "false");
					}

					
				}
				
			} else {
				
				request.setAttribute("searchResult", "没有查询到结果(～￣▽￣)～ ");
				request.setAttribute("isExit", "false");
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
					connection.close();
					System.out.println("=======连接关闭！=======");
					forward = "/AddFriend.jsp";					
					RequestDispatcher requestDispatcher = request.getRequestDispatcher(forward);
					requestDispatcher.forward(request, response);
//					
					return;
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		////////////////////////////////////////
		out.flush();
		out.close();
	}

}

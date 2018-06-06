package edu.jlxy.Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jlxy.Module.entity.DiaryEntity;
import edu.jlxy.Module.table.impl.DiaryImpl;
import edu.jlxy.util.ConnectionFactory;

public class DeleteDiary extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// 1 连接数据库
			ConnectionFactory cf = ConnectionFactory.getInstance();
			Connection connection = cf.makeConnection();
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");

			DiaryEntity diaryEntity = new DiaryEntity();
			DiaryImpl diaryImpl = new DiaryImpl();
			// HttpSession session = request.getSession();// 获取session
			// String curruentUser =
			// session.getAttribute("currentuser").toString();

			diaryEntity.setUserId(request.getParameter("userId"));
			diaryEntity.setTitle(request.getParameter("title"));

			diaryImpl.delete(connection, diaryEntity);

			response.sendRedirect("PersonalPage.jsp");

		} catch (SQLException ex) {
			Logger.getLogger(DeleteDiary.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);

	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.jlxy.Module.entity.DiaryEntity;
import edu.jlxy.Module.table.impl.DiaryImpl;
import edu.jlxy.util.ConnectionFactory;
import edu.jlxy.util.DateUtil_htb;

public class Diary_handle extends HttpServlet {



	
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 1 连接数据库
        ConnectionFactory cf = ConnectionFactory.getInstance();
        Connection connection = cf.makeConnection();
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        try {
            System.out.println(connection.getAutoCommit());
        } catch (SQLException e1) {
            e1.printStackTrace();
        }

        // 2  获得数据
        String title = request.getParameter("title");
        String content = request.getParameter("context");

        //  测试数据
        /*
        System.out.println("the title is "+title+"the content is "+content);
        PrintWriter pw=response.getWriter();
        pw.write("the title is "+title+"<br/>");
        pw.write("the conent is "+content+"<br/>");

         */
        //============================================================================
        //数据库 操作
        //(1)  封装实体
        DiaryEntity diaryEntity = new DiaryEntity();
        DateUtil_htb dateUtil_htb = new DateUtil_htb();
       // UserEntity userEntity=UserEntity.getInstance();
        
        
        //String curruentUser = userEntity.getuid1();
        HttpSession session = request.getSession();// 获取session
        String curruentUser = session.getAttribute("currentuser").toString();
        Date date = new Date(System.currentTimeMillis());
        String dateString = dateUtil_htb.getTime_String(date);
        
        diaryEntity.set_without_diaLd_without_permission(curruentUser, title, content, dateString);
        
        
 //(2) 将数据插入数据库  
        
        DiaryImpl di=new DiaryImpl();
        
        try {
			di.insert(connection, diaryEntity);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
        
        request.getRequestDispatcher("/HomePage.jsp").forward(request, response);
        
        
        

        
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);

    }

}

<%-- 
    Document   : SendDynamic
    Created on : 2018-5-26, 13:58:39
    Author     : 16221
--%>

<%@page import="edu.jlxy.Module.entity.UserEntity"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="edu.jlxy.Module.table.impl.SendDynamicImpl"%>
<%@page import="java.util.Collection"%>
<%@page import="edu.jlxy.Module.entity.SendDynamicEntity"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta http-equiv="pragma" content="no-cache">  
        <meta http-equiv="cache-control" content="no-cache">  
        <meta http-equiv="expires" content="0">      
        <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
        <meta http-equiv="description" content="This is my page">  

    </head>

    <body>

        <form action="/WeLife/SendDynamic_handle" method="post">
            title:<input type="text" name="title"><br/>

            content:<input type="text" name="content"><br/>
            photo:<input type="text" name="photo"><br/>

            <input type="submit" value="发送">
        </form>
        

        <%
        UserEntity userEntity=new UserEntity();
            session.setAttribute("currentuser", userEntity.getuid1());
          

        %>
       
    
    <%
        SendDynamicImpl sdi=new SendDynamicImpl();
        ArrayList<SendDynamicEntity> al=new ArrayList<SendDynamicEntity>();
        al=sdi.getList();
    %>
        
        
        
        <table border = 1px align = "center">  
        <tr>  
            <th>uid</th>  
            <th>did</th>  
            <th>title</th>  
            <th>content</th> 
            <th>photo</th>
            <th>date</th>
        </tr>  
        <!-- 继续使用jsp语句 循环放入存放于list中的Book实体类中的数据 -->  
        <%  
            for(int i = 0;i<al.size();i++){ 
                SendDynamicEntity sendDynamicEntity=(SendDynamicEntity)al.get(i);%>
                
                <tr> 
                    <th><%=sendDynamicEntity.getUid()%></th>
                    <th><%=sendDynamicEntity.getDid()%></th>
                    <th><%=sendDynamicEntity.getTitle()%></th>
                    <th><%=sendDynamicEntity.getContent()%></th>
                    <th><%=sendDynamicEntity.getPhoto()%></th>
                    <th><%=sendDynamicEntity.getDate()%></th><br/>
                    
         </tr>
             
       
        <% }  
         %>  
    </table> 




    </body>
</html>

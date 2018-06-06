<%@page import="edu.jlxy.Module.table.impl.FriendImpl"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="edu.jlxy.Module.entity.FriendEntity"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>FriendEdit</title>
<link href="css3/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="css3/style.css" rel='stylesheet' type='text/css' />

<!-- jQuery (necessary JavaScript plugins) -->
<script type='text/javascript' src="js/js2/jquery-1.11.1.min.js"></script>
<!-- Custom Theme files -->
<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800|Titillium+Web:400,600,700,300' rel='stylesheet' type='text/css'>
<!-- Custom Theme files -->
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Game Spot Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<style type="text/css">
input.btn1.btn-1.btn-1b {
	color: #FFF;
	border: none;
	background: #0dc5dd;
	padding: .5em 1.5em;
	font-size: 1em;
	outline: none;
	border: 2px solid #0dc5dd;
}
</style>
</head>
<body>
<!-- header -->
<div class="banner banner2">
  <div class="container">
    <div class="headr-right">
      <div class="details">
        <ul>
          <li><a href="mailto:@example.com"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>info(at)example.com</a></li>
          <li><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>(+1)000 123 456789</li>
        </ul>
      </div>
    </div>
    <div class="banner_head_top">
      <div class="logo">
        <h1><a href="HomePage.html">We<span class="glyphicon glyphicon-knight" aria-hidden="true"></span><span>Life</span></a></h1>
      </div>
      <div class="top-menu">
        <div class="content white">
          <nav class="navbar navbar-default"> 
            <!--<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>				
						 </div>--> 
            <!--/navbar header-->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
              <ul class="nav navbar-nav">
                <li ><a href="HomePage.html">Home</a></li>
                <li class="active"><a href="Diary.jsp">Diary</a></li>
                <li ><a href="AddFriend.jsp">New Friend</a></li>
                <li><a href="PersonalPage.jsp">My WeLife</a></li>
            <!--    <li><a href="shortcodes.html">Shortcodes</a></li>
                <li class="active">My WeLife</li>-->
              </ul>
            </div>
            <!--/navbar collapse--> 
          </nav>
          <!--/navbar--> 
        </div>
        <div class="clearfix"></div>
        <script type="text/javascript" src="js/js2/bootstrap-3.1.1.min.js"></script> 
      </div>
      <div class="clearfix"></div>
    </div>
  </div>
</div>
<!---->
<%

	request.setCharacterEncoding("UTF-8");
	String uid=request.getParameter("uid");
	String fid=request.getParameter("fid");
	FriendEntity friendEntity=new FriendEntity();//此处不需要getInstance（）方法，因为我不需要全局对象的数据。
	friendEntity.setuid(uid);
	friendEntity.setfid(fid);
	FriendImpl friendImpl=new FriendImpl();
	String[][] info =friendEntity.getTheFriendInfomation(friendEntity);	
 %>

<div class="contact">
  <div class="container">
    <h2>FriendEdit</h2>
    <div class="contact-form" style="margin-left:15rem">
     <p>修改好友信息：</p>
	<form action="<%=request.getContextPath()%>/FriendEdit" method="post">
		<table width="75%" border="1" align="center" style="border-color:transparent">
			<tr>
				<td>你的姓名</td>
				<td>
					<input type="text" name="uid" id="uid" width="300px" value=<%=info[0][0] %> readonly="readonly">
				</td>
				
			</tr>
		
			<tr>
				<td>好友</td>
				<td>
					<input type="text" name="fid" id="fid" width="300px" value=<%=info[0][1] %> readonly="readonly">
				</td>
				
			</tr>
			<tr>
				<td>标签1</td>
				<td>
				<input type="text" name="l1" id="l1" width="300px" value=<%=info[0][2] %> >
				</td>
			</tr>
			<tr>
				<td>标签2</td>
				<td><input type="text" name="l2" id="l2" width="300px" value=<%=info[0][3] %> ></td>
			</tr>
			<tr>
				<td>标签3</td>
				<td><input type="text" name="l3" id="l3" width="300px" value=<%=info[0][4] %> ></td>
			</tr>
			<tr>
				<td>标签4</td>
				<td><input type="text" name="l4" id="l4" width="300px" value=<%=info[0][5] %> ></td>
			</tr>
			<tr>
				<td>标签5</td>
				<td><input type="text" name="l5" id="l5" width="300px" value=<%=info[0][6] %> ></td>
			</tr>
			<tr>
				
				
				<td>   
					<input   class="btn1 btn-1 btn-1b" type="submit" name="button" id="button" width="300rem" value="提交" >
                 </td>
                 <td>
					<input   class="btn1 btn-1 btn-1b" type="reset" name="button2" id="button2" width="300rem" value="重置">
				</td>  
			</tr>

		</table>
        
	</form>
    </div>
  </div>
</div>
<!-- //contact --> 
<div class="copywrite">
  <div class="container">
    <p>Copyright &copy; 2018 WeLife 
          | Group No.11  - Designed by elites</p>
  </div>
</div>
<!---->

</body>
</html>
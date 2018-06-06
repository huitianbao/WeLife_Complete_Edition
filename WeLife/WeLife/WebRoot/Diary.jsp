<%-- 
    Document   : Diary
    Created on : 2018-6-2, 12:18:27
    Author     : 16221
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
<head>
<title>Diary</title>
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
                <li ><a href="HomePage.jsp">Home</a></li>
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
<div class="contact">
  <div class="container">
    <h2>Diary</h2>
    <div class="contact-form">
        <% session.setAttribute("permission", "2");%>
        
      <form action="<%=request.getContextPath()%>/Diary_handle" method="post">
        <input type="text" placeholder="Name" required name="title" autofocus>
        <textarea placeholder="Message" required name="context"></textarea>
        <button class="btn1 btn-1 btn-1b">Submit</button>
      </form>
    </div>
  </div>
</div>
<!-- //contact --> 
<div class="copywrite">
  <div class="container">
    <p>Copyright &copy; 2018 WeLife </p>
  </div>
</div>
<!---->

    </body>
</html>

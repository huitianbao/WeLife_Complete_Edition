<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	request.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>AddFriend</title>
<link href="css3/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="css3/style.css" rel='stylesheet' type='text/css' />

<!-- jQuery (necessary JavaScript plugins) -->
<script type='text/javascript' src="js3/jquery-1.11.1.min.js"></script>
<!-- Custom Theme files -->
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800|Titillium+Web:400,600,700,300'
	rel='stylesheet' type='text/css'>
<!-- Custom Theme files -->
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Game Spot Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript">addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);
	function hideURLbar() {
		window.scrollTo(0, 1);
	}
</script>
</head>
<body>
	<!-- header -->
	<div class="banner banner2">
		<div class="container">
			<div class="headr-right">
				<div class="details">
					<ul>
						<li><a href="mailto:@example.com"><span
								class="glyphicon glyphicon-envelope" aria-hidden="true"></span>info(at)example.com</a></li>
						<li><span class="glyphicon glyphicon-earphone"
							aria-hidden="true"></span>(+1)000 123 456789</li>
					</ul>
				</div>
			</div>
			<div class="banner_head_top">
				<div class="logo">
					<h1>
						<a href="HomePage.html">Game<span
							class="glyphicon glyphicon-knight" aria-hidden="true"></span><span>Spot</span></a>
					</h1>
				</div>
				<div class="top-menu">
					<div class="content white">
						<nav class="navbar navbar-default">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle"
								data-toggle="collapse"
								data-target="#bs-example-navbar-collapse-1">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>
						</div>
						<!--/navbar header-->
						<div class="collapse navbar-collapse"
							id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li><a href="HomePage.jsp">Home</a></li>
								<li><a href="Diary.jsp">Diary</a></li>
								<li class="active"><a href="AddFriend.jsp">New Friend</a></li>
								<li><a href="PersonalPage.jsp">My WeLife</a></li>
							</ul>
						</div>
						<!--/navbar collapse--> </nav>
						<!--/navbar-->
					</div>
					<div class="clearfix"></div>
					<script type="text/javascript" src="js3/bootstrap-3.1.1.min.js"></script>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!---->
	<div class="contact">
		<div class="container">
			<div class="contact-form">
				<h4>Search for friends</h4>
				<form action="SearchFriend" method="post">

					<input type="text" placeholder="FriendID" style="width:80%"
						name="friendId">
					<button type="submit" class="btn1 btn-1 btn-1b">Add</button>
				</form>
			</div>

			<%
				String str1 = "", str2 = "";
				if (request.getAttribute("isExit") == "false") {
					str1 = "";
					str2 = request.getAttribute("searchResult").toString();
				}

				else if (request.getAttribute("isExit") == "true") {
					str1 = "添加成功！";
					str2 = request.getAttribute("searchResult").toString();
				}
			%>

			<div class="container">
				
					<table width="50%" border="1" class="t1"
						style="border-bottom:4px black;border-top:transparent;border-right:transparent;border-left:transparent;font-size:20px"
						align="center">

						<tr>
							<td align="center"><input type="text" name="friendId"
								style="background:transparent;border:0" value=<%=str2%>></td>
							<td align="center"><button type="submit"
									class="btn1 btn-1 btn-1b"><%=str1%></button></td>
						</tr>
					</table>
				
			</div>
		</div>
	</div>
	<!-- //contact -->
	<div class="copywrite">
		<div class="container">
			<p>Copyright &copy; 2018 WeLife | Group No.11 - Designed by
				elites</p>
		</div>
	</div>
</body>
</html>

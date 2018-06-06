<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="edu.jlxy.Module.entity.DiaryEntity"%>
<%@page import="edu.jlxy.Module.table.impl.DiaryImpl"%>
<%@page import="edu.jlxy.Module.entity.UserEntity"%>
<%@page import="edu.jlxy.Module.entity.FriendEntity"%>
<%@page import="edu.jlxy.Module.table.impl.UserImpl"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="edu.jlxy.Module.entity.FriendEntity"%>
<%@page import="edu.jlxy.Module.entity.UserEntity"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.jlxy.Module.table.impl.FriendImpl"%>


<%@page import="edu.jlxy.Module.table.impl.SendDynamicImpl"%>
<%@page import="edu.jlxy.Module.entity.SendDynamicEntity"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.jlxy.Module.table.impl.DiaryImpl"%>
<%@page import="edu.jlxy.Module.entity.DiaryEntity"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<!-- <meta http-equiv="X-UA-Compatible" content="IE=edge"> -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">





<link rel="shortcut icon" href="favicon.ico">
<title>Weife - PersonalPage</title>
<link rel="stylesheet"
	href="font-awesome-4.6.3/css/font-awesome.min.css">
<link rel="stylesheet" href="css1/bootstrap.min.css">
<link rel="stylesheet" href="css1/hero-slider-style.css">
<link rel="stylesheet" href="css1/magnific-popup.css">
<link rel="stylesheet" href="css1/templatemo-style.css">
<style type="text/css">
.contact-form {
	margin: 3em 0 0;
	padng-bottom: 1em;
}

.contact-form input[type="text"] {
	splay: inline-block;
	background: none;
	border: 1.5px solid #6e6e6e;
	width: 100%;
	outline: none;
	padng: 10px 15px 10px 15px;
	font-size: .9em;
	font-weight: 400;
	color: #111111;
	margin-bottom: 1.5em;
}

.contact-form input[type="email"] {
	splay: inline-block;
	background: none;
	border: 1.5px solid #CBCBCB;
	width: 100%;
	outline: none;
	padng: 10px 15px 10px 15px;
	font-size: .9em;
	font-weight: 400;
	color: #111111;
	margin: 0 1.25em;
}

.contact-form textarea {
	background: none;
	border: 1.5px solid #6e6e6e;
	width: 100%;
	splay: block;
	height: 150px;
	outline: none;
	font-size: 0.9em;
	color: #111111;
	font-weight: 400;
	resize: none;
	padng: 10px 15px 10px 15px;
	margin-bottom: 2em;
}

button.btn1.btn-1.btn-1b {
	color: #FFF;
	border: none;
	background: #0dc5dd;
	padng: .5em 1.5em;
	font-size: 1em;
	outline: none;
	border: 2px solid #0dc5dd;
}

table {
	background-image: url(img/bgt.png);
	table-layout: fixed;
	empty-cells: show;
	border-collapse: collapse;
	margin: 0 auto;
}

td {
	height: 20px;
}

h1, h2, h3 {
	font-size: 12px;
	margin: 0;
	padng: 0;
}
/*这个是借鉴一个论坛的样式*/
table.t1 {
	border: 1px solid #9DB3C5;
	color: #666;
}

table.t1 th {
	background-repeat: :repeat-x;
	height: 30px;
}

table.t1 td, table.t1 th {
	border: 1px solid #ffffff;
	padng: 0 1em 0;
}
</style>
<body>

	<nav id="top">
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<strong style="font-size:25px">Welcome to Us!</strong>
			</div>
			<div class="col-md-6">
				<ul class="list-inline top-link link">
					<li><a href="HomePage.jsp" style="font-size:25px"><i
							class="fa fa-home"></i> Home</a></li>
				</ul>
			</div>
		</div>
	</div>
	</nav>


	<!-- Content -->
	<div class="cd-hero">
		<!-- Navigation -->
		<div class="cd-slider-nav">
			<nav class="navbar">
			<div
				class="collapse navbar-toggleable-sm text-xs-center text-uppercase tm-navbar"
				id="tmNavbar">
				<ul class="nav navbar-nav">
					<li class="nav-item "><a class="nav-link" href="#0"
						data-no="1">Friends <span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="#0" data-no="2">Community
					</a></li>
					<li class="nav-item active selected"><a class="nav-link"
						href="#0" data-no="3"> <%
 	//显示用户名
 	UserEntity userEntity = UserEntity.getInstance();
 	out.print(userEntity.getuid1());
 %>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="#0" data-no="4">Photos</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#0" data-no="5">Dairy</a>
					</li>
				</ul>
			</div>
			</nav>
		</div>
		<ul class="cd-hero-slider">
			<!-- autoplay -->
			<li><div class="cd-full-width" name="friend">
					<div class="container-fluid js-tm-page-content" data-page-no="2">
						<div class="row" style="margin-bottom:45rem;">
							<%
								//request.setCharacterEncong("UTF-8");
								FriendEntity friendEntity = FriendEntity.getInstance();
								List<FriendEntity> list = friendEntity.getList();
							%>
							<!-- 	<table width="55%" border="1" align="center"> -->
							<table width="90%" border="1" class="t1">
								<tr>

									<td>姓名</td>
									<td>标签1</td>
									<td>标签2</td>
									<td>标签3</td>
									<td>标签4</td>
									<td>标签5</td>
									<td></td>
									<td></td>
								</tr>
								<%
									for (FriendEntity friend : list) {
								%>
								<tr>

									<td><%=friend.getfid()%></td>
									<td><%=friend.getl1()%></td>
									<td><%=friend.getl2()%></td>
									<td><%=friend.getl3()%></td>
									<td><%=friend.getl4()%></td>
									<td><%=friend.getl5()%></td>


									<td><a
										href="Friendedit.jsp?uid=<%=friend.getuid()%>&fid=<%=friend.getfid()%>">设置标签</a></td>

									<td><a
										href="<%=request.getContextPath()%>/DeleteFriend?uid=<%=friend.getuid()%>&fid=<%=friend.getfid()%>">删除好友</a></td>
								</tr>
								<%
									}
								%>
							</table>

							<button class="btn1 btn-1 btn-1b"
								OnClick=" window.location='AddFriend.jsp'">Search</button>

						</div>
					</div>
				</div></li>
			<li><div class="cd-full-width">
					<div class="container-fluid js-tm-page-content" data-page-no="2">
						<div class="row">
							<div class="col-xs-12">

								<div id="fh5co-wrapper">
									<div id="fh5co-page">


										<!-- end:header-top -->
										<div id="fh5co-blog-section" class="fh5co-section-gray">

											<div class="container">
												<div class="row">

													<%	
														SendDynamicImpl s = new SendDynamicImpl();
														ArrayList<SendDynamicEntity> al = new ArrayList<SendDynamicEntity>();
														al = s.getList();

														//String currentuser = userEntity.getuid1();
														if (al.size() < 3) {
															for (int i = 0; i < al.size(); i++) {
																SendDynamicEntity sendDynamicEntity = (SendDynamicEntity) al.get(i);
																if (!sendDynamicEntity.getUid().equals(session.getAttribute("currentuser"))) {
																	continue;
																} else {
													%>
													<div class="col-lg-4 col-md-4">
														<div class="fh5co-blog animate-box">
															<a href="#"><img class="img-responsive"
																src="img/c4.jpg" alt=""></a>
															<div class="blog-text">
																<div class="prod-title">
																	<h3>
																		<a href="#"><%=al.get(i).getTitle()%></a>
																	</h3>
																	<span class="posted_by"><%=al.get(i).getDate()%></span>

																	<p><%=al.get(i).getContent()%></p>
																	<a href="#" class="btn btn-primary">Read More</a>
																</div>
															</div>
														</div>
													</div>
													<%
														}
															}
														} else {
															for (int i = al.size() - 3; i < al.size(); i++) {
																// for(int i =0;i<al.size();i++){
																SendDynamicEntity sendDynamicEntity = (SendDynamicEntity) al.get(i);
																if (!sendDynamicEntity.getUid().equals(session.getAttribute("currentuser"))) {
																	continue;
																} else {
													%>

													<div class="col-lg-4 col-md-4">
														<div class="fh5co-blog animate-box">
															<a href="#"><img class="img-responsive"
																src="img/c4.jpg" alt=""></a>
															<div class="blog-text">
																<div class="prod-title">
																	<h3>
																		<a href="#"><%=al.get(i).getTitle()%></a>
																	</h3>
																	<span class="posted_by"><%=al.get(i).getDate()%></span>

																	<p><%=al.get(i).getContent()%></p>
																	<a href="#" class="btn btn-primary">Read More</a>
																</div>
															</div>
														</div>
													</div>
													<%
														}
															}
														}
													%>



												</div>
											</div>
										</div>
									</div>
								</div>

							</div>
						</div>
					</div>
				</div> <!-- .cd-full-width --> 

			</li>

			<!-- Page 3 -->
			<li class="selected"><div class="cd-full-width">
					<div class="container-fluid js-tm-page-content" data-page-no="3">
						<div class="row">
							<div class="col-xs-12">
								<div
									class="tm-bg-white-translucent text-xs-left tm-textbox tm-textbox-1-col"width: 30%>
									<div class="contact-form">
										<h5 style="font-size:24px">So how is the day nigger</h5>


										<form action="/WeLife/SendDynamic_handle" method="post">
											<input type="text" name="title" placeholder="Title" >
											<textarea name="content" placeholder="Write something"
												required></textarea>
											<button class="btn1 btn-1 btn-1b">发表动态</button>
											<a class="btn1 btn-1 btn-1b"
												href="<%=request.getContextPath()%>/upLoad.jsp?title=<%=request%>">添加图片</a>

										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div></li>
			<li><div class="cd-full-width">
					<div class="container-fluid js-tm-page-content" data-page-no="4">
						<div class="row tm-img-gallery">
							<div class="col-xs-12 col-sm-6 col-md-4 col-lg-4 col-xl-4">
								<a href="img/tm-img-01.jpg"> <img src="img/tm-img-01-tn.jpg"
									alt="Image" class="img-fluid tm-img">
								</a>
							</div>
							<div class="col-xs-12 col-sm-6 col-md-4 col-lg-4 col-xl-4">
								<a href="img/tm-img-02.jpg"> <img src="img/tm-img-02-tn.jpg"
									alt="Image" class="img-fluid tm-img">
								</a>
							</div>
							<div class="col-xs-12 col-sm-6 col-md-4 col-lg-4 col-xl-4">
								<a href="img/tm-img-03.jpg"> <img src="img/tm-img-03-tn.jpg"
									alt="Image" class="img-fluid tm-img">
								</a>
							</div>
							<div class="col-xs-12 col-sm-6 col-md-4 col-lg-4 col-xl-4">
								<a href="img/tm-img-04.jpg"> <img src="img/tm-img-04-tn.jpg"
									alt="Image" class="img-fluid tm-img">
								</a>
							</div>
							<div class="col-xs-12 col-sm-6 col-md-4 col-lg-4 col-xl-4">
								<a href="img/tm-img-05.jpg"> <img src="img/tm-img-05-tn.jpg"
									alt="Image" class="img-fluid tm-img">
								</a>
							</div>
							<div class="col-xs-12 col-sm-6 col-md-4 col-lg-4 col-xl-4">
								<a href="img/tm-img-06.jpg"> <img src="img/tm-img-06-tn.jpg"
									alt="Image" class="img-fluid tm-img">
								</a>
							</div>
						</div>
					</div>
				</div></li>
			<li><div class="cd-full-width">
					<div class="container-fluid js-tm-page-content" data-page-no="5">
						<div class="row" style="margin-bottom:45rem;">
							<div class="tm-contact-page">
								<div class="row">
									<div class="col-xs-12">
										<!--<h2 class="tm-section-title">Contact Us</h2>
                                        <p class="tm-text tm-font-w-400 m-b-3">Pellentesque in quam iaculis erat iaculis lacinia. Donec sagittis sapien oo, a sodales divelit elementum nec. Donec feugiat purus a bibendum hendreit.</p>   -->
										<!--  /////////////////////////////////////////////////////////////////////////////////////////////// -->
										<%
											DiaryImpl diaryImpl = new DiaryImpl();
											DiaryEntity diaryEntity = new DiaryEntity();
											diaryEntity.setUserId(userEntity.getuid1());
											ArrayList<DiaryEntity> all = new ArrayList<>();
											all = diaryImpl.getList(diaryEntity);
										%>

										<table width="110%" border="1" class="t1" align="center">
											<tr>


												<th>title</th>
												<th>content</th>
												<th>date</th>

											</tr>


											<%
												for (DiaryEntity diary : all) {

													//DiaryEntity de = (DiaryEntity) all.get(i);

													System.out.println(diary.getTitle());
													System.out.println(diary.getUserId());
											%>

											<tr>

												<th><%=diary.getTitle()%></th>
												<th><%=diary.getContent()%></th>
												<th><%=diary.getDate()%></th>
												<th><a
													href="lookDiaryContent.jsp?Title=<%=diary.getTitle()%>&Content=<%=diary.getContent()%>">查看日记</a></th>

												<th><a
													href="<%=request.getContextPath()%>/DeleteDiary?title=<%=diary.getTitle()%>&userId=<%=diary.getUserId()%>">删除日记</a>
												</th>


											</tr>
											<%
												}
											%>


										</table>
									</div>
								</div>
							</div>
							<!-- contact form -->
							<div class="row"></div>
						</div>
					</div>
				</div> <!-- .cd-full-width --></li>
		</ul>
		<!-- .cd-hero-slider -->
	</div>
	<!-- .cd-hero -->

	<!-- Preloader, https://ihatetomatoes.net/create-custom-preloang-screen/ -->
	<div id="loader-wrapper">
		<div id="loader"></div>
		<div class="loader-section section-left"></div>
		<div class="loader-section section-right"></div>
	</div>

	<!-- load JS files -->
	<script src="js1/jquery-1.11.3.min.js"></script>
	<!-- jQuery (https://jquery.com/download/) -->
	<!--<script src="ja/tether.min.js"></script> <!-- Tether for Bootstrap (http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h) -->
	<script src="js1/bootstrap.min.js"></script>
	<!-- Bootstrap js (v4-alpha.getbootstrap.com/) -->
	<script src="js1/hero-slider-main.js"></script>
	<!-- Hero slider (https://codyhouse.co/gem/hero-slider/) -->
	<script src="js1/jquery.magnific-popup.min.js"></script>
	<!-- Magnific popup (http://msemenov.com/plugins/magnific-popup/) -->

	<script>
	
		function adjustHeightOfPage(pageNo) {
	
			// Get the page height
			var totalPageHeight = 15 + $('.cd-slider-nav').height()
			+ $(".cd-hero-slider li:nth-of-type(" + pageNo + ") .js-tm-page-content").height() + 160
			+ $('.tm-footer').height();
	
			// Adjust layout based on page height and window height
			if (totalPageHeight > $(window).height()) {
				$('.cd-hero-slider').addClass('small-screen');
				$('.cd-hero-slider li:nth-of-type(' + pageNo + ')').css("min-height", totalPageHeight + "px");
			} else {
				$('.cd-hero-slider').removeClass('small-screen');
				$('.cd-hero-slider li:nth-of-type(' + pageNo + ')').css("min-height", "100%");
			}
	
		}
	
		/*
		    Everything is loaded inclung images.
		*/
		$(window).load(function() {
	
			adjustHeightOfPage(1); // Adjust page height
	
			/* Gallery pop up
			-----------------------------------------*/
			$('.tm-img-gallery').magnificPopup({
				delegate : 'a', // child items selector, by clicking on it popup will open
				type : 'image',
				gallery : {
					enabled : true
				}
			});
	
			/* Collapse menu after click 
			-----------------------------------------*/
			$('#tmNavbar a').click(function() {
				$('#tmNavbar').collapse('hide');
	
				adjustHeightOfPage($(this).data("no")); // Adjust page height       
			});
	
			/* Browser resized 
			-----------------------------------------*/
			$(window).resize(function() {
				var currentPageNo = $(".cd-hero-slider li.selected .js-tm-page-content").data("page-no");
				adjustHeightOfPage(currentPageNo);
			});
	
			// Remove preloader
			// https://ihatetomatoes.net/create-custom-preloang-screen/
			$('body').addClass('loaded');
	
		});
	</script>
</body>
</html>
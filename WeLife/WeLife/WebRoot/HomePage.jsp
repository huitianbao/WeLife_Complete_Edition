<%-- 
    Document   : htb_index2
    Created on : 2018-5-28, 21:09:50
    Author     : 16221
--%>

<%@page import="edu.jlxy.Module.entity.UserEntity"%>
<%@page import="edu.jlxy.Module.entity.SendDynamicEntity"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.jlxy.Module.table.impl.SendDynamicImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css3/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css3/style.css" rel='stylesheet' type='text/css' />
        <link rel="stylesheet" href="css3/lightbox.css">

        <!-- jQuery (necessary JavaScript plugins) -->
        <script type='text/javascript' src="js3/jquery-1.11.1.min.js"></script>
        <!-- Custom Theme files -->
        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800|Titillium+Web:400,600,700,300' rel='stylesheet' type='text/css'>
        <!-- Custom Theme files -->
        <!--//theme-style-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Game Spot Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="banner">
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
                        <h1><a href="index.html">We<span class="glyphicon glyphicon-knight" aria-hidden="true"></span><span>Life</span></a></h1>
                    </div>
                    <div class="top-menu">
                        <div class="content white">
                            <nav class="navbar navbar-default">
                                <div class="navbar-header">
                                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
                                </div>
                                <!--/navbar header-->
                                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                                    <ul class="nav navbar-nav">
                                        <li class="active"><a href="HomePage.jsp">Home</a></li>
                                         <li><a href="Diary.jsp">Diary</a></li>
                                        <li ><a href="AddFriend.jsp">New Friend</a></li>
                                         <li><a href="PersonalPage.jsp">My WeLife</a></li>
                                         
                                          <li class="dropdown"> <a href="#" class="scroll dropdown-toggle" data-toggle="dropdown">Reviews<b class="caret"></b></a>
                                            <ul class="dropdown-menu">
                                                <li><a href="Diary.jsp">WriteDiary</a></li>
                                               
                                                <li><a href="upLoad.jsp">UploadPhoto</a></li>
                                            </ul>
                                        </li>
                                         
                                    </ul>
                                </div>
                                <!--/navbar collapse--> 
                            </nav>
                            <!--/navbar--> 
                        </div>
                        <div class="clearfix"></div>
                        <script type="text/javascript" src="js3/bootstrap-3.1.1.min.js"></script> 
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="banner-info">
                    <h3>Welcome to our Website</h3>
                    <h2>WeLife</h2>
                </div>
                <div class="social">
                    <ul>
                        <li><a href="#"><span class="fa"> </span></a></li>
                        <li><a href="#"><span class="tw"> </span></a></li>
                        <li><a href="#"><span class="g"> </span></a></li>
                        <li><a href="#"><span class="in"> </span></a></li>
                        <li><a href="#"><span class="pin"> </span></a></li>
                    </ul>
                    <div class="clearfix"></div>
                </div>
            </div>
        </div>
        <!---->
        <div class="welcome">
            <div class="container">
                <div class="welcome-info">
                    <h3>Welcome</h3>
                    <h4>Lorem ipsum dolor sit amet consectetur adipiscing elit.</h4>
                    <p>Morbi condimentum imperdiet placerat. Nullam in nisl eget turpis convallis venenatis. Cras cursus elementum justo nec bibendum. Donec quis nisi cursus, vestibulum elit eget, sagittis ligula.</p>
                </div>
            </div>
        </div>
        <!---->
        <div class="content">
            <div class="container">
                <div class="col-md-8 content-left"> 


                    <div class="games-grids">
                        <!-- \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ -->
                        <div class="game-grid-left">
                            <%
                            
                                SendDynamicImpl sdi = new SendDynamicImpl();
                                ArrayList<SendDynamicEntity> al = new ArrayList<SendDynamicEntity>();
                                al = sdi.getList();
                               // for (int i = 0;i<al.size();i++) {
                               for(int i=al.size()-1;i>=0;i--){
                                    SendDynamicEntity sde1 = al.get(i);
                            %>



                            <div class="grid2">
                                <h5 class="act"><a href="single.html"><%=sde1.getTitle()%></a></h5>
                                <a href="single.html"><img src="<%=sde1.getPhoto()%>" class="img-responsive" alt=""/></a>

                                <div class="grid1-info">
                                    <h4><a href="single.html"><%=sde1.getTitle()%></a></h4>
                                    <p><%=sde1.getContent()%>.</p>
                                </div>
                                <div class="more"> <a href="single.html">Read more</a> </div>
                            </div>
                            <%
                                }
                            %>
  



                        </div>

                        <!-- \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ -->

                        <!-- \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ -->

                        <div class="clearfix"></div>
                    </div>






                </div>
                <div class="copyrights">Collect from <a href="http://www.cssmoban.com/" ></a></div>
                <div class="col-md-4 content-right"> 
                    <!-- Nav tabs -->
                    <ul class="nav nav-tabs nav2" role="tablist">
                        <li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">Intimates</a></li>
                        <li role="presentation" ><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">Concerned</a></li>
                    </ul>

                    <!-- Tab panes -->
                    <div class="tab-content">
                        <div role="tabpanel" class="tab-pane active re-pad2" id="home">
                            <div class="game1">
                                <div class="col-md-3 tab-pic"> <a href="single.html"><img src="images/tr1.jpg" alt="/" class="img-responsive"></a> </div>
                                <div class="col-md-9 tab-pic-info">
                                    <h4><a href="single.html">CJ</a></h4>
                                    <p>Lorem Ipsum is simply dummy text of the printing industry.</p>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                            <div class="game1">
                                <div class="col-md-3 tab-pic"> <a href="single.html"><img src="images/tr3.jpg" alt="/" class="img-responsive"></a> </div>
                                <div class="col-md-9 tab-pic-info">
                                    <h4><a href="single.html">HTB</a></h4>
                                    <p>Lorem Ipsum is simply dummy text of the printing industry.</p>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                            <div class="game1">
                                <div class="col-md-3 tab-pic"> <a href="single.html"><img src="images/tr2.jpg" alt="/" class="img-responsive"></a> </div>
                                <div class="col-md-9 tab-pic-info">
                                    <h4><a href="single.html">LQL</a></h4>
                                    <p>Lorem Ipsum is simply dummy text of the printing industry.</p>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                            <div class="game1">
                                <div class="col-md-3 tab-pic"> <a href="single.html"><img src="images/tr2.jpg" alt="/" class="img-responsive"></a> </div>
                                <div class="col-md-9 tab-pic-info">
                                    <h4><a href="single.html">GJP</a></h4>
                                    <p>Lorem Ipsum is simply dummy text of the printing industry.</p>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                        <div role="tabpanel" class="tab-pane re-pad2" id="profile">
                            <div class="game-post">
                                <div class="col-md-3 tab-pic"> <a href="single.html"><img src="images/tr4.jpg" alt="/" class="img-responsive"></a> </div>
                                <div class="col-md-9 tab-post-info">
                                    <h4><a href="single.html">IronMan</a></h4>
                                    <p>Posted By <a href="#">Admin</a> &nbsp;&nbsp; on June 2, 2015 &nbsp;&nbsp; <a href="#">Comments (10)</a></p>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                            <div class="game-post">
                                <div class="col-md-3 tab-pic"> <a href="single.html"><img src="images/tr5.jpg" alt="/" class="img-responsive"></a> </div>
                                <div class="col-md-9 tab-post-info">
                                    <h4><a href="single.html">God Of War</a></h4>
                                    <p>Posted By <a href="#">Admin</a> &nbsp;&nbsp; on June 2, 2015 &nbsp;&nbsp; <a href="#">Comments (10)</a></p>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                            <div class="game-post">
                                <div class="col-md-3 tab-pic"> <a href="single.html"><img src="images/tr6.jpg" alt="/" class="img-responsive"></a> </div>
                                <div class="col-md-9 tab-post-info">
                                    <h4><a href="single.html">Need For Speed</a></h4>
                                    <p>Posted By <a href="#">Admin</a> &nbsp;&nbsp; on June 2, 2015 &nbsp;&nbsp; <a href="#">Comments (10)</a></p>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>

                    <div class="photo-gallery">
                        <h4>Photo Gallery</h4>
                        <div class="gallery-1">
                            <div class="col-md-4 gallery-grid-pic"> <a class="example-image-link" href="images/p2.jpg" data-lightbox="example-set"><img class="example-image" src="images/p2.jpg" alt=""/></a> </div>
                            <div class="col-md-4 gallery-grid-pic"> <a class="example-image-link" href="images/p1.jpg" data-lightbox="example-set"><img class="example-image" src="images/p1.jpg" alt=""/></a> </div>
                            <div class="col-md-4 gallery-grid-pic"> <a class="example-image-link" href="images/p3.jpg" data-lightbox="example-set"><img class="example-image" src="images/p3.jpg" alt=""/></a> </div>
                            <div class="clearfix"></div>
                        </div>
                        <div class="gallery-1">
                            <div class="col-md-4 gallery-grid-pic"> <a class="example-image-link" href="images/p4.jpg" data-lightbox="example-set"><img class="example-image" src="images/p4.jpg" alt=""/></a> </div>
                            <div class="col-md-4 gallery-grid-pic"> <a class="example-image-link" href="images/p5.jpg" data-lightbox="example-set"><img class="example-image" src="images/p5.jpg" alt=""/></a> </div>
                            <div class="col-md-4 gallery-grid-pic"> <a class="example-image-link" href="images/p6.jpg" data-lightbox="example-set"><img class="example-image" src="images/p6.jpg" alt=""/></a> </div>
                            <div class="clearfix"></div>
                        </div>
                        <div class="gallery-1">
                            <div class="col-md-4 gallery-grid-pic"> <a class="example-image-link" href="images/p1.jpg" data-lightbox="example-set"><img class="example-image" src="images/p1.jpg" alt=""/></a> </div>
                            <div class="col-md-4 gallery-grid-pic"> <a class="example-image-link" href="images/p3.jpg" data-lightbox="example-set"><img class="example-image" src="images/p3.jpg" alt=""/></a> </div>
                            <div class="col-md-4 gallery-grid-pic"> <a class="example-image-link" href="images/p4.jpg" data-lightbox="example-set"><img class="example-image" src="images/p4.jpg" alt=""/></a> </div>
                            <div class="clearfix"></div>
                        </div>
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
        <script src="js3/lightbox-plus-jquery.min.js"></script> 

        <!-- footer -->
        <div class="footer">
            <div class="container">
                <div class="footer-grids">
                    <div class="col-md-6 news-ltr">
                        <h4>Newsletter</h4>
                        <p>Aenean sagittis est eget elit pulvinar cursus. Lorem ipsum consectetur adipiscing elit. Phasellus non purus at risus consequat finibus.</p>
                        <form>
                            <input type="text" class="text" value="Enter Email" onFocus="this.value = '';" onBlur="if (this.value == '') {
                                        this.value = 'Enter Email';
                                    }">
                            <input type="submit" value="Subscribe">
                            <div class="clearfix"></div>
                        </form>
                    </div>
                    <div class="col-md-3 ftr-grid">
                        <h3>Categories</h3>
                        <ul class="ftr-list">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Racing</a></li>
                            <li><a href="#">Adventure</a></li>
                            <li><a href="#">Simulation</a></li>
                            <li><a href="#">Bike</a></li>
                        </ul>
                    </div>
                    <div class="col-md-3 ftr-grid">
                        <h3>Platform</h3>
                        <ul class="ftr-list">
                            <li><a href="#">Pc</a></li>
                            <li><a href="#">Ps4</a></li>
                            <li><a href="#">XBOX 360</a></li>
                            <li><a href="#">XBOX ONE</a></li>
                            <li><a href="#">PSP</a></li>
                        </ul>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
        </div>
        <!---->
        <div class="copywrite">
            <div class="container">
                <p>Copyright &copy; 卢其利 惠天宝 马泳博 程嘉 高健平 </p>
            </div>
        </div>
        <!---->


    </body>
</html>

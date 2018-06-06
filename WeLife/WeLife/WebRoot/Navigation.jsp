<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%String path=request.getContextPath(); 
String basePath = request.getScheme() + "://" 
+ request.getServerName() + ":" + request.getServerPort() 
+ path + "/";
%>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <meta http-equiv="X-UA-Compatible" content="IE=edge"> -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>WeLife - We create newlife</title>

<!-- load stylesheets -->
<!-- Google web font "Open Sans" -->
<!-- Google web font "Open Sans" -->
<link rel="stylesheet" href="font-awesome-4.5.0/css/font-awesome.min.css">
<!-- Font Awesome -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- Bootstrap style -->
<link rel="stylesheet" href="css/hero-slider-style.css">
<!-- Hero slider style -->
<link rel="stylesheet" href="css/templatemo-style.css">
<!-- Templatemo style -->

</head>

<body>
<section class="cd-hero">
  <ul class="cd-hero-slider autoplay">
    <!-- 
            	<ul class="cd-hero-slider autoplay"> for slider auto play 
                <ul class="cd-hero-slider"> for disabled auto play
            -->
    <li class="selected">
      <div class="cd-full-width">
        <div class="tm-slide-content-div"> 
          <!--<form action="untitled.html" id="search-form">--> 
          <i class="fa fa-cogs tm-slide-icon"></i>
          <h2 class="text-uppercase">WeLife</h2>
          <p class="m-b-mid">We is the new me</p>
          <div class="form-group"> </div>
          <a href="Login.jsp" class="cd-btn">Login</a> 
          <!--<button type="submit" class="cd-btn" >Login</button>--> 
          
        </div>
      </div>
      <!-- .cd-full-width --> 
    </li>
    <li>
      <div class="cd-full-width">
        <div class="tm-slide-content-div"> <i class="fa fa-compass tm-slide-icon"></i>
          <h2 class="text-uppercase">WeLife</h2>
          <p>On this site we want to focus on the good WeLife: Knowing God, finding the one, happy family and life-giving communities.</p>
          <a href="Signup.jsp" class="cd-btn">Sign up</a> </div>
      </div>
      <!-- .cd-full-width --> 
    </li>
    <li>
      <div class="cd-full-width">
        <div class="tm-slide-content-div"> <i class="fa fa-cloud tm-slide-icon"></i>
          <h2 class="text-uppercase">WeLife</h2>
          <p class="tm-site-description">The road to happiness is WeLife</p>
          <div class="form-group"> </div>
          <a href="Navigation.jsp" class="cd-btn">Just Watch</a> </div>
      </div>
      <!-- .cd-full-width --> 
    </li>
  </ul>
  <!-- .cd-hero-slider -->
  
  <div class="cd-slider-nav">
    <nav> <span class="cd-marker item-1"></span>
      <ul>
        <li class="selected"><a href="#0"></a></li>
        <li><a href="#0"></a></li>
        <li><a href="#0"></a></li>
      </ul>
    </nav>
  </div>
  <!-- .cd-slider-nav --> 
</section>
<!-- .cd-hero --> 

<!-- Contact section -->
<section class="tm-bg-purple tm-section">
  <div class="container-fluid tm-section-5-inner">
    <div class="row">
      <div class="col-xs-12 text-xs-center">
        <div class="tm-social-icons-container"> <a href="#" class="tm-social-icon-link"><i class="fa fa-facebook tm-social-icon"></i></a> <a href="#" class="tm-social-icon-link"><i class="fa fa-google-plus tm-social-icon"></i></a> <a href="#" class="tm-social-icon-link"><i class="fa fa-twitter tm-social-icon"></i></a> <a href="#" class="tm-social-icon-link"><i class="fa fa-behance tm-social-icon"></i></a> <a href="#" class="tm-social-icon-link"><i class="fa fa-linkedin tm-social-icon"></i></a> </div>
      </div>
    </div>
    <div class="row">
      <footer class="col-xs-12 text-xs-center">
        <p class="tm-text-white tm-copyright-text">Copyright &copy; 2018 WeLife 
          | Group No.11  - Designed by elites</p>
        <p class="tm-text-white tm-copyright-text"> <em>Group Members:</em> <em><a href="PersonalPage.html">LuQL | </a></em> <em><a href="PersonalPage.html">HuiTB | </a></em> <em><a href="PersonalPage.html">ChenJ | </a></em> <em><a href="PersonalPage.html">MaYB | </a></em> <em><a href="PersonalPage.html">GaoJP </a></em> </p>
      </footer>
    </div>
  </div>
</section>

<!-- load JS files --> 
<script src="js/jquery-1.11.3.min.js"></script> <!-- jQuery (https://jquery.com/download/) --> 
<script src="js/tether.min.js"></script> <!-- Tether for Bootstrap (http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h) --> 
<script src="js/bootstrap.min.js"></script> <!-- Bootstrap js (v4-alpha.getbootstrap.com/) --> 
<script src="js/hero-slider-script.js"></script> <!-- Hero slider (https://codyhouse.co/gem/hero-slider/) --> 
<script src="js/jquery.touchSwipe.min.js"></script> <!-- http://labs.rampinteractive.co.uk/touchSwipe/demos/ --> 
<script>     
       
            $(document).ready(function(){

                /* Auto play bootstrap carousel 
                * http://stackoverflow.com/questions/13525258/twitter-bootstrap-carousel-autoplay-on-load
                -----------------------------------------------------------------------------------------*/                
                $('.carousel').carousel({
                  interval: 3000
                })

                /* Enable swiping carousel for tablets and mobile
                 * http://lazcreative.com/blog/adding-swipe-support-to-bootstrap-carousel-3-0/
                 ---------------------------------------------------------------------------------*/
                if($(window).width() <= 991) {
                    $(".carousel-inner").swipe( {
                        //Generic swipe handler for all directions
                        swipeLeft:function(event, direction, distance, duration, fingerCount) {
                            $(this).parent().carousel('next'); 
                        },
                        swipeRight: function() {
                            $(this).parent().carousel('prev'); 
                        },
                        //Default is 75px, set to 0 for demo so any distance triggers swipe
                        threshold:0
                    });
                }  

                /* Handle window resize */
                $(window).resize(function(){
                    if($(window).width() <= 991) {
                        $(".carousel-inner").swipe( {
                            //Generic swipe handler for all directions
                            swipeLeft:function(event, direction, distance, duration, fingerCount) {
                                $(this).parent().carousel('next'); 
                            },
                            swipeRight: function() {
                                $(this).parent().carousel('prev'); 
                            },
                            //Default is 75px, set to 0 for demo so any distance triggers swipe
                            threshold:0
                        });
                     }
                });                             
            });

        </script>
</body>
</html>
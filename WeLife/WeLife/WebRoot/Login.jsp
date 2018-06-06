<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<% String path=request.getContextPath(); %>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<!-- <meta http-equiv="X-UA-Compatible" content="IE=edge"> -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Flat - Responsive HTML Template</title>
<!-- load stylesheets -->
<!-- <link rel="stylesheet" href="http://fonts.useso.com/css?family=Open+Sans:300,400"> -->
<!-- Google web font "Open Sans" -->
<link rel="stylesheet" href="font-awesome-4.6.3/css/font-awesome.min.css">
<!-- Font awesome -->
<link rel="stylesheet" href="css1/bootstrap.min.css">
<!-- Bootstrap style -->
<link rel="stylesheet" href="css1/hero-slider-style.css">
<!-- Hero slider style (https://codyhouse.co/gem/hero-slider/) -->
<link rel="stylesheet" href="css1/magnific-popup.css">
<!-- Magnific popup style (http://dimsemenov.com/plugins/magnific-popup/) -->

<link rel="stylesheet" href="css1/templatemo-style.css">

<body>

<!-- Content -->
<div class="cd-hero">
  <ul class="cd-hero-slider">
    <!-- autoplay -->
    <li class="selected">
      <div class="cd-full-width">
        <div class="container-fluid js-tm-page-content" data-page-no="5">
          <div class="tm-contact-page">
            <div class="row">
              <div class="col-xs-12">
                <h2 class="tm-section-title">Welcome back to us</h2>
                <p class="tm-text tm-font-w-400 m-b-3">The Bible tell us how to live WeLife</p>
              </div>
            </div>
            
            <!-- contact form -->
            <div class="row" >
              <form action="<%=request.getContextPath()%>/Login" method="post" class="tm-contact-form" >
                <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 col-xl-6" >
                  <div class="form-group">
                  
                    <input type="text" id="name" name="username" class="form-control" placeholder="Your Name"  style="margin-left:20rem" required/>
                  </div>
                  <div class="form-group">
                    <input  type="password" id="psd" name="password" class="form-control" placeholder="Your Password"  style="margin-left:20rem"  required/>
                  </div>
                </div>        
                <div class="col-xs-12">
                  <button type="submit" class="pull-xs-centre tm-submit-btn">Login</button>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
      <!-- .cd-full-width --> 
    </li>
  </ul>
  <!-- .cd-hero-slider --> 
  
</div>
<!-- .cd-hero --> 

<!-- Preloader, https://ihatetomatoes.net/create-custom-preloading-screen/ -->
<div id="loader-wrapper">
  <div id="loader"></div>
  <div class="loader-section section-left"></div>
  <div class="loader-section section-right"></div>
</div>

<!-- load JS files --> 
<script src="js1/jquery-1.11.3.min.js"></script> <!-- jQuery (https://jquery.com/download/) --> 
<!--<script src="ja/tether.min.js"></script> <!-- Tether for Bootstrap (http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h) --> 
<script src="js1/bootstrap.min.js"></script> <!-- Bootstrap js (v4-alpha.getbootstrap.com/) --> 
<script src="js1/hero-slider-main.js"></script> <!-- Hero slider (https://codyhouse.co/gem/hero-slider/) --> 
<script src="js1/jquery.magnific-popup.min.js"></script> <!-- Magnific popup (http://dimsemenov.com/plugins/magnific-popup/) --> 

<script>

            function adjustHeightOfPage(pageNo) {
               
                // Get the page height
                var totalPageHeight = 15 + $('.cd-slider-nav').height()
                                        + $(".cd-hero-slider li:nth-of-type(" + pageNo + ") .js-tm-page-content").height() + 160
                                        + $('.tm-footer').height();

                // Adjust layout based on page height and window height
                if(totalPageHeight > $(window).height()) 
                {
                    $('.cd-hero-slider').addClass('small-screen');
                    $('.cd-hero-slider li:nth-of-type(' + pageNo + ')').css("min-height", totalPageHeight + "px");
                }
                else 
                {
                    $('.cd-hero-slider').removeClass('small-screen');
                    $('.cd-hero-slider li:nth-of-type(' + pageNo + ')').css("min-height", "100%");
                }

            }

            /*
                Everything is loaded including images.
            */
            $(window).load(function(){

                adjustHeightOfPage(1); // Adjust page height

                /* Gallery pop up
                -----------------------------------------*/
                $('.tm-img-gallery').magnificPopup({
                    delegate: 'a', // child items selector, by clicking on it popup will open
                    type: 'image',
                    gallery:{enabled:true}                
                });

                /* Collapse menu after click 
                -----------------------------------------*/
                $('#tmNavbar a').click(function(){
                    $('#tmNavbar').collapse('hide');

                    adjustHeightOfPage($(this).data("no")); // Adjust page height       
                });

                /* Browser resized 
                -----------------------------------------*/
                $( window ).resize(function() {
                    var currentPageNo = $(".cd-hero-slider li.selected .js-tm-page-content").data("page-no");
                    adjustHeightOfPage( currentPageNo );
                });
        
                // Remove preloader
                // https://ihatetomatoes.net/create-custom-preloading-screen/
                $('body').addClass('loaded');
                           
            });

        </script>
</body>
</html>
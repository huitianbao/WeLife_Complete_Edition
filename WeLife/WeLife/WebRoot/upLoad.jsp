

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>upload.jsp</title>
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
    <h2>UpLoad Photo</h2>
    <div class="contact-form">
       
        <font color="red">${msg }</font>
       <form action="${pageContext.request.contextPath }/UploadServlet" method="post" enctype="multipart/form-data" onsubmit="return checkFiles()">
    		<table border="1">
    			<tbody>
    			<tr>
    				<th>请选择文件</th>
    				<td><input type="file" name="attachment" onchange="change(event)"/><input type="text" name="info1"/>
    			</td>
    			</tr>
    			</tbody>
    		
    			<tr>
    				<td colspan="2"><input type="submit" value="上传"/></td>
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
   <script type="text/javascript">

  		//判断所有file是否已经选中，如果任何一个没有选择，则该函数返回false，这时表单不能提交
  		function checkFiles(){
  			var fileList = document.getElementsByName("attachment");
  			for(var i=0;i<fileList.length;i++){
  				//该file组件没有选文件
  				if(fileList[i].value==null || fileList[i].value==""){
  					alert("你的第"+(i+1)+"个文件没有选择！！！");
  					return false;
  				}
  			}
  			return true;
  		}
  		
  		function change(ev){       
         var event = window.event || ev;
         var files = event.target.files[0];
         var myimg = document.getElementById("myimg");
         myimg.src = URL.createObjectURL(files);
         myimg.hidden="";
         
         
}

  </script>
</html>

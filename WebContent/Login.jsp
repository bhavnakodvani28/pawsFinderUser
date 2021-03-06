
<!-- <form action="AdminLoginServlet" method="POST">
            <label for="email" class="sr-only">Email</label>
            <input type="text" class="form-control" name="email" placeholder="Your Email" required="">
            <label for="password"  class="sr-only">Password</label>
            <input type="password" class="form-control" name="password" placeholder="Your Password" required="">
            <input type="submit" class="btn btn-primary btn-block" value="Login">
        </form>
-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
   
<!-- Mirrored from www.ingridkuhn.com/themes/unitedpets/boxed/contact.php by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 10 Dec 2020 12:39:18 GMT -->
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=UTF-8" /><!-- /Added by HTTrack -->
<head>
      <meta charset="utf-8">
      <!--[if IE]>
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <![endif]-->
      <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
      <meta name="description" content="">
      <meta name="author" content="">
      <!-- page title -->
      <title>PawsFinder</title>
      <!--[if lt IE 9]>
      <script src="/js/respond.js"></script>
      <![endif]-->
      <!-- Font files -->
      <link href="https://fonts.googleapis.com/css?family=Roboto:400,600,700%7CMontserrat:400,500,600,700" rel="stylesheet">
      <link href="fonts/flaticon/flaticon.css" rel="stylesheet" type="text/css">
      <link href="fonts/fontawesome/fontawesome-all.min.css" rel="stylesheet" type="text/css">
      <!-- Fav icons -->
      <link rel="apple-touch-icon" sizes="57x57" href="apple-icon-57x57.png">
      <link rel="apple-touch-icon" sizes="72x72" href="apple-icon-72x72.png">
      <link rel="apple-touch-icon" sizes="114x114" href="apple-icon-114x114.png">
      <link rel="shortcut icon" type="image/x-icon" href="favicon.ico">
      <!-- Bootstrap core CSS -->
      <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
      <!-- style CSS -->
      <link href="css/style.css" rel="stylesheet">
      <!-- plugins CSS -->
      <link href="css/plugins.css" rel="stylesheet">
      <!-- Colors CSS -->
      <link href="styles/maincolors.css" rel="stylesheet">
	  <!-- LayerSlider CSS -->
      <link rel="stylesheet" href="vendor/layerslider/css/layerslider.css">

    <style>  

								#top {
									max-width:1200px;
									margin:0 auto;
									box-shadow: 10px 10px 100px -19px rgba(0,0,0,0.75);
									background:#fff;
									}
								#top .navbar, 
								#top .top-bar,                        
								#top #slider,
								#top #nav,
								#top footer,
								#top #video-header{
									max-width:1200px;
									margin:0 auto!important;
								}
								#call-widget.container-fluid {
									padding-right: 15px!important;
									padding-left: 15px!important;
								}
</style><!-- Switcher Only -->
      <link rel="stylesheet" id="switcher-css" type="text/css" href="switcher/css/switcher.css" media="all" />
      <!-- END Switcher Styles -->

	        <!-- Demo Examples (For Module #3) -->
	  <link rel="alternate stylesheet" type="text/css" href="styles/maincolors.css" title="maincolors" media="all" />
      <link rel="alternate stylesheet" type="text/css" href="styles/tinypaws.css" title="tinypaws" media="all" />
	  <link rel="alternate stylesheet" type="text/css" href="styles/veterinarian.css" title="veterinarian" media="all" />
      <link rel="alternate stylesheet" type="text/css" href="styles/agility.css" title="agility" media="all" />
	   <link rel="alternate stylesheet" type="text/css" href="styles/superpet.css" title="superpet" media="all" />
	   <link rel="alternate stylesheet" type="text/css" href="styles/mymascot.css" title="mymascot" media="all" />
	   	   <link rel="alternate stylesheet" type="text/css" href="switcher/css/boxed.css" title="boxed" media="all" />
	   	   <link rel="alternate stylesheet" type="text/css" href="switcher/css/full.css" title="full" media="all" />
		   <!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-76370337-2"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-76370337-2');
</script>
<!-- Google Tag Manager -->
<script>(function(w,d,s,l,i){w[l]=w[l]||[];w[l].push({'gtm.start':
new Date().getTime(),event:'gtm.js'});var f=d.getElementsByTagName(s)[0],
j=d.createElement(s),dl=l!='dataLayer'?'&l='+l:'';j.async=true;j.src=
'../../../../www.googletagmanager.com/gtm5445.html?id='+i+dl;f.parentNode.insertBefore(j,f);
})(window,document,'script','dataLayer','GTM-T7ZJPV8');</script>
<!-- End Google Tag Manager -->
   </head>
   <!-- ==== body starts ==== -->
   <body id="top">
    
      <div id="preloader">
         <div class="container h-100">
            <div class="row h-100 justify-content-center align-items-center">
               <div class="preloader-logo">
                  <!--logo -->
                  <img src="img/logo.png" alt="" class="img-fluid">
                  <!--preloader circle -->
                  <div class="lds-ring">
                     <div></div>
                     <div></div>
                     <div></div>
                     <div></div>
                  </div>
               </div>
               <!--/preloader logo -->
            </div>
            <!--/row -->
         </div>
         <!--/container -->
      </div>
      <!--/Preloader ends -->
      <nav id="main-nav" class="navbar-expand-xl fixed-top">
         <div>
            <!-- Navbar Starts -->
            <div class="navbar container-fluid">
               <div class="container ">
                  <!-- logo -->
                  <a class="nav-brand" href="index.html">
                  <img src="img/logo.png" alt="" class="img-fluid">
                  </a>
                  <!-- Navbartoggler -->
                  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggle-icon">
                  <i class="fas fa-bars"></i>
                  </span>
                  </button>
                  
                  <!--collapse -->
               </div>
               <!-- /container -->
            </div>
            <!-- /navbar -->
         </div>
         <!--/row -->
      </nav>
      <!-- /nav --><!-- Jumbotron -->
<div class="jumbotron jumbotron-fluid" data-center="background-size: 100%;"
   data-top-bottom="background-size: 110%;">
   <div class="container" >
      <!-- jumbo-heading -->
      <div class="jumbo-heading" data-aos="fade-up">
         <h1>LogIn</h1>
      </div>
      <!-- /jumbo-heading -->
   </div>
   <!-- /container -->
</div>
<!-- /jumbotron -->
<!-- ==== Page Content ==== -->
<div class="page container">
   <div class="row">
            <div class="contact-info col-lg-12 mt-5 res-margin">
            <%
                   if(session.getAttribute("id")!=null)
                   {
                	   response.sendRedirect("index.jsp");
                   }
             %>
             
               <center><h3>Log In</h3></center>
               <!-- Form Starts -->
               <center>               <form action="UserLoginServlet" method="POST">
               <div id="contact_form">
                  <div class="form-group">
                     <div class="row">
                     <div class="col-md-3"></div>
                        <div class="col-md-6">
                           <label>Email Address <span class="required">*</span></label>
                           <input type="email" name="email" class="form-control input-field" required=""> 
                        </div>
                     </div>
                     <div class="row">
                     <div class="col-md-3"></div>
                        <div class="col-md-6">
                           <label>Password<span class="required">*</span></label>
                           <input type="password" name="password" class="input-field form-control" required="">
                        </div>
                     </div>
                     <div class="row">
                        <div class="col-md-3"></div> 
                        <div class="col-md-3">
                           <button type="submit" id="submit_btn" value="Submit" class="btn btn-secondary">Login</button>
                        </div>
                         <div class="col-md-3">
                            <a class="nav-link active btn btn-secondary" href="Signup.jsp">Sign Up?</a>
                        </div>
                     </div>
                  </div>
                  <!-- /form-group-->
               </div>
               </center>
               
               </form>
             
               <!-- /contact)form-->
            </div>
            <!-- /contact-info-->
         </div>
         <!-- /row-->
         <!-- map-->
      <!--   <div id="map-canvas" class="mt-5 map-small-height container"></div>-->
         <!-- /map-->
      </div>

<!-- ==== footer ==== -->
<footer class="bg-light pattern1">
   <div class="container">
      <div class="row">
         <div class="col-lg-3 text-center ">
            <img src="img/logo.png"  class="logo-footer img-fluid" alt=""/>
            <!-- Start Social Links -->
            <ul class="social-list text-center list-inline">
               <li class="list-inline-item"><a title="Facebook" href="#"><i class="fab fa-facebook-f"></i></a></li>
               <li class="list-inline-item"><a title="Twitter" href="#"><i class="fab fa-twitter"></i></a></li>
               <li class="list-inline-item"><a  title="Instagram" href="#"><i class="fab fa-instagram"></i></a></li>
            </ul>
            <!-- /End Social Links -->
         </div>
         <!--/ col-lg -->
         <div class="col-lg-3">
            <h5>About us</h5>
            <!--divider -->
            <hr class="small-divider left"/>
            <p class="mt-3">We are here to help you to adopt a dog.</p>
         </div>
         <!--/ col-lg -->
         <div class="col-lg-3">
            <h5>Contact Us</h5>
            <!--divider -->
            <hr class="small-divider left"/>
            <ul class="list-unstyled mt-3">
               <li class="mb-1"><i class="fas fa-phone margin-icon "></i>7788747485</li>
               <li class="mb-1"><i class="fas fa-envelope margin-icon"></i><a href="bhavnakodvani12@gmail.com">bhavnakodvani12@gmail.com"</a></li>
               <li><i class="fas fa-map-marker margin-icon"></i>Maninagar Station -Ahmedabad</li>
            </ul>
            <!--/ul -->
         </div>
         <!--/ col-lg -->
         <div class="col-lg-3">
            <h5>Working Hours</h5>
            <!--divider -->
            <hr class="small-divider left"/>
            <ul class="list-unstyled mt-3">
               <li class="mb-1">Open from 9am - 6pm</li>
               <li class="mb-1">Holidays - Closed</li>
               <li>Weekends - Closed</li>
            </ul>
            <!--/ul -->
         </div>
         <!--/ col-lg -->
      </div>
      <!--/ row-->
      <hr/>
      <!--<div class="row">
         <div class="credits col-sm-12">
            <p>Copyright 2019 / Designed by <a href="http://www.ingridkuhn.com/">Ingrid Kuhn</a></p>
         </div>
      </div>-->
      <!--/col-lg-12-->
   </div>
   <!--/ container -->
   <!-- Go To Top Link -->
   <div class="page-scroll hidden-sm hidden-xs">
      <a href="#top" class="back-to-top"><i class="fa fa-angle-up"></i></a>
   </div>
   <!--/page-scroll-->
</footer>
<!--/ footer-->

<!-- Bootstrap core & Jquery -->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!-- Custom Js -->
<script src="js/custom.js"></script>
<script src="js/plugins.js"></script>
<!-- Prefix free -->
<script src="js/prefixfree.min.js"></script>
 <!-- Bootstrap Select Tool (For Module #4) -->
<script src="switcher/js/bootstrap-select.js"></script>
<!-- All Scripts & Plugins -->
<script src="switcher/js/dmss.js"></script>
<!-- Google Tag Manager (noscript) -->
<noscript><iframe src="https://www.googletagmanager.com/ns.html?id=GTM-T7ZJPV8"
height="0" width="0" style="display:none;visibility:hidden"></iframe></noscript>
<!-- End Google Tag Manager (noscript) -->


<!-- maps -->
<script src="js/map.js"></script>
</body>

<!-- Mirrored from www.ingridkuhn.com/themes/unitedpets/boxed/contact.php by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 10 Dec 2020 12:39:18 GMT -->
</html>
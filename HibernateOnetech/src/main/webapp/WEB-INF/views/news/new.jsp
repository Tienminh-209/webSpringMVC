<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>News</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Template by FREEHTML5.CO" />
	<meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
	<meta name="author" content="FREEHTML5.CO" />

	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="favicon.ico">
	<!-- Google Fonts -->
	<link href='http://fonts.googleapis.com/css?family=Playfair+Display:400,700,400italic|Roboto:400,300,700' rel='stylesheet' type='text/css'>
	<!-- Animate -->
	<link rel="stylesheet" href="resources/news/css/animate.css">
	<!-- Icomoon -->
	<link rel="stylesheet" href="resources/news/css/icomoon.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="resources/news/css/bootstrap.css">

	<link rel="stylesheet" href="resources/news/css/style.css">


	<!-- Modernizr JS -->
	<script src="resources/news/js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="resources/news/js/respond.min.js"></script>
	<![endif]-->

	</head>
	<body>
	<div id="fh5co-offcanvas">
		<a href="#" class="fh5co-close-offcanvas js-fh5co-close-offcanvas"><span><i class="icon-cross3"></i> <span>Close</span></span></a>
		<div class="fh5co-bio">
			<figure>
				<img src="resources/news/images/person1.jpg" alt="Free HTML5 Bootstrap Template" class="img-responsive">
			</figure>
			<h3 class="heading">About Me</h3>
			<h2>Tiến Minh</h2>
			<p>Đẹp Trai </p>
			<ul class="fh5co-social">
				<li><a href="#"><i class="icon-twitter"></i></a></li>
				<li><a href="#"><i class="icon-facebook"></i></a></li>
				<li><a href="#"><i class="icon-instagram"></i></a></li>
			</ul>
		</div>

		<div class="fh5co-menu">
			<div class="fh5co-box">
				<h3 class="heading">Categories</h3>
				<ul>
					<li><a href="#">Travel</a></li>
					<li><a href="#">Style</a></li>
					<li><a href="#">Photography</a></li>
					<li><a href="#">Food &amp; Drinks</a></li>
					<li><a href="#">Culture</a></li>
				</ul>
			</div>
			<div class="fh5co-box">
				<h3 class="heading">Search</h3>
				<form action="#">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Type a keyword">
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- END #fh5co-offcanvas -->
	<header id="fh5co-header">
		
		<div class="container-fluid">

			<div class="row">
				<a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>
				<ul class="fh5co-social">
					<li><a href="#"><i class="icon-twitter"></i></a></li>
					<li><a href="#"><i class="icon-facebook"></i></a></li>
					<li><a href="#"><i class="icon-instagram"></i></a></li>
				</ul>
				<div class="col-lg-12 col-md-12 text-center">
					<h1 id="fh5co-logo"><a href="index.html">News<sup>TM</sup></a></h1>
				</div>

			</div>
		
		</div>

	</header>
	<!-- END #fh5co-header -->
	<div class="container-fluid">
		<div class="row fh5co-post-entry">
		    <c:forEach var="news" items="${allnews}">
			<article class="col-lg-3 col-md-3 col-sm-3 col-xs-6 col-xxs-12 animate-box">
				<figure>
					<a href="news_detail.jsp"><img src="${pageContext.request.contextPath}/resources/news/${news.getImages_news() }"class="img-responsive" ></a>
				</figure>
				<span class="fh5co-meta"><a href="${pageContext.request.contextPath}/detail/${news.getId_news() }">${news.getName_news() }</a></span>
			</article>
			<div class="clearfix visible-xs-block"></div>
			</c:forEach>
		</div>
	</div>

	<footer id="fh5co-footer">
		<p><small>&copy; 2016. Magazine Free HTML5. All Rights Reserverd. <br> Designed by <a href="http://freehtml5.co" target="_blank">FREEHTML5.co</a>  Demo Images: <a href="http://unsplash.com/" target="_blank">Unsplash</a></small></p>
	</footer>


	
	<!-- jQuery -->
	<script src="resources/news/js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="resources/news/js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="resources/news/js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="resources/news/js/jquery.waypoints.min.js"></script>
	<!-- Main JS -->
	<script src="resources/news/js/main.js"></script>

	</body>
</html>


<!DOCTYPE html>
<html>
<head>
	<title> Homepage | E-shelf</title>
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css" rel="stylesheet">
	<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css" rel="stylesheet">
	<link href="css/homepage.css" rel="stylesheet" type="text/css">
</head>
<body>
    <%
        if(session.getAttribute("username")== null){
            response.sendRedirect("loginpage.html");
        }
    %>
    
    
<div class="heading font">
	<h1 class="txt">E-Shelf</h1>
</div>
<div id="navbar" class="bar font">
	<ul>
	  <li><a class="active" href="homepage.html">Home</a></li>
	  <li><a href="books.html">Books</a></li>
	  <li><a href="#">Contact</a></li>
	  <li class="right"><a href="logout.jsp">Logout</a></li>
	  <li class="right cart"><a href="cart.html"><span class="fa fa-shopping-cart"> </span>&ensp;Cart</a></li>
	</ul>
</div>
<div class="col-12 body content">
	<div class="col-md-3 side_menu">
		<div class="year">
			<h2 style="text-align: center;">Year Of Study</h2>
			<ul>
				<li><a href="#">1st year</a></li>
				<li><a href="#">2nd year</a></li>
				<li><a href="#">3rd year</a></li>
				<li><a href="#">4th year</a></li>
			</ul>
		</div>
		<hr style="border-top: 1px solid #337ab7; width: 80%;">
		<div class="books">
			<h2 style="text-align: center;">Most Searched books</h2>
			<ul>
				<li><a href="#">C by Balaguru Swamy</a></li>
				<li><a href="#">Java</a></li>
				<li><a href="#">OS</a></li>
				<li><a href="#">CD</a></li>
			</ul>
		</div>
	</div>
	<div class="col-md-8 content">
		<div class="col-md-12">
			<div class="col-md-4 book">
				<h4 class="book_heading">C Programming By Balaguru Swamy</h4>
				<p>This is the best book for beginners to get basic knowledge in C language. The terminology used in this book is very much easier for students to understand and grasp....</p>
				<h4 class="price">&#8377;450</h4>
				<div class="col-md-12 buttons">
					<div class="col-md-6 buy_now_button"><a href="#">Add to Cart</a></div>
					<div class="col-md-6 detail_button"><a href="#">Details</a></div>
				</div>
			</div>
			<div class="col-md-4 book">
				<h4 class="book_heading">Java - The complete Reference</h4>
				<p>This is the best book for beginners to get basic knowledge in JAVA language. The terminology used in this book is very much easier for students to understand and grasp....</p>
				<h4 class="price">&#8377;640</h4>
				<div class="col-md-12 buttons">
					<div class="col-md-6 buy_now_button"><a href="#">Add to Cart</a></div>
					<div class="col-md-6 detail_button"><a href="#">Details</a></div>
				</div>
			</div>
		</div>
		<div class="col-md-12">
			<div class="col-md-4 book">
				<h4 class="book_heading">Operating Systems</h4>
				<p>This is the best book for beginners to get basic knowledge in OS. The terminology used in this book is very much easier for students to understand and grasp....</p>
				<h4 class="price">&#8377;570</h4>
				<div class="col-md-12 buttons">
					<div class="col-md-6 buy_now_button"><a href="#">Add to Cart</a></div>
					<div class="col-md-6 detail_button"><a href="#">Details</a></div>
				</div>
			</div>
			<div class="col-md-4 book">
				<h4 class="book_heading">Data Base Management System</h4>
				<p>This is the best book for beginners to get basic knowledge in DBMS. The terminology used in this book is very much easier for students to understand and grasp....</p>
				<h4 class="price">&#8377;740</h4>
				<div class="col-md-12 buttons">
					<div class="col-md-6 buy_now_button"><a href="#">Add to Cart</a></div>
					<div class="col-md-6 detail_button"><a href="#">Details</a></div>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="col-md-12 footer">
	<div class="col-md-2 content_left">
		<ul>
			<li><a>Terms & conditions</a></li>
			<li><a>FAQs</a></li>
			<li><a>Customer Service</a></li>
		</ul>
	<div>
</div>


<script src="js/store.js"></script>


</body>
</html>
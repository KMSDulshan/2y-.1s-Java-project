<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
       

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Register Page</title>
    <link rel="stylesheet" href="CSS/Profile1.css" />
  </head>
  <body>
   <nav>
        <header> 
          <img class="logo" src="CSS/Logo.png" alt="logo " />
          <nav>
            <ul class="nav__links">
              <li>
              <a href="http://localhost:8090/AdminDemo/HomeAfterLogin.jsp">Home</a>
              <a href="http://localhost:8090/AdminDemo/FilmLogin.jsp">Videos</a>
              <a href="http://localhost:8090/Feedback/AddFeedback.jsp">FeedBack</a>
              <a href="http://localhost:8090/AdminDemo/AdminLogin.jsp">Admin</a>
              </li>
            </ul>
          </nav>
        <a href="http://localhost:8090/User/Login.jsp" class="cta">
        	<button>Profile</button>
        </a>
        </header>
       
      </nav>
      <br> <br> <br>
      <div class="left">
        <div class="right-half">
          <div class="profile-icon">
            <img src="CSS/Image2.webp" alt="Profile Icon" />
          </div>
          
	
	
	
	 <c:forEach var="cus" items="${cusDetails}">
	 
			<c:set var="id" value="${ cus.id}" />
			<c:set var="username" value="${ cus.username}" />
			<c:set var="name" value="${ cus.name}" />
			<c:set var="feedback" value="${ cus.feedback}" />
			
	
	<h2>
	
	 UserName: ${cus.username}<br>
	  Name: ${cus.name}<br>
	  FeedBack:  ${cus.feedback}<br>
	
	</h2>
	
	

	</c:forEach>
	
	<c:url value="Update.jsp" var="cusupdate">
	<c:param name="id" value="${id}"/>
	<c:param name="username" value="${username}"/>
	<c:param name="name" value="${name}"/>
	<c:param name="feedback" value="${feedback}"/>
	 </c:url>
	
	 <c:url value="Delete.jsp" var="cusdelete">
	<c:param name="id" value="${id}"/>
	<c:param name="username" value="${username}"/>
	<c:param name="name" value="${name}"/>
	<c:param name="feedback" value="${feedback}"/>
	 </c:url>
	 

	          <a href="${cusupdate }"><button name="update" >Update Your Feedback</button></a>
               <a href="${cusdelete }"><button name="delete">Delete</button></a>
         <a href="http://localhost:8090/User/Home.jsp"><button>Home</button></a> 
        </div>
        </div>
     <br><br><br>
<!--Footer-->
    <div className="ft">
      <footer class="footer">
        <div class="container">
          <div class="row">
            <div class="footer-col">
              <h4><b>Discover</b></h4>
              <ul>
                <li><a href="#">Home</a></li>
                <li><a href="#">Categories</a></li>
                <li><a href="#">About Us</a></li>
                <li><a href="#">Contact Us</a></li>
              </ul>
            </div>
            <div class="footer-col">
              <h4><b>About</b></h4>
              <ul>
                <li><a href="#">Clients</a></li>
                <li><a href="#">Team</a></li>
                <li><a href="#">Career</a></li>
                <li><a href="#">Journal</a></li>
              </ul>
            </div>
            <div class="footer-col">
              <h4><b>Help</b></h4>
              <ul>
                <li><a href="#">Privacy Policy</a></li>
                <li><a href="#">Terms & Conditions</a></li>
                <li><a href="#">Partners</a></li>
                <li><a href="#">Legalty</a></li>
              </ul>
            </div>
            <div class="footer-col">
              <h4><b>Follow us</b></h4>
              <div class="social-links">
                <a href="#"><i class="fab fa-facebook-f"></i></a>
                <a href="#"><i class="fab fa-twitter"></i></a>
                <a href="#"><i class="fab fa-instagram"></i></a>
                <a href="#"><i class="fab fa-linkedin-in"></i></a>
              </div>
            </div>
          </div>
        </div>
      </footer>
    </div>
    
    
  </body>
</html>


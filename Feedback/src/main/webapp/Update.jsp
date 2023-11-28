<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Edit Profile Page</title>
    <link rel="stylesheet" href="CSS/update.css" />
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
   <br><br><br>
  <%
    String id = request.getParameter("id");
    String username = request.getParameter("username");
	String name = request.getParameter("name");  
	String feedback = request.getParameter("feedback");
 %>
   
  <div class="upleft">
    <div class="upcontainer">

      <div class="right-half">
        <h1>EDIT YOUR Feedback</h1>
        <br>
        
        <form  action="update" method="post">
        
        <div class="form-group">
            <label for="username">User ID</label>
            <input type="text" id="username" name="cusid" value="<%= id %>"  readonly />
          </div>
          <br>
          <div class="form-group">
            <label for="username">User Name</label>
            <input type="text" id="username" name="uname" value= "<%= username %>" />
          </div>
          <br>
          <div class="form-group">
            <label for="email">Email</label>
            <input type="name" id="name" name="name" value= "<%=  name %>" />
          </div>
          <br>
          <div class="form-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="feedback" value="<%= feedback%>"  />
          </div>
          <br>
          <div class="form-group checkbox-agreement">
            <tr>
              <td>
                <input
                  type="checkbox"
                  id="agreement"
                  name="agreement"
                  class="chec"
                  required
                />
              </td>
              
              <td>
                <label for="agreement"
                    >I agree to the
                    <a href="#" class="g">Terms and Services</a></label
                  >
              </td>
            </tr>
          </div>
          <button type="submit" class="upbtn">Update</button>
        </form>
        
        
      </div>
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

package com.Admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FilmInsertServlet")
public class FilmInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String filmname = request.getParameter("filmname");
		String filtype = request.getParameter("filtype");
		String filmtime = request.getParameter("filmtime");
		String filmdate = request.getParameter("filmdate");
		String filmurl = request.getParameter("filmurl");
		String filmdescription = request.getParameter("filmdescription");
		
		boolean isTrue;
		
		isTrue = AdminDBUtil.insertfilm(filmname, filtype, filmtime, filmdate, filmurl, filmdescription);
		if (isTrue == true) {

			String alertMessage = "Submit Successful";
		    response.getWriter().println("<script>alert('" + alertMessage + "'); window.location.href='FilmLogin.jsp';</script>");
		   
		} 
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("Unsucessfull.jsp");
			dis2.forward(request, response);
		}
	}

}

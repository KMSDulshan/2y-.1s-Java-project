package com.Admin;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FilmLoginServlet")
public class FilmLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 List<Film> allFilms = AdminDBUtil.getAllFilms(); // Modify AdminDBUtil to fetch all records.
	     request.setAttribute("allFilms", allFilms);
	        
	     RequestDispatcher dispatcher = request.getRequestDispatcher("FilmAllDisplay.jsp");
	     dispatcher.forward(request, response);
		
		
	}

}
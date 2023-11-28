package com.Admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FilmUpdateSerclet")
public class FilmUpdateSerclet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String filmid = request.getParameter("filmid");
		String filmname = request.getParameter("filmname");
		String filtype = request.getParameter("filtype");
		String filmtime = request.getParameter("filmtime");
		String filmdate = request.getParameter("filmdate");
		String filmurl = request.getParameter("filmurl");
		String filmdescription = request.getParameter("filmdescription");
		
		boolean isTrue;
		
		isTrue =  AdminDBUtil.updateFilm(filmid, filmname, filtype, filmtime, filmdate, filmurl, filmdescription);
		
		if (isTrue == true) {

			List<Film> film = AdminDBUtil.getFilmDetails(filmid);
			request.setAttribute("film", film);
			
			RequestDispatcher dis = request.getRequestDispatcher("FilmAccount.jsp");
			dis.forward(request, response);
		} 
		else {
			

			RequestDispatcher dis2 = request.getRequestDispatcher("FilmAccount.jsp");
			dis2.forward(request, response);
		}
	}

}

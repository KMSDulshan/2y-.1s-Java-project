package com.Admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteFilmServlet")
public class DeleteFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String filmid = request.getParameter("filmid");
		boolean isTrue;
		
		isTrue = AdminDBUtil.deleteFilm(filmid);
		
		if (isTrue == true) {
			String alertMessage = "Account Delete Successful";
		    response.getWriter().println("<script>alert('" + alertMessage + "'); window.location.href='FilmLogin.jsp';</script>");
		   
		}
		else {
			List<Film> film = AdminDBUtil.getFilmDetails(filmid);
			request.setAttribute("film",film);
			
			RequestDispatcher dispacther = request.getRequestDispatcher("Unsucessfull.jsp");
			dispacther.forward(request, response);
		}
	}

}

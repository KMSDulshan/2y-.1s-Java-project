package com.Admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FilmSearchServlet")
public class FilmSearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
        String username = request.getParameter("fid");
        String password = request.getParameter("fpass");
       

		
		try {
			List<Film> film = AdminDBUtil.filmvalidate(username, password);
			request.setAttribute("film", film);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
			RequestDispatcher dis = request.getRequestDispatcher("FilmAccount.jsp");
			dis.forward(request,response);
        
        
        
        

    }
}

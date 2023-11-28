package com.feedback;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FeedbackInsert")
public class FeedbackInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String name = request.getParameter("name");
		String feedback = request.getParameter("feedback");
		
		boolean isTrue;
		
		isTrue = FeedbackDBUtil.insertcustomer(username, name, feedback);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("SearchFeedback.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}

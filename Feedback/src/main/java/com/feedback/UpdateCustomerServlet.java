package com.feedback;



import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateCustomerServlet")
public class UpdateCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("cusid");
		String username = request.getParameter("uname");
		String name = request.getParameter("name");
		String feedback = request.getParameter("feedback");
		
		boolean isTrue;
		
		isTrue = FeedbackDBUtil.updatecustomer(id, username, name, feedback);
		
		if(isTrue == true) {
			
			List<Feedback> cusDetails = FeedbackDBUtil.getCustomerDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("DisplayFeedback.jsp");
			dis.forward(request, response);
		}
		else {
			List<Feedback> cusDetails = FeedbackDBUtil.getCustomerDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("DisplayFeedback.jsp");
			dis.forward(request, response);
		}
	}

}

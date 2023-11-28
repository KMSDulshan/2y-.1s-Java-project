package com.feedback;

public class Feedback {
    private int id;
    private String username;
    private String name;
    private String feedback;
    
   
	public Feedback(int id, String username, String name, String feedback) {
		
		this.id = id;
		this.username = username;
		this.name = name;
		this.feedback = feedback;
	}


	public int getId() {
		return id;
	}


	
	public String getUsername() {
		return username;
	}


	
	public String getName() {
		return name;
	}



	public String getFeedback() {
		return feedback;
	}


	

	

	

	  
}

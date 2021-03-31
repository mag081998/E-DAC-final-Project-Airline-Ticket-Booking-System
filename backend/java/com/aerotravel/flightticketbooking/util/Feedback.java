package com.aerotravel.flightticketbooking.util;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Feedback {
	
	@NotNull
	private String name;
	@NotNull
	@Email
	private String email;
	@NotNull
	@Min(10)
	private String feedback;
	
	public Feedback() {
		System.out.println("in the cnst of "+getClass().getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
}

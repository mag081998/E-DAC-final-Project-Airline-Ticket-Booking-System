package com.aerotravel.flightticketbooking.util;

import org.springframework.beans.factory.annotation.Value;

public class EmailCgf {
	
		@Value("${spring.mail.host}")
		private String host;
		@Value("${spring.mail.port}")
		private int port;
		@Value("${spring.mail.username}")
		private String username;
		@Value("${spring.mail.password}")
		private String password;
		
		public EmailCgf() {
			
			System.out.println("in the cnst of "+getClass().getName());
		}

		public String getHost() {
			return host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public int getPort() {
			return port;
		}

		public void setPort(int port) {
			this.port = port;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		
}

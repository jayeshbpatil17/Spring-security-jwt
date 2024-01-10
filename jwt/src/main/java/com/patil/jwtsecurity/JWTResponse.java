package com.patil.jwtsecurity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
public class JWTResponse {

	private String jwtToken;
	private String username;
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public JWTResponse(String jwtToken, String username) {
		super();
		this.jwtToken = jwtToken;
		this.username = username;
	}

	public JWTResponse() {
		
	}
	
//	 public static JWTResponseBuilder builder() {
//	        return new JWTResponseBuilder();
//	    }
//	 public static class JWTResponseBuilder {
//	        private String jwtToken;
//	        private String username;
//
//	        private JWTResponseBuilder() {
//	        }
//
//	        public JWTResponseBuilder jwtToken(String jwtToken) {
//	            this.jwtToken = jwtToken;
//	            return this;
//	        }
//
//	        public JWTResponseBuilder username(String username) {
//	            this.username = username;
//	            return this;
//	        }
//
//	        public JWTResponse build() {
//	            return new JWTResponse(jwtToken, username);
//	        }
//	    }
	

}

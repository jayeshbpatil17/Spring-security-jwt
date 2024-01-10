package com.patil.jwtsecurity;

import lombok.Builder;

@Builder
public class JWTRequest {

	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public JWTRequest(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public JWTRequest() {
		
	}
	
//	public static JWTRequestBuilder builder() {
//        return new JWTRequestBuilder();
//    }
//
//    public static class JWTRequestBuilder {
//        private String email;
//        private String password;
//
//        private JWTRequestBuilder() {
//        }
//
//        public JWTRequestBuilder email(String email) {
//            this.email = email;
//            return this;
//        }
//
//        public JWTRequestBuilder password(String password) {
//            this.password = password;
//            return this;
//        }
//
//        public JWTRequest build() {
//            return new JWTRequest(email, password);
//        }
//    }
//	
}

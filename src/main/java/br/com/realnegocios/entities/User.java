package br.com.realnegocios.entities;

public class User {
	
	private String userName;
	private String password;
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}


	public final String getUserName() {
		return userName;
	}


	public final void setUserName(String userName) {
		this.userName = userName;
	}


	public final String getPassword() {
		return password;
	}


	public final void setPassword(String password) {
		this.password = password;
	}
	
	
	

}

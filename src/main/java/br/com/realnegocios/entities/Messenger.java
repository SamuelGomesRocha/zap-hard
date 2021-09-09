package br.com.realnegocios.entities;

public class Messenger {

	private int idMessage;
	private String message;
	private User user;
	
	public Messenger() {
		
	}
	
	public Messenger(String message) {
		super();
		this.message = message;
	}

	public Messenger(String message, User user) {
		super();
		this.message = message;
		this.user = user;
	}

	public final int getIdMessage() {
		return idMessage;
	}

	public final void setIdMessage(int idMessage) {
		this.idMessage = idMessage;
	}

	public final String getMessage() {
		return message;
	}

	public final void setMessage(String message) {
		this.message = message;
	}

	public final User getUser() {
		return user;
	}

	public final void setUser(User user) {
		this.user = user;
	}
	
	
	
}

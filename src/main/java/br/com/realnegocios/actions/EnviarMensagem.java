package br.com.realnegocios.actions;

import br.com.realnegocios.services.ChromeConnector;
import br.com.realnegocios.services.MessageSender;

public class EnviarMensagem extends ChromeConnector {

	
	public static void main(String[] args) {
	  MessageSender msn = new MessageSender();
			  msn.startConversation("put the number here", "put the message here");	
	}
	
	
}

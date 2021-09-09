package br.com.realnegocios.actions;

import br.com.realnegocios.services.ChromeConnector;
import br.com.realnegocios.services.MessageSender;

public class EnviarMensagem extends ChromeConnector {

	
	public static void main(String[] args) {
	  MessageSender msn = new MessageSender();
			  msn.startConversation("556492926284", "teste");	
	}
	
	
}

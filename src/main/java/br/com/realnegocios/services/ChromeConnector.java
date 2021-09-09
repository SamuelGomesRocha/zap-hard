package br.com.realnegocios.services;

import javax.servlet.http.WebConnection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeConnector {

	protected WebDriver browser;
	
	
	protected void initConnection() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\samuel.rocha\\OneDrive - Teodoro e Caetano\\Documentos\\Personal documents 2021\\Projects\\projeto-final-daw-I-main\\projeto-final-daw-I-main\\drivers\\chromedriver.exe");
		browser = new ChromeDriver();
	}
	
	/*
	 * API to connect in WhatsApp without saved contacts
	 * 
	 * https://api.whatsapp.com/send?phone="put the phone here";
	 * 
	 * */
	
	
	
}

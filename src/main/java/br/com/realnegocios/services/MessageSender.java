package br.com.realnegocios.services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MessageSender extends ChromeConnector {
	

	public void startConversation(String number, String message) {
//		Actions act = new Actions(browser);
		//Inicia a conexão com o chromedriver.exe
		initConnection();
		browser.get("https://web.whatsapp.com/send?phone="+number);
	//	WebElement btnIniciarConversa =  browser.findElement(By.className("_36or _2y_c _2z0c _2z07"));
		//Element que provavelmente foca: _1UWac _1LbR4
		WebElement sendMessage = browser.findElement(By.xpath("//div[@class='_13NKt copyable-text selectable-text']"));
		sendMessage.click();
		sendMessage.sendKeys(message);
//		WebElement btnSend = browser.findElement(By.className("_4sWnG"));
//		btnSend.click();
	}

	public void sendMessage(String message) {
	
		
	}
	
	
}

package br.com.samarone.appium.page.seuBarriga;

import org.openqa.selenium.By;

import br.com.samarone.core.BasePage;

public class SBLoginPage extends BasePage {
	
	public void setEmail(String email) {
		escrever(By.className("android.widget.EditText"), email);
	}
	
	public void setSenha(String senha) {
		escrever(By.xpath("//android.widget.EditText[2]"), senha);
	}
	
	public void entrar() {
		clicarPorTexto("ENTRAR");
	}
	

}

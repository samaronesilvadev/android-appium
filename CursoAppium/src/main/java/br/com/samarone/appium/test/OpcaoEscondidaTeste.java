package br.com.samarone.appium.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.samarone.appium.page.MenuPage;
import br.com.samarone.core.BaseTest;
import static br.com.samarone.core.DriverFactory.getDriver;
import junit.framework.Assert;

public class OpcaoEscondidaTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	
	@Test
	public void deveEncontrarOpcaoEscondida() {
		//scroll down
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
		System.out.println("Começando");
		
		menu.scrollDown();
		
		//clicar menu
		menu.clicarPorTexto("Opção bem escondida");
		
		//verificar mensagem
		Assert.assertEquals("Você achou essa opção", menu.obterMensagemAlerta());
		
		//sair
		menu.clicarPorTexto("OK");
		
		
	}
}

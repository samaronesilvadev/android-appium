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
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formul�rio']")));
		System.out.println("Come�ando");
		
		menu.scrollDown();
		
		//clicar menu
		menu.clicarPorTexto("Op��o bem escondida");
		
		//verificar mensagem
		Assert.assertEquals("Voc� achou essa op��o", menu.obterMensagemAlerta());
		
		//sair
		menu.clicarPorTexto("OK");
		
		
	}
}

package br.com.samarone.appium.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.samarone.appium.page.MenuPage;
import br.com.samarone.appium.page.SplashPage;
import br.com.samarone.core.BaseTest;

public class SplashTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SplashPage page = new SplashPage();

	@Test
	public void deveAguardarSplashSumir() {
		//acessar menu splash
		menu.acessarSplash();
		
		//verificar que o splash esta sendo exibido
		page.isTelaSplashVisivel();
		
		//aguardar a saida do splash
		page.aguardarSplashSumir();
		
		//verificar que o formulário está aparecendo
		Assert.assertTrue(page.existeElementoPorTexto("Formulário"));
		
		
	}
}

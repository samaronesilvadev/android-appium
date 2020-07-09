package br.com.samarone.appium.test;

import org.junit.Test;

import br.com.samarone.appium.page.MenuPage;
import br.com.samarone.appium.page.WebViewPage;
import br.com.samarone.core.BaseTest;

public class WebViewTeste extends BaseTest{
	
	private MenuPage menu = new MenuPage();
	private WebViewPage page = new WebViewPage();
	
	@Test
	public void deveFazerLogin() {
		//Acessar menu
		menu.acessarSBHibrido();
		esperar(3000);
		page.entrarContextoWeb();
		
		//preencher email
		page.setEmail("a@a");
		
		//senha
		
		//entrar
		
		//verificar
		
	}

}

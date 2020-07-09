package br.com.samarone.appium.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.samarone.appium.page.AbasPage;
import br.com.samarone.appium.page.MenuPage;
import br.com.samarone.core.BaseTest;

public class AbasTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private AbasPage page = new AbasPage();
	
	@Test
	public void deveInteragirComAbas() {
		//acessar menus abas
		menu.acessarAbas();
		
		//verificar que esta na aba 1
		Assert.assertTrue(page.isAba1());
		
		//acessar aba 2
		page.selecionarAba2();
		
		//verificar que esta na aba 2
		Assert.assertTrue(page.isAba2());
		
		
		
	}
}

package br.com.samarone.appium.test;

import org.junit.Test;

import br.com.samarone.appium.page.AccordionPage;
import br.com.samarone.appium.page.MenuPage;
import br.com.samarone.core.BaseTest;
import junit.framework.Assert;

public class AccordionTeste extends BaseTest{

	private MenuPage menu = new MenuPage();
	private AccordionPage page = new AccordionPage();
	
	@Test
	public void deveInteragirComAccordion() {
		
		//acessar menu
		menu.acessarAccordion();
		
		//clicar na opção 1
		page.clicarOp1();
		
		//verificar texto na opção 1
		esperar(1000);
		Assert.assertEquals("Esta é a descrição da opção 1", page.obterValorOp1());
	}
}

package br.com.samarone.appium.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.samarone.appium.page.MenuPage;
import br.com.samarone.core.BaseTest;

public class SwipeTeste extends BaseTest {

	
	private MenuPage menu = new MenuPage();
	
	@Test
	public void deveRealizarSwipe() {
		//acessar menu
		menu.acessarSwipe();
		
		//verificar texto 'a esquerda'
		Assert.assertTrue(menu.existeElementoPorTexto("a esquerda"));
		
		//swipe para direita
		menu.swipeRight();
		
		//verificar text 'E veja se'
		Assert.assertTrue(menu.existeElementoPorTexto("E veja se"));
		
		//clicar bot�o direito
		menu.clicarPorTexto("�");
		
		
		//verificar texto 'Chegar at� o fim!'
		Assert.assertTrue(menu.existeElementoPorTexto("Chegar at� o fim!"));
		
		
		//swipe esquerda
		menu.swipeLeft();
		
		//clicar no bot�o esquerda
		menu.clicarPorTexto("�");
		
		//verificar texto 'a esquerda'
		Assert.assertTrue(menu.existeElementoPorTexto("a esquerda"));
		
	}
}

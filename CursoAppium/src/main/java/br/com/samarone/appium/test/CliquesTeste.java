package br.com.samarone.appium.test;

import org.junit.Before;
import org.junit.Test;

import br.com.samarone.appium.page.CliquesPage;
import br.com.samarone.appium.page.MenuPage;
import br.com.samarone.core.BaseTest;
import junit.framework.Assert;

public class CliquesTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private CliquesPage page = new CliquesPage();

	@Before
	public void setup() {
		// acessar menu
		menu.acessarCliques();
	}

	@Test
	public void deveRealizarCliqueLongo() {
		// clique longo
		page.cliqueLongo();

		// verificar texto
		Assert.assertEquals("Clique Longo", page.obterTextoCampo());
	}

	@Test
	public void deveRealizarCliqueDuplo() {
		esperar(1000);
		page.clicarPorTexto("Clique duplo");
		page.clicarPorTexto("Clique duplo");
		
		Assert.assertEquals("Duplo Clique", page.obterTextoCampo());
		
	}
}

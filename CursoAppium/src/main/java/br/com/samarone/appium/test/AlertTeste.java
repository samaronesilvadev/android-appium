package br.com.samarone.appium.test;

import org.junit.Before;
import org.junit.Test;

import br.com.samarone.appium.page.AlertPage;
import br.com.samarone.appium.page.MenuPage;
import br.com.samarone.core.BaseTest;
import junit.framework.Assert;

public class AlertTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private AlertPage page = new AlertPage();

	@Before
	public void setup() {
		// acessar menu alerta
		menu.acessarAlertas();

	}

	@Test
	public void deveConfirmarAlerta() {

		// clicar em alerta confirm
		page.clicarAlertaConfirm();

		// verificar os textos
		Assert.assertEquals("Info", page.obterTituloAlerta());

		Assert.assertEquals("Confirma a operação?", page.obterMensagemAlerta());

		// confirmar alerta
		page.confirmar();

		// verificar nova mensagem
		Assert.assertEquals("Confirmado", page.obterMensagemAlerta());

		// sair
		page.sair();

	}

	@Test
	public void deveClicarForaAlerta() {
		// clicar alerta simples
		page.clicarAlertaSimples();

		// clicar fora da caixa
		page.clicarForaCaixa();

		// verificar que a mensagem não está presente
		Assert.assertFalse(page.existeElementoPorTexto("Pode clicar no OK ou fora da caixa para sair"));

	}
}

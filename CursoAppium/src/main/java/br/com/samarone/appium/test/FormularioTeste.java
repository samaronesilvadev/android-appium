package br.com.samarone.appium.test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.samarone.appium.page.FormularioPage;
import br.com.samarone.appium.page.MenuPage;
import br.com.samarone.core.BaseTest;
import br.com.samarone.core.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FormularioTeste extends BaseTest {

	private AndroidDriver<MobileElement> driver;
	private MenuPage menu = new MenuPage();
	private FormularioPage page = new FormularioPage();

	@Before
	public void inicializarAppium() throws MalformedURLException {
		// Selecionar Formulário
		menu.acessarFormulario();
	}

	@Test
	public void preencherCadastro() throws MalformedURLException {

		page.escreverNome("SAMARONE SILVA");

		Assert.assertEquals("SAMARONE SILVA", page.obterNome());

		page.selecionarCombo("Nintendo Switch");

		Assert.assertEquals("Nintendo Switch", page.obterValorCombo());

		page.clicarCheck();

		page.clicarSwitch();

		Assert.assertTrue(page.isCheckMarcado());
		Assert.assertFalse(page.isSwitchMarcado());

		page.salvar();

		Assert.assertEquals("Nome: SAMARONE SILVA", page.obterNomeCadastrado());
		Assert.assertEquals("Console: switch", page.obterConsoleCadastrado());
//		Assert.assertEquals("Switch: Off", page.obterSwitchCadastrado().endsWith(" Off")); 
//		Assert.assertEquals("Checkbox: Marcado", page.obterCheckCadastrado().endsWith(" Marcado"));

	}

	@Test
	public void deveRealizarCadastroDemorado() throws MalformedURLException {

		page.escreverNome("SAMARONE SILVA");

		DriverFactory.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

		page.salvarDemorado();
//		esperar(3000);

		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Nome: SAMARONE SILVA']")));

		Assert.assertEquals("Nome: SAMARONE SILVA", page.obterNomeCadastrado());

	}

	@Test
	public void deveAlterarData() {
		page.clicarPorTexto("01/01/2000");
		page.clicarPorTexto("20");
		page.clicarPorTexto("OK");
		Assert.assertTrue(page.existeElementoPorTexto("20/2/2000"));
	}

	@Test
	public void deveAlterarHorario() {
		page.clicarPorTexto("06:00");
		page.clicar(MobileBy.AccessibilityId("10"));
		page.clicar(MobileBy.AccessibilityId("40"));
		page.clicarPorTexto("OK");
		Assert.assertTrue(page.existeElementoPorTexto("10:40"));
	}
	
	@Test
	public void deveInterarirComSeekbar() {
		//clicar no seekbar
		page.clicarSeekBar(0.05);
		
		//salvar
		page.salvar();
	}

}

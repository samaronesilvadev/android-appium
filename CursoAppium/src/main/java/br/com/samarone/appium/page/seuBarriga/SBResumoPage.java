package br.com.samarone.appium.page.seuBarriga;

import br.com.samarone.core.BasePage;
import static br.com.samarone.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

public class SBResumoPage extends BasePage {

	public void excluirMovimentacao(String desc) {
		MobileElement el = getDriver().findElement(By.xpath("//*[@text='"+desc+"']/.."));
		swipeElement(el, 0.9, 0.2);
		clicarPorTexto("Del");
	}
}

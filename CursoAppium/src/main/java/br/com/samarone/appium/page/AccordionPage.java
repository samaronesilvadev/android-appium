package br.com.samarone.appium.page;

import org.openqa.selenium.By;

import br.com.samarone.core.BasePage;

public class AccordionPage extends BasePage {

	public void clicarOp1() {
		clicarPorTexto("Opção 1");
	}
	
	public String obterValorOp1() {
		return obterTexto(By.xpath("//*[@text='Opção 1']/../..//following-sibling::android.view.ViewGroup//android.widget.TextView"));
	}
}

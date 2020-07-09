package br.com.samarone.appium.page;

import static br.com.samarone.core.DriverFactory.getDriver;

import java.util.Set;

import org.openqa.selenium.By;

import br.com.samarone.core.DriverFactory;;

public class WebViewPage {
	
	public void entrarContextoWeb() {
		Set<String> contextHandles = getDriver().getContextHandles();
//		for(String valor: contextHandles) {
//			System.out.println(valor);
//		}
		getDriver().context((String) contextHandles.toArray()[1]);
	}

	public void setEmail(String valor) {
		getDriver().findElement(By.id("email")).sendKeys(valor);;
	}
}

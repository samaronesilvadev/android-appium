package br.com.samarone.appium.page;

import br.com.samarone.core.BasePage;
import static br.com.samarone.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;

public class CliquesPage extends BasePage {

	public void cliqueLongo() {
		cliqueLongo(By.xpath("//*[@text='Clique Longo']"));
		
	}
	
	public String obterTextoCampo() {
		return getDriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
	}
}

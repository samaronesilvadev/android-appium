package br.com.samarone.appium.page;

import br.com.samarone.core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

import static br.com.samarone.core.DriverFactory.getDriver;

import static java.awt.List.*;

import org.openqa.selenium.By;;

public class DragDropPage extends BasePage {

	public void arrastar(String origem, String destino) {
	 MobileElement inicio =	getDriver().findElement(By.xpath("//*[@text='"+origem+"']"));
	 MobileElement fim =	getDriver().findElement(By.xpath("//*[@text='"+destino+"']"));
	 
	 new TouchAction(getDriver())
	 	.longPress(inicio)
	 	.moveTo(fim)
	 	.release()
	 	.perform();
	}
	
	public String[] obterLista() {
		java.util.List<MobileElement> elements = getDriver().findElements(By.className("android.widget.TextView"));
		String[] retorno = new String[elements.size()];
		for(int i = 0; i < elements.size(); i++) {
			retorno[i] = elements.get(i).getText();
//			System.out.println("\"" + retorno[i] + "\", ");
		}
		return retorno;
	}
}

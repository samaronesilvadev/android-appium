package br.com.samarone.appium.page.seuBarriga;

import br.com.samarone.core.BasePage;

public class SBMenuPage extends BasePage {
	
	public void acessarContas() {
		clicarPorTexto("CONTAS");
	}
	
	public void acessarMovimentacao() {
		clicarPorTexto("MOV...");
	}
	
	public void acessarResumo() {
		clicarPorTexto("RESUMO");
	}
	
	public void acessarHome() {
		clicarPorTexto("HOME");
	}

}

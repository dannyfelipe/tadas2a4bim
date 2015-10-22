package br.unive.cadastro.telalogin;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class TelaCadastroCliente extends MolduraAbstrata {

	/**
	 * Create the panel.
	 */
	public TelaCadastroCliente() {
		
		// 
		super();

	}

	@Override
	protected void configuraMiolo() {
		// TODO Auto-generated method stub
		
		// adiciona o miolo no centro
		super.add(new MioloCadastroCliente(), BorderLayout.CENTER);
		
	}

}

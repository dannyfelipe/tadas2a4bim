package br.unive.cadastro.telalogin;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Dimension;

import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public abstract class MolduraAbstrata extends JPanel {
	
	private JButton btnFechar;
	
	// metodo abstrato, que for utilizar deve implementar, n�o � responsabilidade dela
	protected abstract void configuraMiolo();
	
	public void setCloseAction(ActionListener action) {
		btnFechar.addActionListener(action);
	}
	
	

	/**
	 * Create the panel.
	 */
	public MolduraAbstrata() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblOl = new JLabel("Ol\u00E1");
		GridBagConstraints gbc_lblOl = new GridBagConstraints();
		gbc_lblOl.insets = new Insets(0, 0, 0, 5);
		gbc_lblOl.gridx = 0;
		gbc_lblOl.gridy = 0;
		panel.add(lblOl, gbc_lblOl);
		
		btnFechar = new JButton("Fechar");
		/*btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});*/
		GridBagConstraints gbc_btnFechar = new GridBagConstraints();
		gbc_btnFechar.anchor = GridBagConstraints.EAST;
		gbc_btnFechar.gridx = 1;
		gbc_btnFechar.gridy = 0;
		panel.add(btnFechar, gbc_btnFechar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.SOUTH);
		
		// invoca o m�todo l� de cima
		configuraMiolo();

	}

}

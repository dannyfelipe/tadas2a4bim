package br.unive.cadastro.telalogin;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JComboBox;

public class MioloCadastroCliente extends JPanel {
	protected JTextField txtF_id;
	protected JTextField txtF_nome;
	protected JTextField txtF_end;
	protected JTextField txtF_telefone;
	protected JTextField txtF_cidade;

	/**
	 * Create the panel.
	 */
	public MioloCadastroCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblId = new JLabel("Id");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		add(lblId, gbc_lblId);
		
		txtF_id = new JTextField();
		GridBagConstraints gbc_txtF_id = new GridBagConstraints();
		gbc_txtF_id.insets = new Insets(0, 0, 5, 0);
		gbc_txtF_id.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtF_id.gridx = 1;
		gbc_txtF_id.gridy = 0;
		add(txtF_id, gbc_txtF_id);
		txtF_id.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		txtF_nome = new JTextField();
		GridBagConstraints gbc_txtF_nome = new GridBagConstraints();
		gbc_txtF_nome.insets = new Insets(0, 0, 5, 0);
		gbc_txtF_nome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtF_nome.gridx = 1;
		gbc_txtF_nome.gridy = 1;
		add(txtF_nome, gbc_txtF_nome);
		txtF_nome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Endereco");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtF_end = new JTextField();
		GridBagConstraints gbc_txtF_end = new GridBagConstraints();
		gbc_txtF_end.insets = new Insets(0, 0, 5, 0);
		gbc_txtF_end.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtF_end.gridx = 1;
		gbc_txtF_end.gridy = 2;
		add(txtF_end, gbc_txtF_end);
		txtF_end.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtF_telefone = new JTextField();
		GridBagConstraints gbc_txtF_telefone = new GridBagConstraints();
		gbc_txtF_telefone.insets = new Insets(0, 0, 5, 0);
		gbc_txtF_telefone.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtF_telefone.gridx = 1;
		gbc_txtF_telefone.gridy = 3;
		add(txtF_telefone, gbc_txtF_telefone);
		txtF_telefone.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Cidade");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 4;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		txtF_cidade = new JTextField();
		GridBagConstraints gbc_txtF_cidade = new GridBagConstraints();
		gbc_txtF_cidade.insets = new Insets(0, 0, 5, 0);
		gbc_txtF_cidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtF_cidade.gridx = 1;
		gbc_txtF_cidade.gridy = 4;
		add(txtF_cidade, gbc_txtF_cidade);
		txtF_cidade.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Uf");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 5;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JComboBox cBx_uf = new JComboBox();
		GridBagConstraints gbc_cBx_uf = new GridBagConstraints();
		gbc_cBx_uf.fill = GridBagConstraints.HORIZONTAL;
		gbc_cBx_uf.gridx = 1;
		gbc_cBx_uf.gridy = 5;
		add(cBx_uf, gbc_cBx_uf);

	}

}

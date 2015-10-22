package br.unive.cadastro.telalogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setTitle("SISTEMINHA 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// invoca o método para abrir a aba
				abrirTela();
				
			}

			private void abrirTela() {
				
				// moldura
				TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente();
				// criação da ação por função para fechar a aba aberta
				telaCadastroCliente.setCloseAction(e -> tabbedPane.remove(telaCadastroCliente));
				// adiciona uma aba Clientes no sistema
				tabbedPane.addTab("Clientes", telaCadastroCliente);
				
				
				// moldura
				//TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente();
				
				// criação da ação para fechar a tela
				/*ActionListener action = new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						tabbedPane.remove(telaCadastroCliente);
					}
				};*/
				
				/*telaCadastroCliente.setCloseAction(action);*/
				
				// adiciona uma aba
				/*tabbedPane.addTab("Clientes", new TelaCadastroCliente() {} );*/
				
			}
		});
		mnCadastro.add(mntmCliente);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
	}

}

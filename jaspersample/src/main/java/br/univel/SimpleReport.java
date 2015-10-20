package br.univel;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class SimpleReport {

	private String arq = "C:\\Users\\DOT\\JaspersoftWorkspace\\MyReports\\simples.jasper";

	public SimpleReport() {

		TableModel tableModel = TableModelData();

		JasperPrint jasperPrint = null;
		TableModelData();
		try {
			
			// cria um mapa
			Map<String, Object> map = new HashMap<String, Object>();
			// adiciona os dados do parametro no mapa
			map.put("empresa", "Petrobrás");
			map.put("telefone", "(45) 9999.9999");
			
			
			
			// preenche o relatório
			jasperPrint = JasperFillManager.fillReport(arq, map,
					// linha abaixo => padrão decorator
					new JRTableModelDataSource(tableModel));
			// instancia o jframe padrão para visualizar o relatório
			JasperViewer jasperViewer = new JasperViewer(jasperPrint);
			
			
			
			jasperViewer.setBounds(50, 50, 320, 240);
			jasperViewer.setLocationRelativeTo(null);
			jasperViewer.setExtendedState(JFrame.MAXIMIZED_BOTH);
				
			
			
			
			// true para exibir na tela
			jasperViewer.setVisible(true);
		} catch (JRException ex) {
			ex.printStackTrace();
		}
	}

	
	//private TableModel getTableModel() {
	//que tipo ele retorna? table model
	
	
	private TableModel TableModelData() {
		String[] columnNames = { "Id", "Nome", "Departamento", "Email" };

		String[][] data = { { "1", "Hugo", "Financeiro", "hugod@univel.br" },
				{ "2", "José", "Comercial", "josed@univel.br" },
				{ "3", "Luiz", "Contábil", "luizd@univel.br" } };

		return new DefaultTableModel(data, columnNames);
	}

	public static void main(String[] args) {
		new SimpleReport();
	}
}
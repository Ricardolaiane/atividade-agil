package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Livro;


public class TabelaLivrosModel extends AbstractTableModel{


	String[] columns = {"Título", "Gênero", "Qtd Páginas", "Já leu?"};
	List<Livro> livros = new ArrayList<>();


	@Override
	public int getRowCount() {
		return livros.size();
	}

	@Override
	public int getColumnCount() {
		return columns.length;
	}


	@Override
	public String getColumnName(int column) {
		return columns[column];

	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return columnIndex==3;
	}

	@Override 
	public Class<?> getColumnClass(int columnIndex){
		if (livros.isEmpty()) {
			return Object.class;
		}
		return this.getValueAt(0, columnIndex).getClass();
	}


	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		livros.get(rowIndex).setCompleted((boolean)aValue);
	}


	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		switch(columnIndex){
		case 0:
			return livros.get(rowIndex).getTitulo();
		case 1:

			return livros.get(rowIndex).getGenero();
		case 2:
			return livros.get(rowIndex).getQtdPaginas();
			
		case 3:
			return livros.get(rowIndex).isCompleted();
			
		default:
			return "Dados não encontrados";
		}

	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public String[] getColumns() {
		return columns;
	}


}

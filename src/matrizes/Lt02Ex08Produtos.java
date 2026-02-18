package matrizes;

import java.security.SecureRandom;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Lt02Ex08Produtos {
	
	static final String TITLE_EXER = "Matriz de produtos";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] produtos = new int[4][3];
		String[] options = {"Gerar nova matriz", "Sair"};
		int op = 0;
		
		do {
			loadProducts(produtos);
			String msgProducts = showMatriz(produtos);
			String msgStatistics = statistics(produtos);
			
			op = JOptionPane.showOptionDialog(null, msgProducts + msgStatistics, TITLE_EXER, JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			
			switch (op) {
			case 0:
				JOptionPane.showMessageDialog(null, "Nova tabela de produtos gerada com sucesso!", TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Encerrando programa...", TITLE_EXER, JOptionPane.WARNING_MESSAGE);
				break;
			default:
				op = 1;
				break;
			}
		}while(op != 1);
		
	}
	
	public static String statistics(int[][] matriz) {		
		int[] eachProductsSoldMonth = new int[matriz[0].length];
		int[] productsSoldPerWeek = new int[matriz.length];
		int totalProductsSold = 0;
		
		for(int row = 0;row < matriz.length; row ++) {
			for(int col = 0; col < matriz[row].length; col++){
				eachProductsSoldMonth[col] += matriz[row][col];
				productsSoldPerWeek[row] += matriz[row][col];
				totalProductsSold += matriz[row][col];
			}
		}
		String msgInfoProducts = formattedInfo(eachProductsSoldMonth, productsSoldPerWeek, totalProductsSold);
		
		return msgInfoProducts;
	}
	
	public static String formattedInfo(int[] eachProductsSoldMonth, int[] productsSoldPerWeek, int totalProductsSold) {
		StringBuilder formattedInfo = new StringBuilder("-".repeat(75) + "\n<Estatísticas dos produtos>\n");
		formattedInfo.append("a. A quantidade de cada produto vendido no mês:\n");
		for(int i = 0; i < eachProductsSoldMonth.length; i++) {
			formattedInfo.append(String.format("%c -> %d%n", (char) i + 65, eachProductsSoldMonth[i]));
		}
		
		formattedInfo.append("\nb. A quantidade de produtos vendidos por semana:\n");
		for(int i = 0; i < productsSoldPerWeek.length; i++) {
			formattedInfo.append("Semana " + (i + 1) + " -> " + productsSoldPerWeek[i] + " vendas\n");
		}
		
		formattedInfo.append("\nc. O total de produtos vendidos no mês: " + totalProductsSold);
		
		return formattedInfo.toString();
	}
	
	public static String showMatriz(int[][] matriz) {
		StringBuilder formattedMatriz = new StringBuilder(String.format("%-11s | %3s%9s%9s   |%n", "Produtos", "A", "B", "C"));
		
		for(int row = 0; row < matriz.length; row++) {
			formattedMatriz.append((row + 1) + "° semana | ");
			for(int col = 0; col < matriz[row].length; col++) {
				formattedMatriz.append(String.format("%03d%s", matriz[row][col], (col != matriz[row].length -1) ? " - " : " |"));
			}
			formattedMatriz.append("\n");
		}
		
		return formattedMatriz.toString();
	}
	
	public static void loadProducts(int[][] matriz) {
		SecureRandom random = new SecureRandom();
		
		for(int row = 0; row < matriz.length; row++) {
			for(int col = 0; col < matriz[row].length; col++) {
				matriz[row][col] = random.nextInt(50, 1000);
			}
		}
	}

}

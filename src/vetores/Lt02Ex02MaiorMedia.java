package vetores;

import javax.swing.JOptionPane;

public class Lt02Ex02MaiorMedia {
	static final String TITLE_EXER = "Maior, menor e média";
	static final int TAM_LISTA = 100;
	
	public static void main(String[] args) {
		int[] values = new int[TAM_LISTA];
				
		carregarLista(values);
		
		String msgEstatisticas = estatisticas(values);
		JOptionPane.showMessageDialog(null, msgEstatisticas, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void carregarLista(int[] listaNum) {
		for(int i = 0; i < listaNum.length; i++) {
			do {
				listaNum[i] = Integer.parseInt(JOptionPane.showInputDialog(null, (i + 1) + "° valor: ", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
				if(listaNum[i] < 0) JOptionPane.showMessageDialog(null, "Os números devem ser positivo!", TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
			}while(listaNum[i] < 0);
		}
	}
	
	public static String estatisticas(int[] listaNum) {
		int somaLista = 0, maiorNum = 0, menorNum = 0;
				
		for(int i = 0; i < listaNum.length; i++) {
						
			if(maiorNum == 0 && menorNum == 0) {
				maiorNum = listaNum[i];
				menorNum = listaNum[i];
			}else if(listaNum[i] > maiorNum) {
				maiorNum = listaNum[i];
			}else if(listaNum[i] < menorNum) {
				menorNum = listaNum[i];
			}
			
			somaLista += listaNum[i];
			
		}
		
		double media = (double) somaLista / listaNum.length;
				
		return String.format("<Estatísticas>%nMaior valor -> %d%nMenor valor -> %d%nMédia -> %.2f", maiorNum, menorNum, media);
	}
}

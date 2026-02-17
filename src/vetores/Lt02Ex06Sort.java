package vetores;

import java.security.SecureRandom;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Lt02Ex06Sort {
	static final String TITLE_EXER = "Exercicio - Ordem Crescente";	
	static final int MAX_VALUE = 100;
	static final int LIST_SIZE = 20;
	static boolean isSort = false;
	
	public static void main(String[] args) {
		int[] listaNum = new int[LIST_SIZE];
		
		int op = 0;
		String[] options = {"Carregar lista", "Ordenar e mostrar", "Procurar valor", "Sair"};
		
		do {
			op = JOptionPane.showOptionDialog(null, "Lista: " + Arrays.toString(listaNum) + "\nQual opção você deseja?", TITLE_EXER, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			switch (op) {
				case 0:
					loadList(listaNum);
					JOptionPane.showMessageDialog(null, "Nova lista aleatória gerada!\nLista atual: " + Arrays.toString(listaNum), TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
					isSort = false;
					break;
				case 1:
					if(!isSort) {
						bubbleSort(listaNum);
						JOptionPane.showMessageDialog(null, "Lista ordenada com sucesso!\nLista atual: " + Arrays.toString(listaNum), TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
						isSort = true;
					}
					else JOptionPane.showMessageDialog(null, "A lista já está ordenada!", TITLE_EXER, JOptionPane.WARNING_MESSAGE);
					break;
				case 2:
					String msgUser = "";
					if(isSort) {
						int valueSearch = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual item da lista você procura?", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
						int indexSearch = binarySearch(listaNum, valueSearch);
						if (indexSearch != -1) msgUser = String.format("Valor %d encontrado! Índice na lista -> %d", valueSearch, indexSearch);
						else msgUser = "Valor " + valueSearch + " não encontrado na lista!";						
					}else {
						msgUser = "A lista precisa estar ordenada para realizarmos a busca binária!";
					}
					JOptionPane.showMessageDialog(null, msgUser, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);					
					
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Encerrando programa...", TITLE_EXER, JOptionPane.WARNING_MESSAGE);
					break;
				default:
					break;
			}
		}while(op != 3);
		
		/*
		report.append(Arrays.toString(listaNum) + "\n");
		bubbleSort(listaNum);
		report.append("Lista em ordem crescente: " + Arrays.toString(listaNum));
		
		JOptionPane.showMessageDialog(null, report, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
		*/
		
		
	}
	public static void loadList(int[] list) {
		SecureRandom random = new SecureRandom();
		for(int i = 0; i < list.length; i++) {
			list[i] = random.nextInt(MAX_VALUE);
		}
	}
	
	public static void bubbleSort(int[] list) {
		for(int i = 0; i < list.length - 1; i++) {
			for(int j = i + 1; j < list.length; j++) {
				if(list[i] > list[j]) {
					int aux = list[i];
					list[i] = list[j];
					list[j] = aux;
				}
			}
		}
	}
	
	public static int binarySearch(int[] list, int target) {
		int start = 0, end = list.length - 1;
		while(start <= end) {
			int middle= (start + end) / 2;
			
			if(list[middle] == target) {
				return middle;
			} else  if(target < list[middle]) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		return -1;
	}

}

package vetores;

import java.security.SecureRandom;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Lt02Ex04GrupoPessoas {
	
	static final String TITLE_EXER = "Estatísticas de um grupo de pessoas";
	static final int GROUP_SIZE = 30;
	
	public static void main(String[] args) {
		int[] group = new int[GROUP_SIZE];
		int op = 0;
		String[] options = {"Carregar com entrada", "Carregar com val. aleatórios", "Mostrar lista", "Estatísticas", "Sair"};
		
		do {
			op = JOptionPane.showOptionDialog(null, "Qual opção deseja?", TITLE_EXER, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			switch (op) {
			case 0:
				loadWithInput(group);
				break;
			case 1:
				loadWithRandomness(group);
				break;
			case 2:
				String msgUser = showGroupList(group);
				JOptionPane.showMessageDialog(null, msgUser, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
				break;
			case 3:
				String msgStatistics = statistics(group);
				JOptionPane.showMessageDialog(null, msgStatistics, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Encerrando programa...", TITLE_EXER, JOptionPane.WARNING_MESSAGE);
				break;
			default:
				break;
			}
		}while(op != 4);
	}
	
	public static void loadWithInput(int[] list) {		
		for(int i = 0; i < list.length; i++) {
			do {
				list[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "%d. Informe sua nota (0 - 10): ", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
				if(!(list[i] >= 0 && list[i] <= 10)) JOptionPane.showMessageDialog(null, "As notas devem ser de 0 a 10!", TITLE_EXER, JOptionPane.ERROR_MESSAGE);
			}while(!(list[i] >= 0 && list[i] <= 10));
		}
	}
	
	public static void loadWithRandomness(int[] list) {
		SecureRandom random = new SecureRandom();
		
		for(int i = 0; i < list.length; i++) {
			list[i] = random.nextInt(10);
		}
		
		JOptionPane.showMessageDialog(null, "Lista preenchida com notas aleatórias de 0 a 10!", TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static String showGroupList(int[] list) {
		StringBuilder formattedList = new StringBuilder("<lista com 30 notas>\n");
		
		for(int i = 0; i < 10; i++) formattedList.append("Ps - Nt | ");
		formattedList.append("\n");
		
		for(int i = 0; i < list.length; i++) {
			formattedList.append(String.format("%02d - %02d | ", i, list[i]));
			if((i + 1) % 10 == 0) formattedList.append("\n");
		}
		
		
		
		return formattedList.toString();
	}
	
	public static String statistics(int[] list) {
		StringBuilder formattedStatus = new StringBuilder("<ESTATÍSTICAS>\n");
		double average = averageGroup(list);
		int qtdBiggerAvg = 0, limitSmallList = 0;
				
		for(int nota : list) {
			if((double)nota > average) qtdBiggerAvg++;
			if((double) nota < average) limitSmallList++;
		}
				
		int[] posSmallAvg = listSmallAvg(list, limitSmallList, average);
		
		formattedStatus.append(
				String.format(
						"Média do grupo: %.2f%nQtd. de notas acima da média: %d%nPosições dos valores abaixo da média do grupo: %s",
						average, qtdBiggerAvg, Arrays.toString(posSmallAvg)
				)
		);
		
		
		return formattedStatus.toString();
	}
	
	public static double averageGroup(int[] list) {
		int totalNotas = 0;
		
		for(int i = 0; i < list.length; i++) {
			totalNotas += list[i];
		}
		
		return (double) totalNotas / list.length;
	}
	
	public static int[] listSmallAvg(int[] list, int sizeList, double average) {
		int[] smallerAvg = new int[sizeList];
		int indexSmall = 0;
		
		for(int i = 0; i < list.length; i++) {
			if((double)list[i] < average) {
				smallerAvg[indexSmall] = i;
				indexSmall++;
			}
		}
		
		return smallerAvg;
	}
	
}

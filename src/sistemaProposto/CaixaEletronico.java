package sistemaProposto;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class CaixaEletronico {

	static final String TITLE_MAIN = "Caixa Eletrônico | FATEC-ZL";
	static final int[] BANKNOTE_VALUES = {2, 5, 10, 20, 50, 100};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String options[] = {"Carregar Notas", "Retirar Notas", "Estatística", "Sair"};
		int[] quantityBanknotes = new int[6];
		
		int op = 0;
		
		//1.6. Solicitar até 100 retiradas ou até não haver mais notas.
		do {
			op = JOptionPane.showOptionDialog(null, "Menu Principal", TITLE_MAIN, JOptionPane.CLOSED_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
			switch (op) {
			case 0:
				quantityBanknotes = loadBankNotes(quantityBanknotes); 
				break;
			case 1:
				
				break;
				
			case 2:
				JOptionPane.showMessageDialog(null, Arrays.toString(quantityBanknotes));
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Encerrando programa...", TITLE_MAIN, JOptionPane.WARNING_MESSAGE);
				break;
				
			default:
				break;
			}
		}while(op != 3);
	}
	
	//DEPOSITAR
	public static int[] loadBankNotes(int[] listNotas) {
		//1.1. Carregar a quantidade de notas em uma área da memória com 6 ocorrências
		final String TITLE_LOAD = "Depósito bancário | FATEC-ZL";
		String[] options = {"PERSONALIZADO", "FIXO", "Cancelar"};
		String depositReport = "Relatório de depósitos\nVALOR | QTD. NOTAS\n";
		
		int[] currQuantityBanknotes = Arrays.copyOf(listNotas, listNotas.length);
		int[] banknotesDeposited = new int[6];
		int opMenu = 0;
		
		boolean makeDeposit = false;
		
		do {
			opMenu = JOptionPane.showOptionDialog(null, 
					"Selecione o tipo de depósito: \n" + 
					"PERSONALIZADO\n" +
					"Você informa a quantidade de cédulas para cada valor separadamente\n\n" +
					"FIXO\n" +
					"Você informa um único número, aplicado a todos os valores."
					, TITLE_LOAD, JOptionPane.CLOSED_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			switch (opMenu) {
			//opção PERSONALIZADO
			case 0:
				for(int i = 0; i < listNotas.length; i++) {
					banknotesDeposited[i] += Integer.parseInt(JOptionPane.showInputDialog(null, "Depósito em dinheiro: \nInforme a quantidade de cédulas de R$ " + BANKNOTE_VALUES[i] + ":", TITLE_LOAD,  JOptionPane.INFORMATION_MESSAGE));
					makeDeposit = true;
				}
				
				break;
			//opção FIXO
			case 1:
				int quantityBanknote = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de cédulas que será depositada para cada valor:", TITLE_LOAD, JOptionPane.QUESTION_MESSAGE));
				for(int i = 0; i < banknotesDeposited.length; i++) banknotesDeposited[i] += quantityBanknote;
				makeDeposit = true;
				break;
			//opção Cancelar
			default:
				break;
			}
			
			if(makeDeposit) options[2] = "Finalizar";
		}while(opMenu != 2);
		
		if(makeDeposit) {
			for(int i = 0; i < currQuantityBanknotes.length; i++) {
				depositReport = depositReport.concat(String.format("R$%-5d | %d%n", BANKNOTE_VALUES[i], banknotesDeposited[i]));
				currQuantityBanknotes[i] += banknotesDeposited[i];
			}			
			JOptionPane.showMessageDialog(null, depositReport, TITLE_LOAD, JOptionPane.INFORMATION_MESSAGE);
		}		
		
		return currQuantityBanknotes;
	}
	
	public static void menuRetirarNotas() {
		//1.2. Solicitar que o cliente faça a retirada de valores obedecendo ao critério do maior pelo menor.
		//1.3. Dar a opção para o cliente escolher o valor e a quantidade de notas. P. ex.: 1 x 20, 2 x 10
		//1.4. Caso não tenha o valor da maior cédula, disponibilizar a próxima.
		//1.5. Se o valor a ser solicitado for maior que o saldo total do caixa, enviar a mensagem “EXCEDEU O LIMITE DO CAIXA”.
		//1.7. No momento da solicitação do valor, coletar também o código do banco que o cliente tem conta, segundo:
	}
	
	public static void menuEstatistica() {
		JOptionPane.showMessageDialog(null, BANKNOTE_VALUES);
		/*
		1.8. No final, exibir a estatística, separada por bancos, com:
			1.8.1. O maior e o menor valor sacado;
			1.8.2. A média dos saques;
			1.8.3. Valor total dos saques;
			1.8.4. Valor das sobras dos caixas.
		*/
	}

}

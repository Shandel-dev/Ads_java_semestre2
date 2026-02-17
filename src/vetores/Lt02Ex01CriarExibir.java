package vetores;

import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class Lt02Ex01CriarExibir {

	static final String TITLE_EXER = "Média e soma";
	static final int TAM_LISTA = 50;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = new int[TAM_LISTA];
		
		int op = 0;
		String[] options = {"Inserir valores", "Carregar com num. aleatórios", "Mostrar lista", "Estatísticas", "Sair"};
		
		do{
			op = JOptionPane.showOptionDialog(null, "O que deseja fazer?", TITLE_EXER, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			
			switch (op) {
				case 0: {
					carregarListaInput(values);
					JOptionPane.showMessageDialog(null, "Lista preenchida com sucesso!", TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
					break;
				}
				case 1: {
					carregarListaAleatoria(values);
					JOptionPane.showMessageDialog(null, "Lista preenchida com sucesso!", TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
					break;
				}
				case 2: {
					String msgLista = mostrarLista(values);
					JOptionPane.showMessageDialog(null, msgLista, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
					
					break;
				}
				case 3:{
					String msgEstatistica = estatisticas(values);
					JOptionPane.showMessageDialog(null, msgEstatistica, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
					break;
				}
				case 4:{
					JOptionPane.showMessageDialog(null, "Encerrando programa...", TITLE_EXER, JOptionPane.WARNING_MESSAGE);
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + op);
			}
		} while(op != 4);		
	}
	

	
	public static void carregarListaInput(int[] lista_num) {
		//parâmetro passado como refencia
		//mudanças na variável de referencia do parametro refletem na lista original
		for(int i = 0; i < lista_num.length; i++) {
			lista_num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("%d° valor: ", i + 1), TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		}
	}
	
	public static void carregarListaAleatoria(int[] lista_num) {
		SecureRandom random = new SecureRandom();
		int limite = 0;
		
		do {
		    limite = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o limite dos valores aleatórios?", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		} while (limite <= 0);

		for(int i = 0; i < lista_num.length; i++) {
			lista_num[i] = random.nextInt(limite);
		}
	}
	
	public static String mostrarLista(int[] lista_num) {
		StringBuilder listFormatted = new StringBuilder("<Lista Atual>\n");
		int lineBreak = 10;
		
		for(int i = 0; i < lista_num.length; i++) {
			listFormatted.append(String.format("%3d %s", lista_num[i], ((i + 1) % lineBreak != 0) ? "- " : ""));
			if((i + 1) % lineBreak == 0) listFormatted.append("\n");
		}
		
		return listFormatted.toString();
	}
	
	public static String estatisticas(int[] lista_num) {
		int somaImpares = 0, qtdInterval10a100 = 0, somaInterval10a100 = 0;
		
		for(int num : lista_num) {
			if(num % 2 != 0) somaImpares += num;
			if(num >= 10 && num <= 200) {
				qtdInterval10a100++;
				somaInterval10a100 += num;
			}
		}
		
		double media = (qtdInterval10a100 > 0) ? (double) somaInterval10a100 / qtdInterval10a100 : 0;
		
		return String.format("<Análise dos valores entre 10 e 200>%nQuantidade -> %d%nMédia: %.2f%nSoma dos números ímpares -> %d", qtdInterval10a100, media, somaImpares);
	}
}

package estruturas_decisao;

import javax.swing.JOptionPane;

public class Lt01Ex29Investimento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int optionInvest;
		double valueInvest;
		String titleExer = "Investimentos", investName;
		
		optionInvest = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja qual opção de investimento?\n1 - Poupança (3% a.m.)\n2 - Renda fixa (5% a.m.)", titleExer, JOptionPane.QUESTION_MESSAGE));
		valueInvest = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor (em R$): ", titleExer, JOptionPane.QUESTION_MESSAGE));
		
		switch (optionInvest) {
		case 1: {
			valueInvest *= 1.03;
			investName = "Poupança";
			break;
		}
		case 2:{
			valueInvest *= 1.05;
			investName = "Renda Fixa";
			break;
		}
		default:
			investName = "Opção inválida!";
		}
		
		if(!investName.equals("Opção inválida!"))JOptionPane.showMessageDialog(null, String.format("Valor após 30 dias na %s -> R$%.2f", investName, valueInvest), titleExer, JOptionPane.INFORMATION_MESSAGE);			
		else JOptionPane.showMessageDialog(null, investName + "%nEncerrando programa...", titleExer, JOptionPane.ERROR_MESSAGE);
		
	}
	
	

}

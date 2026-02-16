package procedimentos;

import javax.swing.JOptionPane;

public class Lt01Ex29 {

	private static final String TITLE_EXER = "Investimentos";

	public static void main(String[] args) {

		int optionInvest = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja qual opção de investimento?\n1 - Poupança (3% a.m.)\n2 - Renda fixa (5% a.m.)", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		double valueInvest = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor (em R$):", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));

		calcularInvestimento(optionInvest, valueInvest);
	}

	public static void calcularInvestimento(int optionInvest, double valueInvest) {

		String investName;
		boolean opcaoValida = true;

		switch (optionInvest) {
			case 1:
				valueInvest *= 1.03;
				investName = "Poupança";
				break;
			case 2:
				valueInvest *= 1.05;
				investName = "Renda Fixa";
				break;
			default:
				investName = "Opção inválida!";
				opcaoValida = false;
		}

		if (opcaoValida) JOptionPane.showMessageDialog(null, String.format("Valor após 30 dias na %s -> R$%.2f", investName, valueInvest), TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
		else JOptionPane.showMessageDialog(null, "Opção inválida!\nEncerrando programa...", TITLE_EXER, JOptionPane.ERROR_MESSAGE);
	}
}

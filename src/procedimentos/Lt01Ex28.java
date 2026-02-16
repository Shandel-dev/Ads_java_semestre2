package procedimentos;

import javax.swing.JOptionPane;

public class Lt01Ex28{

	private static final String TITLE_EXER = "Novo preço de produto!";

	public static void main(String[] args) {

		double precoAtual = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preço atual do produto (R$):", TITLE_EXER, JOptionPane.INFORMATION_MESSAGE));
		double mediaMensal = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a média mensal de vendas:", TITLE_EXER, JOptionPane.INFORMATION_MESSAGE));

		calcularNovoPreco(precoAtual, mediaMensal);
	}

	public static void calcularNovoPreco(double precoAtual, double mediaMensal) {

		String modPreco = "sem modificações!";

		if (mediaMensal >= 1000 && precoAtual >= 80) {
			precoAtual *= 1.1;
			modPreco = "+10%";
		} else if (mediaMensal >= 500 && mediaMensal < 1000 && precoAtual >= 30 && precoAtual < 80) {
			precoAtual *= 1.15;
			modPreco = "+15%";
		} else if (mediaMensal < 500 && precoAtual < 30) {
			precoAtual *= 0.95;
			modPreco = "-5%";
		}

		String msgResul = String.format("Preço %s%nProduto -> R$%.2f!", modPreco, precoAtual);

		JOptionPane.showMessageDialog(null, msgResul, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
	}
}

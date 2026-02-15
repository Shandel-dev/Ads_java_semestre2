package estruturas_decisao;

import javax.swing.JOptionPane;

public class Lt01Ex28Preco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precoAtual, mediaMensal;
		String titleExer = "Novo preço de produto!", modPreco = "sem modificações!";
		
		precoAtual = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preço atual do produto (R$): ", titleExer, JOptionPane.INFORMATION_MESSAGE));
		mediaMensal = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a média mensal de vendas: ", titleExer, JOptionPane.INFORMATION_MESSAGE));
		
		if(mediaMensal >= 1000 && precoAtual >= 80) {
			precoAtual *= 1.1;
			modPreco = "+10%";
		}
		else if((mediaMensal >= 500 && mediaMensal < 1000) && (precoAtual >= 30 && precoAtual < 80)) {
			precoAtual *= 1.15;
			modPreco = "+15%";
		}  
		else if((mediaMensal < 500) && (precoAtual < 30)) {
			precoAtual *= 0.95;
			modPreco = "-5%";
		}
		
		String msgResul = String.format("Preço %s%nProduto -> R$%.2f!", modPreco, precoAtual);
		JOptionPane.showMessageDialog(null, msgResul, titleExer, JOptionPane.INFORMATION_MESSAGE);
	}

}

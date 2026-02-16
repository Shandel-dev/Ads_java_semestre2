package estruturas_repeticao;

import java.math.BigInteger;
import javax.swing.JOptionPane;

public class Lt01Ex39Graos {

    public static void main(String[] args) {

    	// TODO Auto-generated method stub
		String TITLE_EXER = "Quantidade de grãos";
		int casaNum = 1, resul;
		BigInteger qdteNum = BigInteger.ONE;
		BigInteger totalGraos = BigInteger.ZERO;
		
		String casaSeq = "", qdteSeq = "", tableGrains = "Casa | Quantidade\n";
		
		for(int i = 1; i <= 64; i++) {
			casaSeq = casaSeq.concat(casaNum + " | ");
			qdteSeq = qdteSeq.concat(qdteNum + " | ");
			tableGrains = tableGrains.concat(String.format("%8d | %s%n", casaNum, qdteNum));
			
			totalGraos = totalGraos.add(qdteNum);
			
			casaNum++;
			qdteNum = qdteNum.multiply(BigInteger.valueOf(2));
		}
		
		String msgResul = String.format("%s%n%s", totalGraos, tableGrains);
		JOptionPane.showMessageDialog(null, msgResul, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
    	
    	/*
    	 * SUGESTAO DE FORMATAÇÃO DE RESULTADOS POR CHAT GPT
        String TITLE_EXER = "Quantidade de grãos";

        String tabela = "";
        BigInteger totalGraos = BigInteger.ZERO;

        int linhas = 16;
        int colunas = 4;

        for (int linha = 1; linha <= linhas; linha++) {

            for (int col = 0; col < colunas; col++) {

                int casa = linha + (col * linhas);

                BigInteger quantidade = BigInteger.ONE;

                // recalcula potência até a casa desejada
                for (int i = 1; i < casa; i++) {
                    quantidade = quantidade.multiply(BigInteger.valueOf(2));
                }

                tabela = tabela.concat(String.format("%2d | %-22s   ", casa, quantidade)
                );

                totalGraos = totalGraos.add(quantidade);
            }

            tabela = tabela.concat("\n");
        }

        tabela = tabela.concat("\nTotal: " + totalGraos);

        JOptionPane.showMessageDialog(null, tabela, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
        */
    }
}

package matrizes;

import java.math.BigInteger;

import javax.swing.JOptionPane;

public class Lt02Ex10Pow {

	static final String TITLE_EXER = "Matriz 8x8";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger[][] matriz = new BigInteger[8][8];
		loadMatriz(matriz);
		StringBuilder[] listMsgValues = showMatriz(matriz);
		
		for(int i = 0; i < listMsgValues.length; i++) {
			JOptionPane.showMessageDialog(null, listMsgValues[i].toString(), TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public static void loadMatriz(BigInteger[][] matriz) {
		BigInteger value = BigInteger.ONE;
		
		for(int row = 0; row < matriz.length; row++) {
			for(int col = 0; col < matriz[row].length; col++) {
				matriz[row][col] = value;
				value = value.multiply(BigInteger.TWO);
			}
		}
	}
	
	//construi uma lista de String que mostra os valores da matriz de 8 em 8
	//divididos em 8 itens
	public static StringBuilder[] showMatriz(BigInteger[][] matriz) {
		StringBuilder[] listMsgValues = new StringBuilder[matriz.length];
		int casa = 1;
		
		for(int row = 0; row < matriz.length; row++) {
			listMsgValues[row] = new StringBuilder();
			for(int col = 0; col < matriz[row].length; col++) {
				listMsgValues[row].append(String.format("Casa %02d | Valor -> %s%n", casa, matriz[row][col].toString()));
				casa++;
			}
		}
		
		return listMsgValues;
	}

}

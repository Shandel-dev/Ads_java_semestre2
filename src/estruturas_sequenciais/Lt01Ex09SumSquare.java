package estruturas_sequenciais;

import java.util.Scanner;

public class Lt01Ex09SumSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA, numB, sumSquare;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Valor de A: ");
		numA = leia.nextInt();
		
		System.out.println("2° Valor de B: ");
		numB = leia.nextInt();
		
		//sumSquare = num1 * num1 + num2 * num2;
		sumSquare = (int) (Math.pow(numA, 2) + Math.pow(numB, 2));
		
		System.out.printf("Soma dos quadrados de A e B: %d", sumSquare);
		
		leia.close();
	}

}

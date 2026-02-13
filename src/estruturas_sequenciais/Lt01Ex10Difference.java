package estruturas_sequenciais;

import java.util.Scanner;

public class Lt01Ex10Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("1° valor: ");
		num1 = leia.nextDouble();
		
		System.out.println("2° valor: ");
		num2 = leia.nextDouble();
		
		System.out.printf("%.2f - %.2f = %.2f", num1, num2, num1 - num2);
		leia.close();
	}

}

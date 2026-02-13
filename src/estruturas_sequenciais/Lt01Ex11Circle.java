package estruturas_sequenciais;

import java.util.Scanner;

public class Lt01Ex11Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double radius, lenght;
		
		System.out.println("Informe o raio de uma cincunferência (em cm): ");
		radius = leia.nextDouble();
		
		lenght = radius * 2 * 3.14;
		
		System.out.printf("Comprimento: %.2fcm", lenght);
		
		leia.close();
	}

}

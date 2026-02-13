package estruturas_sequenciais;

import java.util.Scanner;

public class Lt01Ex05SegundoGrau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c;
		double delta, raiz1, raiz2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Coeficiente A: ");
		
		a = leia.nextDouble();
		
		System.out.println("Coeficiente B: ");
		b = leia.nextDouble();
		System.out.println("Coeficiente C: ");
		c = leia.nextDouble();
		
		delta = b * b - 4 * a * c;
		
		raiz1 = (-(b) + Math.sqrt(delta)) / 2 * a;
		raiz2 = (-(b) - Math.sqrt(delta)) / 2 * a;
	
		System.out.printf("Raízes: (%.0f, %.0f)", raiz1, raiz2);
		leia.close();
	}

}

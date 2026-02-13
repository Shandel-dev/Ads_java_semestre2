package estruturas_sequenciais;

import java.util.Scanner;

public class Lt01Ex15Hipotenusa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double cat1, cat2, hipotenusa;
		
		System.out.println("1° cateto: ");
		cat1 = leia.nextDouble();
		
		System.out.println("2° cateto: ");
		cat2 = leia.nextDouble();
		
		hipotenusa = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
		
		System.out.printf("Hipotenusa = %.0f", hipotenusa);
		leia.close();
	}

}

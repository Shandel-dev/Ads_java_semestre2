package estruturas_sequenciais;

import java.util.Scanner;

public class Lt01Ex03Triangle {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int base;
		int altura;
		int area;
		
		System.out.println("Qual o valor da base?");
		
		base = ler.nextInt();
		
		System.out.println("Qual o valor da altura?");
		
		altura = ler.nextInt();
		
		area = (altura*base)/2;

		System.out.println("Área do triângulo é: " + area);
	
		ler.close();
	
	
	}

}

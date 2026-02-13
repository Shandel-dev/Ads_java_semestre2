package estruturas_sequenciais;

import java.util.Scanner;

public class Lt01Ex01Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int lado;
		
		System.out.println("Informe o lado do quadrado: ");
		
		lado=ler.nextInt();
		
		lado=lado*lado;
			
		System.out.println("A área é:" + lado);
	
		ler.close();
		
		
		
	}

}

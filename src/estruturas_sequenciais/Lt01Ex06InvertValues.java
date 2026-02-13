package estruturas_sequenciais;

import java.util.Scanner;

public class Lt01Ex06InvertValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, aux;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor para 'X': ");
		x = leia.nextInt();
		
		System.out.println("Digite um valor para 'Y': ");
		y = leia.nextInt();
		
		aux = x;
		x = y;
		y = aux;
		
		System.out.println("Valores trocados entre X e Y!");
		System.out.printf("Valor de 'X': %d%nValor de 'Y': %d", x, y);
		
		leia.close();
	}

}

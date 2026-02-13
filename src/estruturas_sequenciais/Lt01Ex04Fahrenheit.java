package estruturas_sequenciais;

import java.util.Scanner;

public class Lt01Ex04Fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int celsius, fahrenheit;
		
		System.out.println("Digite a temperatura em celsius");
		celsius = ler.nextInt();

		fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.println(String.format("Celsius: %d°C Fahrenheit: %d°F", celsius, fahrenheit));
		//%d = inteiro
		ler.close();
		
	}

}

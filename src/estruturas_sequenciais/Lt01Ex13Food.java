package estruturas_sequenciais;

import java.util.Scanner;

public class Lt01Ex13Food {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final double CONSUMO_GRAMAS = 50;
		double kilo, dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a qtd. de alimentos(em kilos): ");
		kilo = leia.nextDouble();
		
		dias = kilo / (CONSUMO_GRAMAS / 1000);
	
		System.out.printf("Uma pessoa consome %.0fg de alimentos por dia!%nOs alimentos irão durar %.0f dias!", CONSUMO_GRAMAS, dias);
		leia.close();
	}

}

package estruturas_sequenciais;

import java.util.Scanner;

public class Lt01Ex17Litros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		double tempo, velMedia, litrosGastos;
		
		System.out.println("Tempo de viagem(horas): ");
		tempo = leia.nextDouble();
		
		System.out.println("Velocidade média(em km/h): ");
		velMedia = leia.nextDouble();
		
		litrosGastos = velMedia * tempo / 12;
		
		System.out.printf("Litros gastos: %.2fL", litrosGastos);
		leia.close();
	}

}

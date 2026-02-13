package estruturas_sequenciais;

import java.util.Scanner;

public class Lt01Ex07ParaLLelepiped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lenght, width, height, volume;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe as dimensões da piscina!");
		
		System.out.println("Comprimento (em metros): ");
		lenght = leia.nextInt();
		
		System.out.println("Largura (em metros):");
		width = leia.nextInt();
		
		System.out.println("Altura (em metros): ");
		height = leia.nextInt();
		
		volume = lenght * width * height;
		
		System.out.printf("Volume da piscina: %dm³", volume);
		
		leia.close();
	}

}

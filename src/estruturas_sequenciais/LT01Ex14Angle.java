package estruturas_sequenciais;

import java.util.Scanner;

public class LT01Ex14Angle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int angle1, angle2, angle3;
		
		System.out.println("1° ângulo: ");
		angle1 = leia.nextInt();
		
		System.out.println("2° ângulo: ");
		angle2 = leia.nextInt();
		
		angle3 = 180 - (angle1 + angle2);
		
		System.out.printf("3° ângulo = %d", angle3);
		
		leia.close();
	}

}

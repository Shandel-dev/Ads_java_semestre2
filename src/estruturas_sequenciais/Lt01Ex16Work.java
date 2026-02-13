package estruturas_sequenciais;

import java.util.Scanner;

public class Lt01Ex16Work {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int hourWorked, valueHour, discountPercent, numberDependents;
		double grossSalary, liquidSalary;
		
		System.out.print("Digite as horas trabalhadas: ");
		hourWorked = leia.nextInt();
		
		System.out.print("Digite o valor por hora: ");
		valueHour = leia.nextInt();
		
		System.out.print("Digite o percentual de desconto (%): ");
		discountPercent = leia.nextInt();
		
		System.out.print("Digite o número de dependentes: ");
		numberDependents = leia.nextInt();
		
		grossSalary = hourWorked * valueHour;
		
		liquidSalary = grossSalary - (grossSalary * discountPercent / 100);
		
		liquidSalary += numberDependents * 100;
		
		System.out.printf("Salário a receber: R$%.2f", liquidSalary);
		
		leia.close();
	}
}

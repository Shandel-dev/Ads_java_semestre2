package estruturas_sequenciais;

import java.util.Scanner;

public class Lt01Ex02Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Qual seu salário?");
		salario = ler.nextDouble();
		
		//ghkrtjrhry
		
		salario = salario + (salario*15/100);
		System.out.println("Salário após o reajuste:" + salario + " reais");
		ler.close();
	}

}

package estruturas_sequenciais;

import java.util.Scanner;

public class Lt01Ex12Birth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int anoNasc, anoAtual, idade;
		
		System.out.println("Ano de nascimento: ");
		anoNasc = leia.nextInt();
		
		System.out.println("Ano Atual: ");
		anoAtual = leia.nextInt();
		
		idade = anoAtual - anoNasc;
		
		System.out.printf("Idade: %d%nDaqui a 17 você terá %d anos", idade, idade + 17);
		leia.close();
	}

}

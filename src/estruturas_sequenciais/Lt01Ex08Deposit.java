package estruturas_sequenciais;

import java.util.Scanner;

public class Lt01Ex08Deposit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double TAXA = 0.013;
		double deposito;
		int meses;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe seu deposito inicial (R$):");
		deposito = leia.nextDouble();
		
		System.out.println("Quantos meses deseja que renda sua aplicação?");
		meses = leia.nextInt();
		
		deposito += deposito * (meses * TAXA);
		
		System.out.printf("Meses rendendo: %d meses%nValor atual: R$%.2f", meses, deposito);
	
		leia.close();
	}

}

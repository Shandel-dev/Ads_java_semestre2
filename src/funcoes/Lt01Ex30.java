package funcoes;

import javax.swing.JOptionPane;

public class Lt01Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anoN = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento:"));
		int mesN = Integer.parseInt(JOptionPane.showInputDialog("Mês de nascimento:"));
		int diaN = Integer.parseInt(JOptionPane.showInputDialog("Dia de nascimento:"));

		int anoA = Integer.parseInt(JOptionPane.showInputDialog("Ano atual:"));
		int mesA = Integer.parseInt(JOptionPane.showInputDialog("Mês atual:"));
		int diaA = Integer.parseInt(JOptionPane.showInputDialog("Dia atual:"));

		if (dataInvalida(anoN, mesN, diaN) || dataInvalida(anoA, mesA, diaA)) {
			JOptionPane.showMessageDialog(null, "Data inválida.");
			return;
		}

		if (anoA < anoN || (anoA == anoN && mesA < mesN) || (anoA == anoN && mesA == mesN && diaA < diaN)) {
			JOptionPane.showMessageDialog(null, "Data atual anterior à data de nascimento.");
			return;
		}

		int anos = anoA - anoN;
		int meses = mesA - mesN;
		int dias = diaA - diaN;

		// Ajuste dos dias
		if (dias < 0) {
			meses--;
			int mesAnterior = mesA - 1;
			int anoReferencia = anoA;

			if (mesAnterior == 0) {
				mesAnterior = 12;
				anoReferencia--;
			}

			dias += diasNoMes(mesAnterior, anoReferencia);
		}

		// Ajuste dos meses
		if (meses < 0) {
			anos--;
			meses += 12;
		}

		JOptionPane.showMessageDialog(null, "Idade:\n" + anos + " anos\n" + meses + " meses\n" + dias + " dias");

		System.exit(0);
	}

	static boolean bissexto(int ano) {
		return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
	}

	static int diasNoMes(int mes, int ano) {
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return bissexto(ano) ? 29 : 28;
		default:
			return 0;
		}
	}

	static boolean dataInvalida(int ano, int mes, int dia) {
		if (mes < 1 || mes > 12)
			return true;
		if (dia < 1 || dia > diasNoMes(mes, ano))
			return true;
		return false;
	}

}

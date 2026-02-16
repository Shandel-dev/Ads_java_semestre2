package procedimentos;

import javax.swing.JOptionPane;

public class Lt01Ex16 {

	public static void main(String[] args) {
		
		int hourWorked, valueHour, discountPercent, numberDependents;
		
		//ENTRADA DE DADOS
		hourWorked = Integer.parseInt(JOptionPane.showInputDialog("Digite as horas trabalhadas:"));
		valueHour = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor por hora:"));
		discountPercent = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de desconto (%):"));
		numberDependents = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependentes:"));

		//CHAMA FUNÇÃO COM REGRAS DE NEGÓCIO
		calcularSalario(hourWorked, valueHour, discountPercent, numberDependents);
	}

	// Procedimento (não retorna valor)
	public static void calcularSalario(int hourWorked, int valueHour, int discountPercent, int numberDependents) {
		double grossSalary = hourWorked * valueHour;
		double liquidSalary = grossSalary - (grossSalary * discountPercent / 100.0);

		liquidSalary += numberDependents * 100;

		JOptionPane.showMessageDialog(null, String.format("Salário a receber: R$ %.2f", liquidSalary));
	}
}

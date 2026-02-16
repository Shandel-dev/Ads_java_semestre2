package procedimentos;

import javax.swing.JOptionPane;

public class Lt01Ex17 {

	public static void main(String[] args) {

		double tempo = Double.parseDouble(JOptionPane.showInputDialog("Tempo de viagem (horas):"));
		double velMedia = Double.parseDouble(JOptionPane.showInputDialog("Velocidade média (km/h):"));

		calcularLitros(tempo, velMedia);
	}

	public static void calcularLitros(double tempo, double velMedia) {
		double litrosGastos = velMedia * tempo / 12;
		JOptionPane.showMessageDialog(null, String.format("Litros gastos: %.2f L", litrosGastos));
	}
}

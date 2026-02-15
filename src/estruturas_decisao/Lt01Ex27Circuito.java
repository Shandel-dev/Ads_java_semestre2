package estruturas_decisao;

import javax.swing.JOptionPane;

public class Lt01Ex27Circuito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int voltas, extensaoMetros, tempoMinutos;
		double veloMedia;
		String titleExer = "Cálculo de velocidade média!";
		
		voltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de voltas: ", titleExer));
		extensaoMetros = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a extensão do circuito (em metros): ", titleExer));
		tempoMinutos = Integer.parseInt(JOptionPane.showInputDialog(null, "Tempo de duração da corrida (em minutos): ", titleExer));
		
		//velocidade media = espaço / tempo;
		//use <.> em números constantes para forçar resultado double nas divisões!
		
		veloMedia = ((extensaoMetros / 1000.0) * voltas) / (tempoMinutos / 60.0);
		
		String msgResul = String.format("Velocidade média: %.2f km/h%n", veloMedia, titleExer, JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, msgResul);
	}

}

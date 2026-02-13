package estruturas_decisao;

import javax.swing.JOptionPane;

public class Lt01Ex21Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, n3, n4;
		double media;
		String titleExe = "Notas Bimestrais", msg;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "1° nota", titleExe, JOptionPane.QUESTION_MESSAGE));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "2° nota", titleExe, JOptionPane.QUESTION_MESSAGE));
		n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "3° nota", titleExe, JOptionPane.QUESTION_MESSAGE));
		n4 = Double.parseDouble(JOptionPane.showInputDialog(null, "4° nota", titleExe, JOptionPane.QUESTION_MESSAGE));
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		if(media == 6) msg = "APROVADO";
		else if(media >= 3) msg = "EXAME";
		else msg = "REPROVADO";
		
		JOptionPane.showMessageDialog(null, String.format("Média: %.2f%n%s!", media, msg), titleExe, JOptionPane.INFORMATION_MESSAGE);
	}

}

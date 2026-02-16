package estruturas_repeticao;

import javax.swing.JOptionPane;

public class Lt01Ex31SquareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double resulSquare;
		String titleExer = "Quadrados do 10 ao 150";
		String msgResul = "";
		
		for(int i = 10; i <= 150; i++) {
			resulSquare = Math.pow(i, 2);
			
			
			if(i % 10 == 0 && i != 10) msgResul = msgResul.concat("\n");
			msgResul = msgResul.concat(String.format("%3d² = %6.0f | ", i, resulSquare));
		}
		
		JOptionPane.showMessageDialog(null, msgResul, titleExer, JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}

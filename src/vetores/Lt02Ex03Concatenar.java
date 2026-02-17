package vetores;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Lt02Ex03Concatenar {
	static final String TITLE_EXER = "Concatenar arrays";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vet1 = {1, 2, 3}, vet2 = {4, 5, 6};
		int[] vet3 = new int[6];
		
		for(int i = 0; i < 6; i++) {
			int index = i % 3;
			
			if(i < 3) vet3[i] = vet1[index];
			else vet3[i] = vet2[index];
		}
		
		String msgUser = String.format("vet3 = %s", Arrays.toString(vet3));
		JOptionPane.showMessageDialog(null, msgUser, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
	}

}

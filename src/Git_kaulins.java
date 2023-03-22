import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Git_kaulins {

	static void mestKaulinu(int reizes){
		Random rand = new Random();
		for(int i=1;i<=reizes;i++){
			JOptionPane.showMessageDialog(null,"Uzkrita: "+(rand.nextInt(6)+1));	
	}
	}
	public static void main(String[] args) {
	
int reizes = Integer.parseInt(JOptionPane.showInputDialog(null, "cik reizes metis kaulinu?"));
JOptionPane.showMessageDialog(null, "viss guud!");
mestKaulinu(reizes);
	}
	}



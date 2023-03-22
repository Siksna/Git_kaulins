import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Git_kaulins {

	static void mestKaulinu(int reizes){
		Random rand = new Random();
		int skaitlis;
		
		for(int i=1;i<=reizes;i++){
			skaitlis=rand.nextInt(6)+1;
			 ImageIcon icon = null;
			switch(skaitlis){
				case 1:
					icon = new ImageIcon("dice1.png");
					break;
				case 2:
					icon = new ImageIcon("dice2.png");
					break;
				case 3:
					icon = new ImageIcon("dice3.png");
					break;
				case 4:
					icon = new ImageIcon("dice4.png");
					break;
				case 5:
					icon = new ImageIcon("dice5.png");
					break;
				case 6: 
					icon = new ImageIcon("dice6.png");
			}
			JOptionPane.showMessageDialog(null,"Uzkrita: "+skaitlis, "Viss guud", JOptionPane.INFORMATION_MESSAGE, icon);	
	}
	}
	public static void main(String[] args) {
	
int reizes = Integer.parseInt(JOptionPane.showInputDialog(null, "cik reizes metis kaulinu?"));
JOptionPane.showMessageDialog(null, "viss guud!");
mestKaulinu(reizes);
	}
	}



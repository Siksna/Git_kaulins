import javax.swing.JOptionPane;

public class Vertejums_balles {

	public static void main(String[] args) {
	
		int studSk,sk=1;
		studSk=Integer.parseInt(JOptionPane.showInputDialog("Ievadi studentu skaitu: "));
		
		String []vardi= new String [studSk];
		for(int i=0;i<studSk;i++){
			vardi[i]=JOptionPane.showInputDialog("Ievadi "+sk+"studenta vârdu");
			sk++;
		}
		int [][]Vertejumi = new int [studSk][3];
		String []Kriteriji = {"Apmeklejums","Uzvediba","Nodarboðanâs","Papildus uzd. pildîðana"};

	}

}

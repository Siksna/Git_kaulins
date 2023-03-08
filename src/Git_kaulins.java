import java.util.Random;
import java.util.Scanner;

public class Git_kaulins {

	static void mestKaulinu(int reizes){
		Random rand = new Random();
		int skaitlis;
		for(int i=1;i<=reizes;i++){
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: "+skaitlis);	
	}
	}
	public static void main(String[] args) {
	
int reizes;

Scanner dati = new Scanner(System.in);
System.out.println("Cik reizes mest kaulinu?");
reizes = dati.nextInt();
mestKaulinu(reizes);
	}
	}



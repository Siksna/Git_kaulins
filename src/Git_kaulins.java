import java.util.Random;

public class Git_kaulins {
static void mestKaulinu(){
	int skaitlis;
	Random rand = new Random();
	skaitlis = rand.nextInt(6)+1;
	System.out.println("Uzkrita skaitlis: "+skaitlis);
}
	public static void main(String[] args) {
		
mestKaulinu();
	}

}

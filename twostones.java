import java.io.File;
import java.util.Scanner;

public class twostones {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		//Scanner c = new Scanner(new File("2.in"));
		int g = c.nextInt();
		System.out.println(g % 2 == 1? "Alice" : "Bob");

	}

}

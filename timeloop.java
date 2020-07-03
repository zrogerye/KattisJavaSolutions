import java.io.File;
import java.util.Scanner;

public class timeloop {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		//Scanner c = new Scanner(new File("2.in"));
		int time = c.nextInt();
		int count = 1;
		for(int x  = 0; x < time; x++)
		{
			System.out.println(count + " Abracadabra");
			count++;
		}
		

	}

}

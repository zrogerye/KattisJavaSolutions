import java.io.File;
import java.util.Scanner;

public class spavanac {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Scanner c = new Scanner(new File("spavanac.2.in"));
		Scanner c = new Scanner(System.in);
		int hours = c.nextInt();
		int minuets = c.nextInt();
		
		
		if(minuets < 45)
		{
			if(hours == 0)
			{
				hours = 23;
				minuets = 45 - minuets;
				minuets = 60 - minuets;
				System.out.println(hours + " " + minuets);
			}
			else {
				hours -= 1;
				minuets = 45 - minuets;
				minuets = 60 - minuets;
				System.out.println(hours + " " + minuets);
			}
		}
		else {
			System.out.println(hours + " " + (minuets - 45));
		}

	}

}

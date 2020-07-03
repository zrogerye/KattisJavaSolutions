import java.io.File;
import java.util.Scanner;

public class heartrate {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Scanner c = new Scanner(new File("heartrate-01.in"));
		//Scanner c = new Scanner(System.in);
		
		int asdf = c.nextInt();
		c.nextLine();
		for(int x = 0; x < asdf; x++)
		{
			double b = c.nextDouble();
			double p = c.nextDouble();
			
			
			double actual = 60 * b / p;
			
            double min = actual - (60 / p);
            
            double max = actual + (60 / p);
            
            
            System.out.printf("%.4f %.4f %.4f%n", min, actual, max);
            //System.out.printf("%.4f" , min); System.out.print(" "); System.out.printf("%.4f" , actual); System.out.print(" "); System.out.printf("%.4f", max);
           // System.out.println();
		}

	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class qaly {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		
		int asdf = c.nextInt();
		double sum = 0;
		for(int x = 0; x < asdf; x++)
		{
			double a = c.nextDouble();
			double b = c.nextDouble();
			sum += (a*b);
		}
		System.out.println(sum);

	}

}

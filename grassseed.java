import java.io.File;
import java.util.Scanner;

public class grassseed {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//Scanner g = new Scanner(new File("2.in"));
		Scanner g = new Scanner(System.in);
		double count = 0;
		double cost = g.nextDouble();
		int laws = g.nextInt();
		g.nextLine();
		for(int x = 0; x < laws; x++)
		{
			double width = g.nextDouble();
			double length = g.nextDouble();
			
			
			count += width*length;
		}
		count = count * cost;
		System.out.printf("%.7f",count);

	}

}

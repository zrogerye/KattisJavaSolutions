import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class estimatingtheareaofacircle {
	
	public void run()throws Exception{
		Scanner scan = new Scanner(System.in);

		while (true)
			{
			double radius = scan.nextDouble();
			double total  = scan.nextInt();
			double marked = scan.nextInt();
			
			if (radius == 0 && total == 0 && marked == 0)
				break;
			
			System.out.printf("%.6f" , radius * radius * Math.PI);
			System.out.print(" ");
			System.out.printf("%.6f" , (marked / total) * 4 * radius * radius);
			System.out.println();
			}

		scan.close();
			
			
		}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new estimatingtheareaofacircle().run();
	}

}

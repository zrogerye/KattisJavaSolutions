import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class beavergnaw {

	
	public void run()throws Exception{
		Scanner scan = new Scanner(System.in);

		while (true)
			{
			double D = scan.nextDouble();
			double V = scan.nextDouble();
			
			if (D == 0 && V == 0)
				break;
			
			System.out.println(Math.cbrt( (((-6) * V) / Math.PI) + (D*D*D)));
			}

		scan.close();return;
			
			
			
		}
		
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new beavergnaw().run();
	
	}
}

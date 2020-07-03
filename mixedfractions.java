import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class mixedfractions {
	public void run()throws Exception{
		Scanner c = new Scanner(System.in);
		while(c.hasNext()) {
			int a = c.nextInt();
			int b = c.nextInt();
			if(a == 0 && b == 0) {
				return;
			}
			
			int d = a / b;
			int e = a % b;
			System.out.println(d + " " + e + " " + "/" + " " + b);
		}
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new mixedfractions().run();
	}

}

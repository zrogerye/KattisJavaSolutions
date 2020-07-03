import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class herman {

	public void run()throws Exception{
		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();

		System.out.printf("%.6f" , input * input * Math.PI);
		System.out.println();
		System.out.printf("%.6f" , input * input * 2.0);
		System.out.println();

		scan.close();
		
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new herman().run();

	}

}

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
public class taisformula {
	
	public void run()throws Exception{
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt() - 1;
		    int t1 = sc.nextInt();
		    double v1 = sc.nextDouble(), area = 0;

		    while(n-- > 0){
		      int t2 = sc.nextInt();
		      double v2 = sc.nextDouble();

		      area += (((v2 + v1) / 2) * (t2 - t1)) / 1000;
		      t1 = t2;
		      v1 = v2;
		    }
		    System.out.printf("%f\n", area);
		    sc.close();
		
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new taisformula().run();

	}

}

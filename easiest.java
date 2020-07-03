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
public class easiest {
	
	 public int getSum(int n) 
	    {     
	        int sum = 0; 
	          
	        while (n != 0) 
	        { 
	            sum = sum + n % 10; 
	            n = n/10; 
	        } 
	        return sum; 
	    } 
	
	public void run()throws Exception{
		//Scanner c = new Scanner(new File("sample.in"));
		Scanner c = new Scanner(System.in);
		while(c.hasNextLine()) {
		int now = c.nextInt();
		int sumdigog = getSum(now);
		if(now == 0) {
			return;
		}
		
		
		
		int returned = 0;
		boolean done = false;
		
		int p = 11;
		
		while(done == false) {
			int temp = p * now;
			if(getSum(temp) == getSum(now)) {
				done = true;
				//System.out.println(getSum(temp));
				//System.out.println(temp);
				//System.out.println(getSum(now));
				//System.out.println(now);
			}
			p++;
		}
		System.out.println(p-1);
	}
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new easiest().run();
	}

}

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
public class freefood {
	
	public void run()throws Exception{
		Scanner c = new Scanner(System.in);
		int events = c.nextInt();
		
		int min = 400, max = -1;
		boolean[] free = new boolean[366];
		
		while(events-- > 0) {
			int a = c.nextInt();
			int b = c.nextInt();
			min = Math.min(min,  a);
			max = Math.max(max,  b);
			
			for(; a <= b; a++) 
				free[a] = true;
			
		}
		
		int days = 0;
		for(; min <= max ; min++) 
			if(free[min]) 
				days++;
		System.out.println(days);
		c.close();
				
		
		
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new freefood().run();
	}

}

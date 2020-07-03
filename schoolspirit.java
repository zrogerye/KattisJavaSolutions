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
public class schoolspirit {
	
	public void run()throws Exception{
		Scanner c = new Scanner(System.in);
		int asdf = c.nextInt();
		ArrayList<Integer> all = new ArrayList<Integer>();
		
		for(int  i = 0; i < asdf; i++) {
			int temp = c.nextInt();
			all.add(temp);
		}
		
		double group = score_calc(all);
		double avg = avgcalc(all);
		
		System.out.println(group);
		System.out.println(avg);
		
		
		
		
		
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new schoolspirit().run();
	}
	
	
	
	
	
	
	private double score_calc(ArrayList<Integer> all) {
		int n = all.size();
		double sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += all.get(i) * (Math.pow(0.8, i));
		}
		
		sum = sum*.2;
		
		return sum;
	}
	
	private double avgcalc(ArrayList<Integer> all) {
		int n = all.size();
		double avg = 0;
		
		for(int i = 0; i < n; i++) {
			ArrayList<Integer> uhm = (ArrayList<Integer>) all.clone();
			uhm.remove(i);
			avg += score_calc(uhm);
			
		}
		return avg / n;
	}

}

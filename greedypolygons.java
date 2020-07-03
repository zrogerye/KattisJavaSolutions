import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class greedypolygons {
	
	public void run()throws Exception{
		Scanner c = new Scanner(System.in);
		//Scanner c = new Scanner(new File("sample1.in"));
		int asdf = c.nextInt();
		for(int i = 0 ; i < asdf; i++) {
			int number_of_sides = c.nextInt();
			int length_of_initial_side = c.nextInt();
			int distance_of_expansion = c.nextInt();
			int grabs_of_land = c.nextInt();
			
			

			System.out.println(expanded_area(number_of_sides, length_of_initial_side,distance_of_expansion,grabs_of_land));
			
		}
		
	}
	
	public static double cot(double d) {
		return (1/Math.tan(d));
	}
	
	public double angle_expansion(int d, int g) {
		return Math.pow((d*d), 2)*Math.PI;
	}
	
	public double side_expansion(int n, int l, int d, int g) {
		return n*l*d*g;
	}
	
	public double ngon_area(int n, int l) {
		return 0.25 * n * (Math.pow(l, 2)) * cot(Math.PI / n);
	}
	
	public double expanded_area(int n, int l, int d, int g) {
		return ngon_area(n,l) + side_expansion(n,l,d,g) + angle_expansion(d,g);
	}
	
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new greedypolygons().run();
	}
}


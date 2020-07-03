import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class pizza2 {
	
	public void run()throws Exception{
		Scanner c = new Scanner(System.in);
		String[] pizzaThing = c.nextLine().trim().split(" ");
		double radii = Double.parseDouble(pizzaThing[0]);
		double crust = radii - Double.parseDouble(pizzaThing[1]);
		
		double fin = crust * crust * Math.PI / (radii * radii*Math.PI);
		System.out.println(fin*100);
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new pizza2().run();

	}

}

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class missingnumbers {
	
	public void run()throws Exception{
		//Scanner c = new Scanner(new File("2.in"));
		Scanner c = new Scanner(System.in);
		ArrayList<Integer>input = new ArrayList<Integer>();
		ArrayList<Integer>output = new ArrayList<Integer>();
		
		int f = c.nextInt();
		for(int i = 0 ; i < f; i++) {
			input.add(c.nextInt());
		}
		
		
		
		
		
		
		//last number in input
		int last = input.get(input.size()-1);
		
		
		
		for(int i = 1; i < last; i++) {
			if(input.contains(i)==false) {
				output.add(i);
			}
		}
		
		if(output.size() == 0) {
			System.out.println("good job");
		}else {
			for(int i = 0; i < output.size(); i++) {
				System.out.println(output.get(i));
			}
		}
		
		

		
		
		
		
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new missingnumbers().run();

	}

}

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
public class sodaslurper {
	
	public void run()throws Exception{
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		int f = sc.nextInt();
		int c = sc.nextInt();
		
		int sodas = 0;
		int bottles = e+f;
		while(bottles - c >= 0) {
			bottles = bottles - c;
			bottles++;
			sodas++;
		}
		System.out.println(sodas);
		
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new sodaslurper().run();
	}

}

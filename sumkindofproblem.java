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
public class sumkindofproblem {
	
	public void run()throws Exception{
		Scanner file = new Scanner(System.in);
		int asdf = file.nextInt();
		for(int i = 0 ; i < asdf; i++) {
			int caseNum = file.nextInt();
			int nth = file.nextInt();
			int posSum = nPositives(nth);
			int oddSum = nOdds(nth);
			int eveSum = nEvens(nth);
			
			System.out.println(caseNum + " " + posSum + " " + oddSum + " " + eveSum);
		}
	}
	
	
	public static int nPositives(int nth) {
		int limit = nth;
		int turns = 0;
		int count = 1;
		int returns = 0;
		
		while(turns < limit) {
			returns += count;
			count++;
			turns++;
		}
		
		return returns;
		
	}
	
	public static int nEvens(int nth) {
		int turns = 0;
		int count = 1;
		int returns = 0;
		
		while(turns < nth) {
			if(count % 2 == 0) {
				returns += count;
				turns++;
				count++;
			}else {
				count++;
			}
		}
		return returns;
	}
	
	public static int nOdds(int nth) {
		int turns = 0;
		int count = 1;
		int returns = 0;
		
		while(turns < nth) {
			if(count % 2 != 0) {
				returns += count;
				turns++;
				count++;
			}else {
				count++;
			}
		}
		return returns;
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new sumkindofproblem().run();


	}

}

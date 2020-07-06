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
public class basketballoneonone {
	
	public void run()throws Exception{
		Scanner file = new Scanner(System.in);
		String all = file.nextLine().trim();
		
		int A = 0;
		int B = 0;
		
		for(int x = 0; x < all.length(); x = x+2) {
			if(all.substring(x,x+1).equals("A")){
				A+=Integer.parseInt(all.substring(x+1,x+2));
			}
			if(all.substring(x,x+1).equals("B")) {
				B+=Integer.parseInt(all.substring(x+1,x+2));
			}
		}
		
		if(A > B) {
			System.out.println("A");
		}
		if(B > A) {
			System.out.println("B");
		}

		
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new basketballoneonone().run();
	}

}

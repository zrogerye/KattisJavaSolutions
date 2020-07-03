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
public class alphabetspam {
	public void run()throws Exception{
		Scanner c = new Scanner(System.in);
		String now = c.nextLine().trim();
		String lower = "qwertyuioplkjhgfdsazxcvbnm";
		String upper = "QWERTYUIOPLKJHGFDSAZXCVBNM";
		double white = 0;
		double lowercase = 0;
		double uppercase = 0;
		double symbols = 0;
		
		
		for(int x = 0; x < now.length(); x++) {
			if(lower.contains(now.substring(x,x+1))) {
				lowercase++;
			}
			if(upper.contains(now.substring(x,x+1))) {
				uppercase++;
			}
			if(now.substring(x,x+1).equals("_")) {
				white++;
			}
			if(!now.substring(x,x+1).equals("_") && upper.contains(now.substring(x,x+1))==false && lower.contains(now.substring(x,x+1))==false){
				symbols++;
			}
		}
		
		System.out.println(white / now.length());
		System.out.println(lowercase / now.length());
		System.out.println(uppercase / now.length());
		System.out.println(symbols / now.length());
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new alphabetspam().run();
	}

}

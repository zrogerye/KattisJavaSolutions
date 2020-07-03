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
public class quiteaproblem {
	
	public void run()throws Exception{
		Scanner c = new Scanner(System.in);
		while(c.hasNextLine()) {
			String temp = c.nextLine().toLowerCase();
			if(temp.contains("problem")) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new quiteaproblem().run();

	}

}

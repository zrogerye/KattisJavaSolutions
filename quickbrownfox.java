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
public class quickbrownfox {
	
	
	public void run()throws Exception{
		Scanner c = new Scanner(System.in);
		//Scanner c = new Scanner(new File("a.in"));
		String al = "abcdefghijklmnopqrstuvwxyz";
		String[] alpha = al.split("");
		int asdf = c.nextInt();
		c.nextLine();
		
		for(int i = 0 ; i < asdf; i++) {
			ArrayList<String>missings = new ArrayList<String>();
			String temp = c.nextLine().trim().toLowerCase();
			for(int x = 0; x<alpha.length; x++) {
				if(temp.contains(alpha[x]) == false) {
					missings.add(alpha[x]);
				}
			}
			
			if(missings.size() == 0) {
				System.out.println("pangram");
			} else {
				String miss = "";
				for(int x = 0; x < missings.size(); x++) {
					miss+=missings.get(x);
				}
				
				System.out.println("missing " + miss);
			}
		}
	}
	
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new quickbrownfox().run();
	}

}

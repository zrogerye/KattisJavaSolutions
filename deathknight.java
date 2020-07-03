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


public class deathknight {
	
	
	
	public void run()throws Exception{
		Scanner c = new Scanner(System.in);
		
		int battles = c.nextInt();
		int wins = 0;
		c.nextLine();
		while(battles > 0) {
			String abilities = c.nextLine();
			if(!abilities.contains("CD")) {
				wins++;
			
			}
			battles--;
		}
		System.out.println(wins);
		c.close();
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new deathknight().run();
	}

}

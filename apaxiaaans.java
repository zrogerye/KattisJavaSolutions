import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class apaxiaaans {
	
	public void run()throws Exception{
		Scanner c = new Scanner(System.in);
		String dab = c.nextLine().trim();
		
		
		String finals = dab.substring(0,1);
		for(int x = 1; x < dab.length(); x++) {
			if(!dab.substring(x,x+1).equals(dab.substring(x-1,x))) {
				finals += dab.substring(x,x+1);
			}
		}
		System.out.println(finals);
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new apaxiaaans().run();

	}

}

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
public class chanukah {
	
	public void run()throws Exception{
		/* Scanner c = new Scanner(new File("sample01.in")); */
		Scanner c = new Scanner(System.in);
		int asdf = c.nextInt();
		c.nextLine();
		for(int i = 0; i < asdf; i++) {
			int k = c.nextInt();
			int n = c.nextInt();
			
			int temp = 0;
			for(int x = 1; x < n+1; x++) {
				temp+=x;
			}
			temp += n;
			System.out.println(k + " " + temp);
		}
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new chanukah().run();
	}

}

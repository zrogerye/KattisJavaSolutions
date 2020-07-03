import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class encodedmessage {
	
	public void run()throws Exception{
		Scanner scan = new Scanner(System.in);

		int testcases = scan.nextInt();
		scan.nextLine();

		for (int zax = 0; zax < testcases; zax++)
			{
			String str = scan.nextLine();
			int len = (int)Math.sqrt(str.length());
			
			for (int j = 0; j < len; j++)
				for (int i = len - 1; i < str.length(); i += len)
					System.out.print(str.charAt(i - j));
			
			System.out.println();
			}

		scan.close();
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new encodedmessage().run();
	}

}

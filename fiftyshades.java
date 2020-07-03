import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class fiftyshades {
	
	public void run()throws Exception{
	//	Scanner c = new Scanner(new File("1.in"));
		Scanner c = new Scanner(System.in);
		int asdf = c.nextInt();
		c.nextLine();
		int count = 0;
		for(int i = 0; i < asdf; i++) {
			String temp = c.nextLine().toLowerCase();
			if(temp.contains("rose") || temp.contains("pink")) {
				count++;
			}
			
		}
		if(count == 0) {
			System.out.println("I must watch Star Wars with my daughter");
		}
		if(count > 0) {
			System.out.println(count);
		}
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new fiftyshades().run();
	}

}

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
public class simon {
	
	public void run()throws Exception{
		Scanner sc = new Scanner(System.in);
		int asdf = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < asdf; i++) {
			String line = sc.nextLine();
			System.out.println(line.startsWith("simon says") && !line.contentEquals("simon says") ? line.substring(11) : "");
		}
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new simon().run();
	}

}

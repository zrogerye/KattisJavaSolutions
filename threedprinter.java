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
public class threedprinter {
	
	public void run()throws Exception{
		Scanner c = new Scanner(System.in);
		int asdf = c.nextInt();
		System.out.println(1 + (int)Math.ceil(Math.log(asdf) / Math.log(2)));
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new threedprinter().run();
	}

}

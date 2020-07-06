import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class bookingaroom {
	
	
	public void run()throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer file = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(file.nextToken());
		int r = Integer.parseInt(file.nextToken());
		HashSet<Integer>rooms = new HashSet<Integer>();
		for(int i = 1; i <= n; i++) {
			rooms.add(i);
		}
		
		
		
		for(int i =0 ; i < r; i++) {
			rooms.remove(Integer.parseInt(in.readLine()));
		}
		
		
		
		if(rooms.size()==0) {
			out.println("too late");
			out.close();
		}
		
		
		
		for(int room : rooms) {
			out.println(room);
			out.close();
		}
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new bookingaroom().run();
	}

}

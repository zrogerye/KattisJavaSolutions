import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class t9spelling {
	
	
	public void run()throws Exception{
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(file.readLine());
        HashMap<String, String> input = new HashMap<String, String>();
        input.put("a", "2");
        input.put("b", "22");
        input.put("c", "222");
        input.put("d", "3");
        input.put("e", "33");
        input.put("f", "333");
        input.put("g", "4");
        input.put("h", "44");
        input.put("i", "444");
        input.put("j", "5");
        input.put("k", "55");
        input.put("l", "555");
        input.put("m", "6");
        input.put("n", "66");
        input.put("o", "666");
        input.put("p", "7");
        input.put("q", "77");
        input.put("r", "777");
        input.put("s", "7777");
        input.put("t", "8");
        input.put("u", "88");
        input.put("v", "888");
        input.put("w", "9");
        input.put("x", "99");
        input.put("y", "999");
        input.put("z", "9999");
        input.put(" ", "0");
        
        for(int i = 0; i < n; i++) {
            String last = " ";
            String line = file.readLine();
            System.out.print("Case #" + (i + 1) + ": ");
            for(int j = 0; j < line.length(); j++) {
                String curr = line.substring(j, j + 1);
                if(curr.equals(last) || input.get(curr).contains(input.get(last).substring(0, 1))) {
                    System.out.print(" ");
                    System.out.print(input.get(curr));
                }
                else System.out.print(input.get(curr));
                last = curr;
            }
            if(i != n - 1) System.out.println();
        }
        System.out.close();
}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new t9spelling().run();
	}

}

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
public class drunkvigenere {
	
	public void run()throws Exception{
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));

        String en = file.readLine(), key = file.readLine();
        String og = "";
        for (int i = 0; i < en.length(); i++) {
            int c = en.charAt(i), k = key.charAt(i), ck;
            if (i % 2 == 0) {
                ck = (c - 65) - (k - 65);
                if (ck < 0) ck += 26;
                ck += 65;
                og += (char) ck;
            }
            else {
                ck = (c - 65) + (k - 65);
                ck %= 26;
                ck += 65;
                og += (char) ck;
            }
        }
        System.out.println(og);
		
		
		
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new drunkvigenere().run();
	}
	

}

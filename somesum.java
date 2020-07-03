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
public class somesum {
	
	public void run()throws Exception{
		Scanner c = new Scanner(System.in);
		int uh = c.nextInt();
		
		if(uh == 1) {
			System.out.println("either");
			return;
		}
		double half = uh / 2d;
        int h1 = (int) Math.floor(half);
        int h2 = (int) Math.ceil(half);
        if (h1 == h2)
            if (h1 % 2 == 1)
                System.out.println("Odd");
            else
                System.out.println("Even");
        else
            System.out.println("Either");
		
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new somesum().run();
	}

}

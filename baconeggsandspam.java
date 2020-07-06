import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class baconeggsandspam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true)
		{
			int num = scan.nextInt();
			HashMap<String , ArrayList<String>> map = new HashMap<>();
			ArrayList<String> foods = new ArrayList<>();
			
			if (num == 0)
				break;
			
			for (int sloths = 0; sloths < num; sloths++)
			{
				String name = scan.next();
				String[] all = scan.nextLine().substring(1).split(" ");
				
				for (int i = 0; i < all.length; i++)
				{
					if (!map.containsKey(all[i]))
					{
						ArrayList<String> in = new ArrayList<>();
						in.add(name);
						map.put(all[i] , in);
						foods.add(all[i]);
					}
					else
					{
						ArrayList<String> in = map.get(all[i]);
						in.add(name);
						map.put(all[i] , in);
					}
				}
			}
			
			Collections.sort(foods);
			
			for (int i = 0; i < foods.size(); i++)
			{
				System.out.print(foods.get(i));
				
				ArrayList<String> names = map.get(foods.get(i));
				Collections.sort(names);
				
				for (int z = 0; z < names.size(); z++)
					System.out.print(" " + names.get(z));
				
				System.out.println();
			}	
			System.out.println();
		}		
		scan.close();
    }
}
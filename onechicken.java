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
public class onechicken {
	
	public void run()throws Exception{
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int chickens = sc.nextInt();
		
		if(people > chickens) {
			int needs = people - chickens;
			if(needs == 1) {
				System.out.println("Dr. Chaz needs " + needs + " more piece of chicken!");
			}
			if(needs > 1) {
				System.out.println("Dr. Chaz needs " + needs + " more pieces of chicken!");
			}
		}
		if(chickens > people) {
			int overs = chickens - people;
			if(overs == 1) {
				System.out.println("Dr. Chaz will have " + overs + " piece of chicken left over!");
			}
			if(overs > 1) {
				System.out.println("Dr. Chaz will have " + overs + " pieces of chicken left over!");
			}
		}
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new onechicken().run();
	}

}

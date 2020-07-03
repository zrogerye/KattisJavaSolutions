import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class relocation {
	
	public void run()throws Exception{
		Scanner sc = new Scanner(System.in);
	    int companies = sc.nextInt();
	    int queries = sc.nextInt();
	    ArrayList<Integer> locations = new ArrayList<>();
	    locations.add(0);
	    for(int i = 0; i < companies; i++){
	      locations.add(sc.nextInt());
	    }
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < queries; i++){
	      int arr1 = sc.nextInt();
	      int arr2 = sc.nextInt();
	      int arr3 = sc.nextInt();
	      if(arr1==2){
	        sb.append(Math.abs(
	            locations.get(arr2) - locations.get(arr3)))
	            .append(System.lineSeparator());
	      }
	      else{
	        locations.set(arr2, arr3);
	      }
	    }
	    System.out.print(sb.toString());
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new relocation().run();
	}

}

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
public class pauleigon {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int turns =  sc.nextInt() + sc.nextInt();
	    if(turns / N % 2 == 0){
	      System.out.println("paul");
	    }
	    else{
	      System.out.println("opponent");
	    }
	  }
	}
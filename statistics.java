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
public class statistics {
	
	public void run()throws Exception{
		Scanner file= new Scanner(System.in);
        int caseCnt = 0;
        while(file.hasNext()){
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            int n = file.nextInt();
            for(int i=0;i<n;i++){ 
                int x = file.nextInt();
                if(min>x)min=x;
                if(max<x)max=x;
            }
            System.out.println("Case "+ ++caseCnt+": "+min+" "+max+" "+(max-min));
		}
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new statistics().run();
	}

}

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
public class oddmanout {
	
	public void run()throws Exception{
		Scanner sc=new Scanner(System.in);
        int totalCases=sc.nextInt();
        for(int c=0; c<totalCases;c++){
            int n=sc.nextInt();
            HashSet<Integer> x=new HashSet<>(); int y;
            for(int i=0;i<n;i++){
                y=sc.nextInt();
                if(x.contains(y)) x.remove(y);
                else{x.add(y);}
            }
            System.out.println("Case #"+(c+1)+": "+(x.toArray())[0]);   
        }
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new oddmanout().run();
	}

}

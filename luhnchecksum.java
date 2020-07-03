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
public class luhnchecksum {
	
	public void run()throws Exception{
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(reader.readLine());
	        for(int i = 0; i < n; i++){
	            String in = reader.readLine();
	            int total = 0;
	            for(int j = 0; j < in.length(); j++){
	                if(j%2 == in.length() % 2){
	                    int add = (in.charAt(j) - 48) * 2;
	                    if(add >9){
	                        int p = add % 10;
	                        add = Math.floorDiv(add, 10);
	                        //  += add;
	                        add += p;
	                    }// f

	                    total+= add;
	                }// f
	                else{
	                    total+= in.charAt(j)-48;
	                }// lse
	            }// or j
	            if(total%10==0){
	                System.out.println("PASS");
	            }// fs
	            else{
	                System.out.println("FAIL");
	            }
	        }// or i
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new luhnchecksum().run();
	}
	
	public boolean luhn (String no)
	{
		 int c=0;
	   	 int sum=0;
		 boolean second=false;
		 int length=no.length();
		 
	         for(int i=length-1;i>=0;i--)
		 	{c=Integer.parseInt(""+no.charAt(i));		
		 	 if (second==true)
		        	c=c*2;	
			 
			 sum +=c/10;
			 sum +=c%10;
			 second=!second;
			
			}
		
		 return (sum%10==0);
		 
		}

}

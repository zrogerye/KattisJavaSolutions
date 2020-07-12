import java.util.*;
import java.io.*;
public class eligibility {
	
	public void run()throws Exception{
		new eligibility().run();
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int asdf = sc.nextInt();
	        for(int i=0;i<asdf; i++){
	            String name = sc.next();
	            String began = sc.next();
	            String born = sc.next();
	            int courses = sc.nextInt();
	            int year = Integer.parseInt(began.substring(2, 4));
	            if(Integer.parseInt(began.substring(2,4))>=10){
	                System.out.println(name+" eligible");
	            }else if(Integer.parseInt(born.substring(0,4))>=1991){
	                System.out.println(name+" eligible");
	            }else if(courses>40){
	                System.out.println(name+" ineligible");
	            }else{
	                System.out.println(name+" coach petitions");
	            }
	        }
		}
}

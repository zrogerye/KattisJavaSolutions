 import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set; 
 
public class lineup{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a=Integer.parseInt(in.nextLine());
		ArrayList<String>s1=new ArrayList<String>();
		for(int i=0;i<a;i++)
		{
			String s=in.nextLine();
			s1.add(s);
		}
		boolean decreasing=false;
		boolean increasing=false;
		for(int j=0;j<s1.size()-1;j++)
		{
			if(s1.get(j).compareTo(s1.get(j+1))<0)
			{
				decreasing=true;
			}
			else
			{
				increasing=true;
			}
		}
		if(increasing&&decreasing)
		{
			System.out.println("NEITHER");
		}
		else if(!increasing)
		{
			System.out.println("INCREASING");
		}
		else
		{
			System.out.println("DECREASING");
		}
	}
} 
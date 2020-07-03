import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class autori {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(new File("autori.1.in"));
		//Scanner c = new Scanner(System.in);
		String fin = "";
		String temp = c.next();
		
		
		String alpha = "QWERTYUIOPASDFGHJKLZXCVBNM";
		
		for(int x = 0; x < temp.length(); x++)
		{
			if(alpha.contains(temp.substring(x,x+1)))
			{
				fin+=temp.substring(x,x+1);
			}
		}
		System.out.println(fin);
		
		 
		
		

	}

}

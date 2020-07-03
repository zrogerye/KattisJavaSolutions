import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class kleptography {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Scanner c = new Scanner(new File("2.in"));
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();                                     
		int m = c.nextInt();                                    
		c.nextLine();
		String lastn = c.next();                                 
		c.nextLine();
		String cipher = c.nextLine();                            
		String[] final1 = new String[m];
		int z = final1.length-lastn.length();
		for(int y = 0; y < lastn.length(); y++)
		{
			final1[z] = lastn.substring(y,y+1);
			z++;
		}
		  ArrayList<String> alpha = new ArrayList<String>(Arrays.asList
		  ("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s",
		  "t","u","v","w","x","y","z")); int temp = 0; int temp1 = 0; int temp2 = 0;
		  for(int x = m-n-1 ; x > -1; x--)
		  { 
			  temp = alpha.indexOf(cipher.substring(x+n,x+n+1));   //cipher text position in alpha
			  temp1 = alpha.indexOf(final1[x+n]);
			  temp2 = temp - temp1;
			  if(temp2 < 0)
			  {
				  temp2 += 26;
			  }
			    
			  final1[x] = alpha.get(temp2);
		  }
		  String final2 = "";
		  for(int x = 0; x < final1.length; x++)
		  {
			  final2+=final1[x];
		  }
		  System.out.println(final2);
	}

}

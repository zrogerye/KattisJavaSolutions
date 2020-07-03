import java.io.File;
import java.util.Scanner;

public class trik {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Scanner c = new Scanner(new File("2.in"));
		Scanner c = new Scanner(System.in);
		
		String all  = c.nextLine().trim();
		String[] uhm = {"here",null,null};
		
		for(int x = 0; x < all.length(); x++)
		{
			if(all.substring(x,x+1).equals("A"))
			{
				String temp = "";
				temp = uhm[0];
				uhm[0] = uhm[1];
				uhm[1] = temp;
			}
			if(all.substring(x,x+1).equals("B"))
			{
				String temp = "";
				temp = uhm[1];
				uhm[1] = uhm[2];
				uhm[2] = temp;
			}
			if(all.substring(x,x+1).equals("C"))
			{
				String temp = "";
				temp = uhm[0];
				uhm[0] = uhm[2];
				uhm[2] = temp;
			}
				
		}
		int spot = 0;
		for(int x = 0; x < uhm.length; x++)
		{
			if(uhm[x] != null)
			{
				spot = x;
			}
		}
		if(spot == 0)
		{
			System.out.println(1);
		}
		if(spot == 1)
		{
			System.out.println(2);
		}
		if(spot == 2)
		{
			System.out.println(3);
		}

	}

}

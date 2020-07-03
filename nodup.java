import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class nodup {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(new File("3.in"));
		//Scanner c = new Scanner(System.in);
		
		String x = c.nextLine().trim();
		
		
		String[] y = x.split(" ");
		
		
		
		ArrayList<String> g = new ArrayList<String>();
		
		String uhm = "yes";
		for(int z = 0; z < y.length; z++)
		{
			if(g.contains(y[z]))
			{
				uhm = "no";
				break;
			}
			g.add(y[z]);
		}
		System.out.println(uhm);
		
		

	}

}

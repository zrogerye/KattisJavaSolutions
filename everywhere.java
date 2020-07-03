import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class everywhere {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Scanner c = new Scanner(new File("everywhere-01.in"));
		Scanner c = new Scanner(System.in);
		
		int asdf = c.nextInt(); c.nextLine();

		for(int x = 0; x < asdf; x++)
		{
			ArrayList<String> cities = new ArrayList<String>();
			int differences = 0;
			int set = c.nextInt(); c.nextLine();
			for(int y = 0 ; y < set; y++)
			{
				String temp = c.nextLine();
				if(!cities.contains(temp))
				{
					cities.add(temp);
				}
			}
			System.out.println(cities.size());
			
			
			
		}
		

	}

}

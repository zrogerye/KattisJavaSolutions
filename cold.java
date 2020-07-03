import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class cold {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Scanner c = new Scanner(System.in);
		//Scanner c = new Scanner(new File("cold-002.in"));
		
		int x = c.nextInt();
		ArrayList<Integer> john = new ArrayList<Integer>();
		int temp = 0;
		
		
		for(int y = 0; y < x; y++)
		{
			temp = c.nextInt();
			john.add(temp);
		}
		int count = 0;
		for(int f = 0; f < john.size(); f++)
		{
			if(john.get(f) < 0)
			{
				count++;
			}
		}
		System.out.println(count);
		
		

	}

}

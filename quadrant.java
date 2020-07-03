import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class quadrant {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner c = new Scanner(System.in);
		//Scanner c = new Scanner(new File("2.in"));
		int x = c.nextInt();
		int y = c.nextInt();
		
		
		
		if(x > 0 && y > 0)
		{
			System.out.println(1);
		}
		if(x > 0 && y < 0)
		{
			System.out.println(4);
		}
		if(x < 0 && y > 0)
		{
			System.out.println(2);
		}
		if(x < 0 && y < 0)
		{
			System.out.println(3);
		}
		

	}

}

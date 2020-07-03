import java.io.File;
import java.util.Scanner;

public class cetvrta {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Scanner c = new Scanner(new File("2.in"));
		Scanner c = new Scanner(System.in);
		
		int x1 = c.nextInt();
		int y1 = c.nextInt();
		int x2 = c.nextInt();
		int y2 = c.nextInt();
		int x3 = c.nextInt();
		int y3 = c.nextInt();
		int x4 = 0;
		int y4 = 0;
		
		
		if(x1 == x2)
		{
			x4 = x3;
		}
		if(x1 == x3)
		{
			x4 = x2;
		}
		if(x2 == x3)
		{
			x4 = x1;
		}
		
		
		
		if(y1 == y2)
		{
			y4 = y3;
		}
		if(y1 == y3)
		{
			y4 = y2;
		}
		if(y2 == y3)
		{
			y4 = y1;
		}
		
		
		System.out.println(x4 + " " + y4);
		

	}

}

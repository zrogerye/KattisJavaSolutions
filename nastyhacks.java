import java.io.File;
import java.util.Scanner;

public class nastyhacks {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Scanner c = new Scanner(new File("1.in"));
		Scanner c = new Scanner(System.in);
		int asdf = c.nextInt();
		c.nextLine();
		for(int x = 0; x < asdf; x++)
		{
			int revenue = c.nextInt();
			int expected = c.nextInt();
			int cost = c.nextInt();
			
			if(expected - cost > revenue)
			{
				System.out.println("advertise");
			}
			if(expected - cost == revenue)
			{
				System.out.println("does not matter");
			}
			if(expected - cost < revenue)
			{
				System.out.println("do not advertise");
			}
			
			
		}

	}

}

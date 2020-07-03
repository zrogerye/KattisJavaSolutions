import java.io.File;
import java.util.Scanner;

public class hangingout {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		//Scanner c = new Scanner(new File("1.in"));
		int safety = c.nextInt();
		int events = c.nextInt();
		int notallowed = 0;
		int total = 0;
		for(int x = 0; x < events; x++)
		{
			
			String temp = "";
			int tempint = 0;
			temp = c.next();
			tempint = c.nextInt();
			
			if(temp.equals("leave"))
			{
				total -= tempint;
			}
			if(temp.equals("enter"))
			{
				if(total + tempint > safety)
				{
					notallowed++;
				}
				else {
					total += tempint;
				}
			}
			
		}
		System.out.println(notallowed);

	}

}

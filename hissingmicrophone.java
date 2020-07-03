import java.io.File;
import java.util.Scanner;

public class hissingmicrophone {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Scanner file = new Scanner(new File("hissingmicrophone-03.in"));
		Scanner file = new Scanner(System.in);
		String x = file.nextLine().trim();
		String[] xx = x.split("");
		int count = 0;
		for(int y = 0; y < xx.length-1; y++)
		{
			if(xx[y].equals("s") && xx[y+1].equals("s"))
			{
				count++;
			}
		}
		if(count > 0)
		{
			System.out.println("hiss");
		}
		else {
			System.out.println("no hiss");
		}

	}

}

import java.io.File;
import java.util.Scanner;

public class aaah {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		String him = c.nextLine();
		String doctor = c.nextLine();
		
		int himcount = 0;
		int doctorcount = 0;
		
		for(int x = 0; x < him.length(); x++)
		{
			if(him.substring(x,x+1).equals("a"))
			{
				himcount++;
			}
		}
		
		
		for(int x = 0; x < doctor.length(); x++)
		{
			if(doctor.substring(x,x+1).equals("a"))
			{
				doctorcount++;
			}
		}
		
		
		if(himcount >= doctorcount)
		{
			System.out.println("go");
		}
		else {
			System.out.println("no");
		}
		

	}

}

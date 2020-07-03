import java.io.File;
import java.util.Scanner;

public class isithalloween {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Scanner file = new Scanner(new File("2.in"));
		Scanner file = new Scanner(System.in);
		
		String x = file.nextLine();
		String[] xx = x.split(" ");
		if(xx[0].equals("OCT") && xx[1].contentEquals("31") ||  xx[0].contentEquals("DEC") && xx[1].equals("25"))
		{
			System.out.println("yup");
		}
		else { 
			System.out.println("nope");
		}

	}

}

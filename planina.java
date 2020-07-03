import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class planina {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Scanner c = new Scanner(System.in);
		//Scanner c = new Scanner(new File("planina.1.in"));
		
		int x = c.nextInt();
		int s = 2;
		for(int y = 0; y < x; y++)
		{
			s += s -1;
		}
		System.out.println(s*s);

	}

}

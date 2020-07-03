import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class reversebinary {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		int initial = c.nextInt();
		String binarynew = Integer.toBinaryString(initial);
		String result = "";
		for(int x = binarynew.length()-1;x > -1 ;x--)
		{
			result+=binarynew.substring(x,x+1);
		}
		int foo = Integer.parseInt(result, 2);
		System.out.println(foo);

	}

}

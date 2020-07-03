import java.io.File;
import java.util.Scanner;

public class sumsquareddigits {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		//Scanner c = new Scanner(new File("sample01.in"));
		Scanner c = new Scanner(System.in);
		
		
		int asdf = c.nextInt();
		c.nextLine();
		
		for(int x = 0; x < asdf; x++)
		{
			int k = c.nextInt();
			int base = c.nextInt();
			int num = c.nextInt();
			int sum = 0;
			
			while (num > 0) {
                int dig = (int) num % base;
                sum += dig * dig;
                num = (num - dig) / base;
            }
			
			
			System.out.println(k + " " + sum);
		}
		
		

	}

}

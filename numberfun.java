import java.io.File;
import java.util.Scanner;

public class numberfun {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Scanner c = new Scanner(new File("sample01.in"));
		Scanner c = new Scanner(System.in);
		
		
		int asdf = c.nextInt();
		c.nextLine();
		
		for(int x = 0; x < asdf; x++) {
			
			double a = c.nextInt();
			double b = c.nextInt();
			double d = c.nextInt();
		
		
			if(a+b==d || a-b==d ||a*b==d || a/b==d || b-a==d || b/a==d)
			{
				System.out.println("Possible");
			}
			else {
				System.out.println("Impossible");
			}
		
		
		}

}
}

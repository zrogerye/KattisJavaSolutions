import java.io.File;
import java.util.Scanner;
public class ladder {
	public void run()throws Exception{
//		Scanner c = new Scanner(new File("ladder.00.in"));
		Scanner c = new Scanner(System.in);
		double h = c.nextInt();
		double d = c.nextInt();
		double x = Math.sin(Math.toRadians(d));
		System.out.println((int) Math.ceil(h/x));
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new ladder().run();
	}
}

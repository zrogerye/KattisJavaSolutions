import java.io.File;
import java.util.Scanner;

public class judgingmoose {

	public void run()throws Exception{
		boolean moose = true;
		Scanner c = new Scanner(System.in);
		int left = c.nextInt();
		int right = c.nextInt();
		if(right == 0 && left == 0) {
			System.out.println("Not a moose");
			return;
		}
		if(left == right) {
			System.out.println("Even "+ Math.max(left,right)*2);
		}
		if(left > right) {
			System.out.println("Odd " + Math.max(left,right)*2); 
		}
		if(right > left) {
			System.out.println("Odd " + Math.max(left,right)*2);
		}
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new judgingmoose().run();
	}

}

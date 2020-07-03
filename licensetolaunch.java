import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class licensetolaunch {

	public void run()throws Exception{
		//Scanner c = new Scanner(new File("1.in"));
		Scanner c = new Scanner(System.in);
		int asdf = c.nextInt();
		c.nextLine();
		String[] a = c.nextLine().trim().split(" ");
		ArrayList<Integer> total = new ArrayList<Integer>();
		for(int x = 0; x < a.length; x++) {
			total.add(Integer.parseInt(a[x]));
		}
		
		int min = total.get(0);
		int pos = 0;
		for(int x = 0 ; x < total.size(); x++) {
			if(total.get(x) < min) {
				min = total.get(x);
				pos = x;
			}
		}
		System.out.println(pos);
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new licensetolaunch().run();
	}

}

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class jobexpenses {

	public void run()throws Exception{
		Scanner c = new Scanner(System.in);
		int times = c.nextInt();
		ArrayList<Integer> ks = new ArrayList<Integer>();
		for(int x = 0; x < times; x++) {
			ks.add(c.nextInt());
		}
		int expenses = 0;
		for(int x = 0; x < ks.size(); x++) {
			if(ks.get(x) < 0) {
				expenses+=Math.abs(ks.get(x));
			}
		}
		System.out.println(expenses);
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new jobexpenses().run();
	}

}

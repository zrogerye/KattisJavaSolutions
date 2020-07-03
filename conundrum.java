import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class conundrum {
	
	public void run()throws Exception{
		//Scanner c = new Scanner(new File("1.in"));
		Scanner c = new Scanner(System.in);
		String x = c.next();
		int days = 0;
		String[] name = {"P","E","R"};
		String[] dab = x.trim().split("");
		ArrayList<String> total = new ArrayList<String>();
		for(int y = 0; y < dab.length; y++) {
			total.add(name[y%3]);
		}
		for(int i=0; i < dab.length; i++) {
			if(!dab[i].equals(total.get(i))) {
				days++;
			}
		}
		System.out.println(days);
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new conundrum().run();
	}

}

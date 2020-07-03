import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class modulo {

	
	
	public void run()throws Exception{
		ArrayList<Integer> all = new ArrayList<Integer>();
		//Scanner c = new Scanner(new File("3.in"));
		Scanner c = new Scanner(System.in);
		while(c.hasNextInt()) {
			all.add(c.nextInt());
		}
		ArrayList<Integer> mods = new ArrayList<Integer>();
		for(int x = 0; x < all.size(); x++) {
			if(!mods.contains(all.get(x)%42)) {
				mods.add(all.get(x)%42);
			}
		}
		System.out.println(mods.size());
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new modulo().run();
	}

}

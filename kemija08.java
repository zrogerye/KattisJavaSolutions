import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class kemija08 {

	public void run()throws Exception{
		Scanner c = new Scanner(System.in);
		String all = c.nextLine();
		String finalstr = "";
		String vowels = "AaEeIiOoUu";
		for(int x = 0; x < all.length(); x++) {
			if(!vowels.contains(all.substring(x,x+1))) {
				finalstr+=all.substring(x,x+1);
			}
			if(vowels.contains(all.substring(x,x+1))) {
				finalstr+=all.substring(x,x+1);
				x+=2;
			}
		}
		System.out.println(finalstr);
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new kemija08().run();
	}

}

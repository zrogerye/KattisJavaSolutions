import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class tripletexting {
	
	
	
	public static ArrayList<String> splitStringEqually(String text, int size) 
	{
	    ArrayList<String> result = new ArrayList<String>((text.length() + size - 1) / size);
	    for (int i = 0; i < text.length(); i += size) {
	        result.add(text.substring(i, Math.min(text.length(), i + size)));
	    }
	    return result;
	}

	
	
	
	public void run()throws Exception{
		//Scanner c = new Scanner(new File("1.in"));
		Scanner c = new Scanner(System.in);
		String temp = c.next().trim();
		int wordlength = temp.length()/3;
		ArrayList<String> all = splitStringEqually(temp,wordlength);
		if(all.get(0).equals(all.get(1)) && all.get(0).contentEquals(all.get(2))) {
			System.out.println(all.get(0));
			return;
		}
		if(all.get(0).equals(all.get(1))) {
			System.out.println(all.get(0));
		}
		if(all.get(0).equals(all.get(2))) {
			System.out.println(all.get(0));
		}
		if(all.get(1).equals(all.get(2))) {
			System.out.println(all.get(1));
		}
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new tripletexting().run();

	}

}

import java.io.File;
import java.util.Scanner;

public class apaxianparent {
	
	public void run() throws Exception{
		
		//Scanner c = new Scanner(new File("apaxianparent-001.in"));
		Scanner c = new Scanner(System.in);
		String temp = c.nextLine().trim();
		String[] uhm = temp.split(" ");
		String vowels = "aiou";
		if(uhm[0].substring(uhm[0].length()-2).equals("ex")) {
			System.out.println(uhm[0]+uhm[1]);
			
			
			
			
			
			
			
			
			
		}else if(uhm[0].substring(uhm[0].length()-1).equals("e")) {
			System.out.println(uhm[0]+"x"+uhm[1]);
		}else if(vowels.contains(uhm[0].substring(uhm[0].length()-1))) {
			System.out.println(uhm[0].substring(0,uhm[0].length()-1)+"ex"+uhm[1]);
		}else {
			System.out.println(uhm[0] + "ex" + uhm[1]);
		}
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new apaxianparent().run();
	}

}

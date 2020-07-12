import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class erase {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new erase().run();
	}
	
	public void run()throws Exception{
		//Scanner file = new Scanner(new File("erase.2.in"));
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		String before = file.nextLine().trim();
		String after = file.nextLine().trim();
		String[] temp = before.split("");
		
		
		for(int z = 0; z < times; z++) {
			for(int i = 0; i < temp.length; i++) {
				if(temp[i].equals("0")) {
					temp[i] = "1";
				}else {
					temp[i] = "0";
				}
			}
		}
		
		String fin = "";
		for(int x = 0; x < temp.length; x++) {
			fin+=temp[x];
		}
		
		
		if(fin.equals(after)) {
			System.out.println("Deletion succeeded");
		}
		if(!fin.equals(after)) {
			System.out.println("Deletion failed");
		}
	}

}

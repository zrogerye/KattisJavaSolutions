import java.util.ArrayList;
import java.util.Scanner;
public class oddgnome {
	
	public void run()throws Exception{
		Scanner file = new Scanner(System.in);
		 int asdf = file.nextInt();
	        file.nextLine();
	        while (asdf-- > 0) {
	            ArrayList<Integer> gnomes = new ArrayList<>();
	            String[] nums = file.nextLine().split(" ");
	            for (int x = 0; x < nums.length; x++)
	                gnomes.add(Integer.parseInt(nums[x]));
	            
	            
	            gnomes.remove(0);
	            gnomes.remove(gnomes.size() - 1);
	            
	            
	            for (int x = 0; x < gnomes.size(); x++)
	                if (gnomes.get(x + 1) - gnomes.get(x) != 1) {
	                    System.out.println(x + 2);
	                    break;
	                }
	            
	        }
	        file.close();
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new oddgnome().run();
	}

}

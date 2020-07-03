import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class harshadnumbers {
	
	public long sumDigits(long asdf) {
		long temp = asdf;
		long sum = 0;
		while(temp > 0) {
			long rem = temp % 10;
			sum+=rem;
			temp /= 10;
		}
		return sum;
	}

	public void run()throws Exception{
		Scanner c = new Scanner(System.in);
		long asdf = c.nextInt();
		long num = 0;
		
		boolean done = false;
		while(done == false) {
			long temp = sumDigits(asdf);
			if(asdf % temp == 0) {
				num = asdf;
				done = true;
			}
			asdf++;
		}
		System.out.println(num);
	}
	
	
	
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new harshadnumbers().run();
	}

}

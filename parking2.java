import java.util.Scanner;

public class parking2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int foo = sc.nextInt();
	    for (int i = 0; i < foo; i++) {
	      int bar = sc.nextInt();
	      int low = 100;
	      int high = 0;
	      for (int i1 = 0; i1 < bar; i1++) {
	        int curr = sc.nextInt();
	        if(curr < low)
	          low = curr;
	        if(curr > high)
	          high = curr;
	      }
	      System.out.println(2 * (high - low));

	    }
	}
}

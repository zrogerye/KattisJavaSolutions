import java.util.Scanner;

public class filip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String[] nums = new Scanner(System.in).nextLine().split(" ");
	        int sigD = 3;
	        int test = -1;
	        for(;;)
	        switch (test){
	            case 0: System.out.println(new StringBuilder(nums[test]).reverse()); return;
	            case 1: System.out.println(new StringBuilder(nums[test]).reverse()); return;
	            default: test = (nums[0].charAt(--sigD) - nums[1].charAt(sigD) == 0)?-1:(nums[0].charAt(sigD) > nums[1].charAt(sigD))?0:1;

	}

}
}

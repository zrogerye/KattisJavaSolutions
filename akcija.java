import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
	public class akcija {
		public static void main(String[] args) {
			Scanner c = new Scanner(System.in);
			int asdf = c.nextInt();
			c.nextLine();
			int[] nums = new int[asdf];
			
			
			
			
			int sum = 0;
			int sub = 0;
			
			for (int i = 0; i < nums.length; i++)
			{
				int x = c.nextInt();
				nums[i] = x;
				sum += x;
			}
			
			Arrays.sort(nums);
			
			for (int i = nums.length - 3; i >= 0; i -= 3)
				sub += nums[i];
			
			System.out.println(sum - sub);
		}
}
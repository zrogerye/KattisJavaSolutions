import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class weakvertices {
	
	
	
	public void run()throws Exception{
		Scanner scan = new Scanner(System.in);

		while (true)
			{
			int n = scan.nextInt();
			
			if (n == -1)
				break;
			
			int[][] nums = new int[n][n];
			
			for (int r = 0; r < n; r++)
				for (int c = 0; c < n; c++)
					nums[r][c] = scan.nextInt();
			
			for (int r = 0; r < n; r++)
				if (triangle(r , nums))
					continue;
				else
					System.out.print(r + " ");
			
			System.out.println();
			}









		scan.close();
		
		
		
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new weakvertices().run();

	}
	public static boolean triangle(int r , int[][] nums) {

		for (int i = 0; i < nums.length; i++)
			{
			if (nums[r][i] == 1)
				{
				for (int j = i + 1; j < nums.length; j++)
					if (nums[r][j] == 1 && nums[i][j] == 1)
						return true;
				}
			}
		
		return false;
	}

}

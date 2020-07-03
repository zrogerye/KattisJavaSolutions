import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class pet {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Scanner c = new Scanner(new File("pet.2.in"));
		Scanner c = new Scanner(System.in);
		ArrayList<Integer> player1 = new ArrayList<Integer>();
		ArrayList<Integer> player2 = new ArrayList<Integer>();
		ArrayList<Integer> player3 = new ArrayList<Integer>();
		ArrayList<Integer> player4 = new ArrayList<Integer>();
		ArrayList<Integer> player5 = new ArrayList<Integer>();
		
		
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		
		for(int x = 0; x < 4; x++)
		{
			one += c.nextInt();
		}
		for(int x = 0; x < 4; x++)
		{
			two += c.nextInt();
		}
		for(int x = 0; x < 4; x++)
		{
			three += c.nextInt();
		}
		for(int x = 0; x < 4; x++)
		{
			four += c.nextInt();
		}
		for(int x = 0; x < 4; x++)
		{
			five += c.nextInt();
		}
		
		
		int max = one;
		
		int[] y = {one,two,three,four,five};
		
		
		for(int x = 0; x < y.length-1; x++)
		{
			if(y[x+1] > max)
			{
				max = y[x+1];
			}
		}
		
		
		if(max == one)
		{
			System.out.println(1 + " " + one);
		}
		if(max == two)
		{
			System.out.println(2 + " " + two);
		}
		if(max == three)
		{
			System.out.println(3 + " " + three);
		}
		if(max == four)
		{
			System.out.println(4 + " " + four);
		}
		if(max == five)
		{
			System.out.println(5 + " " + five);
		}
		
		
		
		
	
		

	}

}

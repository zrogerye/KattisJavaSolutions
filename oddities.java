import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class oddities {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Scanner c = new Scanner(new File("sample.in"));
		Scanner c = new Scanner(System.in);
		int howMany = c.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int x = 0; x < howMany; x++)
		{
			a.add(c.nextInt());
		}
		for(int y = 0;y < a.size(); y++)
		{
			if(a.get(y) % 2 == 0)
				System.out.println(a.get(y) + " is even");
			if(a.get(y) % 2 != 0)
				System.out.println(a.get(y) + " is odd");
		}
		

	}

}

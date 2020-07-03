import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class sevenwonders {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Scanner c = new Scanner(new File("2.in"));
		Scanner c = new Scanner(System.in);
		
		String all = c.nextLine();
		int T = 0;
		int G = 0;
		int C = 0;
		int score = 0;
		for(int x = 0; x < all.length(); x++)
		{
			if(all.substring(x,x+1).equals("T"))
			{
				T++;
			}
			if(all.substring(x,x+1).equals("G"))
			{
				G++;
			}
			if(all.substring(x,x+1).equals("C"))
			{
				C++;
			}
			
		}
		
		
		score += T*T + G*G + C*C;
		int min = Integer.MAX_VALUE;
		ArrayList<Integer> g = new ArrayList<Integer>();
		g.add(T);
		g.add(G);
		g.add(C);
		for(int x = 0; x < g.size(); x++)
		{
			if(g.get(x) < min)
			{
				min = g.get(x);
			}
		}
		score += min*7;
		System.out.println(score);

	}

}

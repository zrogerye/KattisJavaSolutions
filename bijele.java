import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class bijele {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		
		Scanner file = new Scanner(System.in);
		
		int kings = file.nextInt();
		int queens = file.nextInt();
		int rooks = file.nextInt();
		int bishops=file.nextInt();
		int knights=file.nextInt();
		int pawns = file.nextInt();
		
		ArrayList<Integer> total = new ArrayList<Integer>();
		total.add(1-kings);
		total.add(1-queens);
		total.add(2-rooks);
		total.add(2-bishops);
		total.add(2-knights);
		total.add(8-pawns);
		
		for(int x = 0; x < total.size(); x++)
		{
			System.out.print(total.get(x) + " ");
		}
		
		

	}

}

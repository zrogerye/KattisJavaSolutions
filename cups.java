import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class cups {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		String nums = "0123456789";
		String lets = "abcdefghijklmnopqrstuvwxyz";
		ArrayList<Integer> radii = new ArrayList<Integer>();
		ArrayList<String> colors = new ArrayList<String>();
		ArrayList<String> sortedColors = new ArrayList<String>();
		int x = c.nextInt();
		c.nextLine();
		for(int y = 0; y < x; y++)
		{
			String cur = c.nextLine().trim();
			String[] curr = cur.split(" ");
			int strFirst = 0;
			int numFirst = 0;
			if(lets.contains(curr[0].substring(0,1)))
			{
				strFirst++;
			}
			if(nums.contains(curr[0].substring(0,1)))
			{
				numFirst++;
			}
			int rad = 0;
			String color = "";
			if(strFirst == 1)
			{
				color = curr[0];
				rad = Integer.parseInt(curr[1]);
			}
			if(numFirst == 1)
			{
				rad = (Integer.parseInt(curr[0])) / 2;
				color = curr[1];
			}
			
			radii.add(rad);
			colors.add(color);
		}
		while(radii.size() > 0)
		{
			
			int spot=0;
			int min = radii.get(0);
			for(int z = 0; z < radii.size(); z++)
			{
				if(radii.get(z) < min)
				{
					min = radii.get(z);
					spot = z;
				}
			}
			sortedColors.add(colors.get(spot));
			colors.remove(spot);
			radii.remove(spot);
		}
		
		for(int f = 0; f < sortedColors.size(); f++)
		{
			System.out.println(sortedColors.get(f));
		}

	}

}

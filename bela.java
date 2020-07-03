import java.io.File;
import java.util.Scanner;

public class bela {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Scanner c = new Scanner(new File("bela.2.in"));
		
		Scanner c = new Scanner(System.in);
		
		int hands = c.nextInt();
		String dom = c.next();
		c.nextLine();
		int score = 0;
		
		while(c.hasNext())
		{
			String temp = c.nextLine();
			if(temp.substring(1).equals(dom))
			{
				if(temp.substring(0,1).equals("A"))
				{
					score += 11;
				}if(temp.substring(0,1).equals("K"))
				{
					score += 4;
				}
				if(temp.substring(0,1).equals("Q"))
				{
					score += 3;
				}
				if(temp.substring(0,1).equals("J"))
				{
					score += 20;
				}
				if(temp.substring(0,1).equals("T"))
				{
					score += 10;
				}
				if(temp.substring(0,1).equals("9"))
				{
					score += 14;
				}
				if(temp.substring(0,1).equals("8"))
				{
					score += 0;
				}
				if(temp.substring(0,1).equals("7"))
				{
					score += 0;
				}
			}
			if(!temp.substring(1).equals(dom))
			{
				if(temp.substring(0,1).equals("A"))
				{
					score += 11;
				}if(temp.substring(0,1).equals("K"))
				{
					score += 4;
				}
				if(temp.substring(0,1).equals("Q"))
				{
					score += 3;
				}
				if(temp.substring(0,1).equals("J"))
				{
					score += 2;
				}
				if(temp.substring(0,1).equals("T"))
				{
					score += 10;
				}
				if(temp.substring(0,1).equals("9"))
				{
					score += 0;
				}
				if(temp.substring(0,1).equals("8"))
				{
					score += 0;
				}
				if(temp.substring(0,1).equals("7"))
				{
					score += 0;
				}
				
			}
			
		}
		System.out.println(score);

	}

}

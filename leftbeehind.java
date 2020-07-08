import java.util.Scanner;

public class leftbeehind {
	public void run()throws Exception{
		Scanner scan = new Scanner(System.in);

		while (true)
			{
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			if (x == 0 && y == 0)
				break;
			
			if (x + y == 13)
				System.out.println("Never speak again.");
			else if (x == y)
				System.out.println("Undecided.");
			else if (x > y)
				System.out.println("To the convention.");
			else
				System.out.println("Left beehind.");
			}

		scan.close();
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new leftbeehind().run();
	}

}

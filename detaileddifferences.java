import java.io.File;
import java.util.Scanner;

public class detaileddifferences {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Scanner c = new Scanner(new File("sample.in"));
		Scanner c = new Scanner(System.in);
		int asdf = c.nextInt();
		c.nextLine();
		
		
		for(int h = 0; h < asdf; h++) {
		String a = c.nextLine();
		String b = c.nextLine();
		String differences = "";
		
		
		
		for(int x = 0; x < a.length(); x++)
		{
			if(a.substring(x,x+1).equals(b.substring(x,x+1)))
			{
				differences += ".";
			}
			else {
				differences += "*";
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(differences);
		System.out.println();

	}
	}

}

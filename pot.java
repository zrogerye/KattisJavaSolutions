import java.io.File;
import java.util.Scanner;

public class pot {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Scanner  c = new Scanner(new File("pot.1.in"));
		Scanner c = new Scanner(System.in);
		int asdf = c.nextInt();
		long out = 0;
		for(int x = 0; x < asdf; x++)
		{
			long now = c.nextInt();
			long pow = now % 10;
			now = now / 10;
			out += Math.pow(now, pow);
		}
		System.out.println(out);

	}

}

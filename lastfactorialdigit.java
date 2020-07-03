import java.io.File;
import java.util.Scanner;

public class lastfactorialdigit {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Scanner c = new Scanner(new File("1.in"));
		Scanner c = new Scanner(System.in);
		int [] lastDigit=new int [11];
		lastDigit[0]=1;
		for (int i=1;i<lastDigit.length;i++) lastDigit[i]=(lastDigit[i-1]*i)%10;
		
		int T=Integer.parseInt(c.nextLine());
		while (T-->0) System.out.println(lastDigit[Integer.parseInt(c.nextLine())]);

	}

}

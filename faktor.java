import java.io.File;
import java.util.Scanner;

public class faktor {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 //Scanner sc = new Scanner(new File("faktor.dummy.3.in"));
	        int a = sc.nextInt(), i = sc.nextInt();
	        int x = a * i;
	        while (((double) --x / a) > i - 1) {
	        }
	        System.out.println(++x);

	}

}

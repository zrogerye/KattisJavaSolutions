import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class tarifa {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new File("tarifa.1.in"));
        int x = sc.nextInt(), n = sc.nextInt(), t = x * (n + 1);
        for (int i = 0; i < n; i++) {
            t -= sc.nextInt();
        }
        System.out.println(t);
			
		}
		

	}


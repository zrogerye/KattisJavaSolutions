import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class janitortroubles {
	
	public void run()throws Exception{
		Scanner sc = new Scanner(System.in);
        double s = 0;
        int[] a = new int[4];
        for (int x = 0; x < 4; x++) {
            a[x] = sc.nextInt();
            s += a[x];
        }
        s /= 2;
        double res = 1;
        for (int x = 0; x < 4; x++)
            res *= s - a[x];
        System.out.println(Math.sqrt(res));
		
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new janitortroubles().run();
	}

}

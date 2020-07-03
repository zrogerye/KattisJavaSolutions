import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class rijeci {
	
	public void run()throws Exception{
		Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int press = sc.nextInt();
            int A = 1;
            int B = 0;
            for (int i = 0; i < press; i++) {
                int temp = B;
                B = +A;
                A += temp;
            }
           System.out.println(A - B + " " + B);
        }
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new rijeci().run();
	}

}

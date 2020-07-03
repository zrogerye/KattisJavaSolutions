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

public class goatrope {
	public void run()throws Exception{
		Scanner c = new Scanner(System.in);
		int x = c.nextInt();
		int y = c.nextInt();
		int x1 = c.nextInt();
		int y1 = c.nextInt();
		int x2 = c.nextInt();
		int y2 = c.nextInt();
		
		double d = 0;
		
		 if (x > x1 && x < x2 && y > y2) {
			    d = y - y2;
			  } else if (x > x2 && y > y2) {
			    d = StrictMath.hypot(x - x2, y - y2);
			  } else if (x > x2 && y > y1 && y < y2) {
			    d = x - x2;
			  } else if (x > x2 && y < y1) {
			    d = StrictMath.hypot(x - x2, y1 - y);
			  } else if (x > x1 && x < x2 && y < y1) {
			    d = y1 - y;
			  } else if (x < x1 && y < y1) {
			    d = StrictMath.hypot(x1 - x, y1 - y);
			  } else if (x < x1 && y > y1 && y < y2) {
			    d = x1 - x;
			  } else if (x < x1 && y > y2) {
			    d = StrictMath.hypot(x1 - x, y - y2);
			  }
		 
		 System.out.println(d);
		
		
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new goatrope().run();
	}

}

import java.io.File;
import java.util.Scanner;

public class racingalphabet {
	
	public static final double dist = 60f * Math.PI;

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		
		 Scanner sc = new Scanner(System.in);
		// Scanner sc = new Scanner(new File("1.in"));
		    int cases = Integer.parseInt(sc.nextLine());
		    for (int i = 0; i < cases; i++) {
		      String line = sc.nextLine();
		      int linelen = line.length()-1;
		      int dist = 0;
		      for (int j = 0; j < linelen; j++) {
		        int src = line.charAt(j) == ' ' ? 27 : line.charAt(j) == '\'' ? 28 : line.charAt(j) - 64;
		        int dest = line.charAt(j+1) == ' ' ? 27 : line.charAt(j+1) == '\'' ? 28 : line.charAt(j+1) - 64;
		        int diff = src - dest < 0 ? dest - src : src - dest;
		        dist += diff > 14 ? 28 - diff : diff;
		      }
		      double g = dist * racingalphabet.dist / 420f + line.length();
		      
		      System.out.printf("%.10f%n",g);
		    }
	}

}

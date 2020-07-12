import java.io.*;
import java.util.*;


public class babylonian {
	
	public void run()throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        int asdf = Integer.parseInt(sc.readLine());
        while (asdf-- > 0) {
            String[] arr = (sc.readLine() + " ").split(",");
            long num = 0;
            for (int x = arr.length - 1; x >= 0; x--) {
                arr[x] = arr[x].trim();
                if (!arr[x].equals(""))
                    num += (long) Math.pow(60, arr.length - 1 - x) * Integer.parseInt(arr[x]);
            }
            dc.write(num + "\n");
        }

        dc.close();
        sc.close();
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new babylonian().run();
	}

}

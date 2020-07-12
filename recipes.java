import java.io.*;
import java.util.*;

public class recipes {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new recipes().run();
	}
	
	public void run()throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter dc = new BufferedWriter(new OutputStreamWriter(System.out));

        int asdf1 = Integer.parseInt(sc.readLine());
        for (int asdf = 1; asdf <= asdf1; asdf++) {
            String[] tokens = sc.readLine().split(" ");
            int recipes = Integer.parseInt(tokens[0]);
            double scales = Double.parseDouble(tokens[2]) / Double.parseDouble(tokens[1]), main = 0;
            stuff[] arr = new stuff[recipes];
            for (int x = 0; x < recipes; x++) {
                arr[x] = new stuff(sc.readLine());
                if (arr[x].percent == 1)
                    main = scales * arr[x].weight;
            }
            dc.write("Recipe # " + asdf + "\n");
            for (stuff a : arr)
                dc.write(String.format("%s %.1f\n", a.name, a.percent * main));
            dc.write("----------------------------------------\n");
        }

        dc.close();
        sc.close();
	}
	
	private static class stuff {
        private String name;
        private double weight, percent;

        public stuff(String s) {
            String[] arr = s.split(" ");
            name = arr[0];
            weight = Double.parseDouble(arr[1]);
            percent = Double.parseDouble(arr[2]) / 100;
        }
    }

}

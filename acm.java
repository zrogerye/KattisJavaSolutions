import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class acm {
	
	public void run()throws Exception{
		 Scanner file = new Scanner(System.in);
	        ArrayList<Integer> tim = new ArrayList<>();
	        ArrayList<String> questions = new ArrayList<>();
	        ArrayList<String> uhhhhh = new ArrayList<>();
	        while (true) {
	            int min = file.nextInt();
	            if (min == -1)
	                break;
	            tim.add(min);
	            questions.add(file.next());
	            uhhhhh.add(file.next());
	        }
	        int size = tim.size();
	        int correct = 0;
	        int totaltime = 0;
	        ArrayList<Integer> pos = new ArrayList<>();
	        for (int x = 0; x < size; x++) {
	            if (uhhhhh.get(x).equals("right")) {
	                correct++;
	                totaltime += tim.get(x);
	                pos.add(x);
	            }
	        }
	        for (int s : pos) {
	            int count = 0;
	            String answer = questions.get(s);
	            for (String x : questions)
	                if (x.equals(answer))
	                    count++;
	            count--;
	            totaltime += count * 20;
	        }
	        System.out.println(correct + " " + totaltime);

	        file.close();
	    
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new acm().run();

	}

}

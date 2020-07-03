import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class icpcawards {
	
	
	public void run()throws Exception{
		Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, String> teams = new LinkedHashMap<>();

        int cases = sc.nextInt();
        sc.nextLine();
        while (cases-- > 0) {
            String place = sc.next();
            String name = " " + sc.next();
            if (!teams.containsKey(place) && teams.size() < 12)
                teams.put(place, name);
        }
        for (Map.Entry<String, String> s : teams.entrySet())
            System.out.println(s.getKey() + s.getValue());
	}
    public static void main(String[] args)throws Exception {
        new icpcawards().run();
    }
}
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class bard {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new bard().run();
	}

	
	public void run()throws Exception{
		Scanner file = new Scanner(System.in);

        int villagers = file.nextInt();
        int evenings = file.nextInt();

        TreeMap<Integer, String> people = new TreeMap<>();
        for (int x = 1; x <= villagers; x++)
            people.put(x, "0");

        int songs = 0;

        while (evenings-- > 0) {
            int present = file.nextInt();
            ArrayList<Integer> peep = new ArrayList<>();

            while (present-- > 0)
                peep.add(file.nextInt());

            if (peep.contains(1)) {
                songs++;
                for (int x : peep)
                    people.put(x, people.get(x) + " " + songs);
            } else {
                TreeSet<Integer> thing = new TreeSet<>();
                for (int x : peep) {
                    String songsListen = people.get(x);
                    String[] nums = songsListen.split(" ");
                    for (String s : nums)
                        thing.add(Integer.parseInt(s));
                }
                String replace = "";
                int[] nums = new int[thing.size()];
                int a = 0;
                for (int s : thing)
                    nums[a++] = s;

                for (int x = 0; x < nums.length; x++)
                    replace += x == nums.length - 1 ? nums[x] : nums[x] + " ";

                for (int x : peep)
                    people.put(x, replace);
            }
        }
        for (Map.Entry<Integer, String> x : people.entrySet())
            if (x.getValue().equals(people.get(1)))
                System.out.println(x.getKey());
        file.close();
    }
}

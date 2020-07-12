import java.io.*;
import java.util.*;


public class baloni {
	public void run()throws Exception{
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in), 1 << 16);
        int n = Integer.parseInt(file.readLine());
        HashMap<Integer, TreeSet<Integer>> map = new HashMap<>();
        TreeSet<Integer> indexes = new TreeSet<>();
        int[] arr = new int[n];
        int i = 0;
        for (String s : file.readLine().split(" ")) {
            indexes.add(i);
            arr[i] = Integer.parseInt(s);
            if (!map.containsKey(arr[i]))
                map.put(arr[i], new TreeSet<>());
            map.get(arr[i]).add(i);
            i++;
        }
        int count = 0;
        while (!indexes.isEmpty()) {
            int pos = indexes.pollFirst();
            int cur = arr[pos];
            while (map.containsKey(cur - 1)) {
                Integer a = map.get(cur - 1).higher(pos);
                if (a != null) {
                    map.get(cur - 1).remove(a);
                    cur--;
                    pos = a.intValue();
                    indexes.remove(pos);
                } else
                    break;
            }
            count++;
        }
        System.out.println(count);
        file.close();
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new baloni().run();
	}

}

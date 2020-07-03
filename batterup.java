import java.util.*;

public class batterup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int batsTotal = Integer.parseInt(sc.nextLine());
        String[] bats = sc.nextLine().split(" ");
        int realbats = 0;
        double total = 0f;
        for(String s: bats){
            if(Integer.parseInt(s) != -1) {
                total += Integer.parseInt(s);
                realbats++;
            }
        }
        System.out.println(((double)(total/realbats)));
    }
}

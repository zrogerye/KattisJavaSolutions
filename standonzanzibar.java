import java.util.*;

public class standonzanzibar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for(int i = 0, cases = sc.nextInt(); i < cases; i++) {
            int total = 0;
            int prev = sc.nextInt();
            int curr = sc.nextInt();
            while (curr > 0) {
                if (curr - (2 * prev) > 0)
                    total += curr - (2 * prev);
                prev = curr;
                curr = sc.nextInt();
            }
            System.out.println(total);
        }
    }
}
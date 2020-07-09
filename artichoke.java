import java.io.*;
import java.util.*;

public class artichoke {
    static int ppp, a, b, c, d, n;

    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(System.in);
        ppp = file.nextInt();
        a = file.nextInt();
        b = file.nextInt();
        c = file.nextInt();
        d = file.nextInt();
        n = file.nextInt();
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double dist = 0;
        for (int x = 1; x <= n; x++) {
            double cur = price(x);
            if (cur > max) {
                dist = Math.max(dist, max - min);
                max = cur;
                min = max;
            } else {
                min = Math.min(min, cur);
            }
        }
        dist = Math.max(dist, max - min);
        System.out.println(dist);
    }

    static double price(int k) {
        return ppp * (Math.sin(a * k + b) + Math.cos(c * k + d) + 2);
    }
}
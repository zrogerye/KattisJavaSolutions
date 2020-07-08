import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class skocimis {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] pos = reader.readLine().split(" ");

        int a = Integer.parseInt(pos[0]);
        int b = Integer.parseInt(pos[1]);
        int c = Integer.parseInt(pos[2]);

        int max = Math.max(b - a, c - b) - 1;
        System.out.println(max);
    }

}
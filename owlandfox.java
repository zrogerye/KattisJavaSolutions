import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class owlandfox{

    public BufferedReader file;

    public static void main(String[] args) throws IOException {
       new owlandfox().run();
    }

    private void run() throws IOException {
        file = new BufferedReader(new InputStreamReader(System.in));
        String line;

        int asdf = Integer.valueOf(file.readLine()), t = 0;

        while(t < asdf) {

            char[] c = file.readLine().toCharArray();

            for (int i = c.length - 1; i >= 0; i--) {
                if(c[i] != '0'){
                    c[i] = (char) (c[i] - 1);
                    break;
                }
            }

            String closestNumber = String.valueOf(c);

            System.out.println(Integer.valueOf(closestNumber));





            t++;
        }
    }
}
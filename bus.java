import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bus {
    public static void main(String[] args) throws Exception {
        new bus().run();
    }
    
    public void run()throws Exception{
    	BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter outt = new BufferedWriter(new OutputStreamWriter(System.out));

        int cases = Integer.parseInt(file.readLine());
        while (cases-- > 0) {
            int times = Integer.parseInt(file.readLine());
            double sum = 0;
            for (int x = 0; x < times; x++)
                sum = 2 * (sum + .5);
            outt.write((int) sum + "\n");
        }

        outt.flush();
        outt.close();
        file.close();
    }
}
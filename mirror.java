import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class mirror{

    public BufferedReader file;


    public static void main(String[] args) throws IOException {
        new mirror().run();
    }

    private void run() throws IOException {
        file = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String[] split;
        int asdf = Integer.valueOf(file.readLine()), t = 0;
        Stack<String> q = new Stack<>();

        while(t < asdf) {
            split = file.readLine().split(" ");
            int rows = Integer.valueOf(split[0]);
            for (int i = 0; i < rows; i++) {
                q.add(file.readLine());
            }
            System.out.println("Test " + (t+ 1));
            while(!q.isEmpty()){
                line = q.pop();
                for (int i = line.length() - 1; i >= 0; i--) {
                    System.out.print(line.charAt(i));
                }

                System.out.println("");
            }


            t++;


        }

    }
}
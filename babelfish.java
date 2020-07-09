import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class babelfish{

    public Scanner file;
    public HashMap<String, String> thing;

    public static void main(String[] args) throws IOException{
        new babelfish().run();
    }

    private void run() throws IOException {
        file = new Scanner(System.in);
        thing = new HashMap<>();
        while(true) {
            String[] lines = file.nextLine().split(" ");
            if(lines[0].length() == 0) {
                break;
            }

            thing.putIfAbsent(lines[1], lines[0]);

        }


        while(file.hasNextLine()){
            String line = file.nextLine();
            if(line.equals("")){
                break;
            }

            if(thing.get(line) != null)
                System.out.println(thing.get(line));
            else
                System.out.println("eh");
        }

    }
}
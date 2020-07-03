

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class speedlimit {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sets = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder("");
        for(int miles = 0; sets != -1; sets = Integer.parseInt(reader.readLine()), miles = 0){
            for(int i = 0, timeElapsed = 0; i < sets; i++){
                String[] setLine = reader.readLine().split(" ");
                miles += Integer.parseInt(setLine[0]) * (Integer.parseInt(setLine[1]) - timeElapsed);
                timeElapsed = Integer.parseInt(setLine[1]);
            }
            sb.append(miles + " miles\n");
        }
        System.out.print(sb);
    }
}

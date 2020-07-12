import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class backspace {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new backspace().run();
	}
	
	public void run()throws Exception{
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter outt = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = file.readLine().toCharArray();
        for (int x = arr.length - 1, count = 0; x >= 0; x--) {
            if (arr[x] == '<') {
                arr[x] = ' ';
                count++;
            } else if (count > 0) {
                arr[x] = ' ';
                count--;
            }
        }
        outt.write(new String(arr).replaceAll(" ", ""));

        outt.flush();
        outt.close();
        file.close();
	}

}

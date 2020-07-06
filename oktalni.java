import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class oktalni {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new oktalni().run();
	}
	
	public static int convertBinarytoOctal(long binaryNumber)
    {
        int octalNumber = 0, decimalNumber = 0, i = 0;
        while(binaryNumber != 0)
        {
            decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
            ++i;
            binaryNumber /= 10;
        }
        i = 1;
        while (decimalNumber != 0)
        {
            octalNumber += (decimalNumber % 8) * i;
            decimalNumber /= 8;
            i *= 10;
        }
        return octalNumber;
    }
	
	public void run()throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split("");
        String s = "";
        if (strs.length % 3 == 1) {
            s = "1";
        } else if (strs.length % 3 == 2) {
            s = "" + Integer.parseInt(("01" + strs[1]), 2);
        }
        for (int i = strs.length % 3; i < strs.length; i += 3) {
            s += Integer.parseInt((strs[i] + strs[i + 1] + strs[i + 2]), 2);
        }
        System.out.println(s);		
	}

}

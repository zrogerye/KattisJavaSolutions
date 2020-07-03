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
public class anewalphabet {
	
	public void run()throws Exception{
		 Scanner sc = new Scanner(System.in);
	        String pat = sc.nextLine();
	        String translated = "";
	        
	        HashMap<Character,String> convert = new HashMap<Character,String>();
	        convert.put('a',"@");
	        convert.put('b',"8");
	        convert.put('c',"(");
	        convert.put('d',"|)");
	        convert.put('e',"3");
	        convert.put('f',"#");
	        convert.put('g',"6");
	        convert.put('h',"[-]");
	        convert.put('i',"|");
	        convert.put('j',"_|");
	        convert.put('k',"|<");
	        convert.put('l',"1");
	        convert.put('m',"[]\\/[]");
	        convert.put('n',"[]\\[]");
	        convert.put('o',"0");
	        convert.put('p',"|D");
	        convert.put('q',"(,)");
	        convert.put('r',"|Z");
	        convert.put('s',"$");
	        convert.put('t',"']['");
	        convert.put('u',"|_|");
	        convert.put('v',"\\/");
	        convert.put('w',"\\/\\/");
	        convert.put('x',"}{");
	        convert.put('y',"`/");
	        convert.put('z',"2");
	        
	        for (int i = 0; i < pat.length(); i++) {
	            translated += convert.get(Character.toLowerCase(pat.charAt(i))) != null ? convert.get(Character.toLowerCase(pat.charAt(i))) : pat.charAt(i);
	        }
	        System.out.println(translated);
	    
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new anewalphabet().run();

	}

}

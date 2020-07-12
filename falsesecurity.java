import java.io.*;
import java.util.*;

public class falsesecurity {
	
	public void run()throws Exception{
		 BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter outt = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	        HashMap<Character, String> thingy = new HashMap<Character, String>();
	        thingy.put('A', ".-");
	        thingy.put('B', "-...");
	        thingy.put('C', "-.-.");
	        thingy.put('D', "-..");
	        thingy.put('E', ".");
	        thingy.put('F', "..-.");
	        thingy.put('G', "--.");
	        thingy.put('H', "....");
	        thingy.put('I', "..");
	        thingy.put('J', ".---");
	        thingy.put('K', "-.-");
	        thingy.put('L', ".-..");
	        thingy.put('M', "--");
	        thingy.put('N', "-.");
	        thingy.put('O', "---");
	        thingy.put('P', ".--.");
	        thingy.put('Q', "--.-");
	        thingy.put('R', ".-.");
	        thingy.put('S', "...");
	        thingy.put('T', "-");
	        thingy.put('U', "..-");
	        thingy.put('V', "...-");
	        thingy.put('W', ".--");
	        thingy.put('X', "-..-");
	        thingy.put('Y', "-.--");
	        thingy.put('Z', "--..");
	        thingy.put('_', "..--");
	        thingy.put(',', ".-.-");
	        thingy.put('.', "---.");
	        thingy.put('?', "----");
	        String line = "";
	        while((line = file.readLine()) != null) {
	            String code = "";
	            ArrayList<Integer> order = new ArrayList<Integer>();
	            for(int i = 0; i < line.length(); i++) {
	                code += thingy.get(line.charAt(i));
	                order.add(thingy.get(line.charAt(i)).length());
	            }
	            Collections.reverse(order);
	            String str = "";
	            int temp = 0;
	            for(int i = 0; i < order.size(); i++) {
	                String sec = code.substring(temp, temp + order.get(i));
	                for(Character key : thingy.keySet()) {
	                    if(thingy.get(key).equals(sec)) {
	                        str += key;
	                        break;
	                    }
	                }
	                temp += order.get(i);
	            }
	            System.out.println(str);
	        }
	        outt.close();
	}
    public static void main(String[] args) throws IOException, Exception {
       new falsesecurity().run();
    }
}
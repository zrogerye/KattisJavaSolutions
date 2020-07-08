import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class prva {

	public void run()throws Exception{
		Scanner sc = new Scanner(System.in);
	    String[] both = sc.nextLine().split(" ");
	    int len = Integer.parseInt(both[0]);
	    int width = Integer.parseInt(both[1]);
	    String[] crossword = new String[len];
	    for (int i = 0; i < len; i++) {
	      crossword[i] = sc.nextLine();
	    }
	    
	    
	    HashSet<String> words = new HashSet<>();
	    StringBuilder[] vertical = new StringBuilder[width];
	    for (int i = 0; i < width; i++) {
	      vertical[i] = new StringBuilder();
	    }
	    
	    
	    for (int i = 0; i < len; i++) {
	      words.addAll(Arrays.asList(Arrays.stream(crossword[i].split("#")).filter((word) -> word.length() > 1).toArray(String[]::new)));
	      
	      
	      for (int j = 0; j < width; j++) {
	        if (crossword[i].charAt(j) != '#') {
	          vertical[j].append(crossword[i].charAt(j));
	        }
	        
	        
	        if (crossword[i].charAt(j) == '#' || i == len - 1) {
	          if (vertical[j].toString().length() > 1) {
	            words.add(vertical[j].toString());
	          }
	          vertical[j] = new StringBuilder();
	        }
	      }
	    }
	    words.stream().sorted().limit(1).forEach(System.out::println);
	}
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new prva().run();
	}

}

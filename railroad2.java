import java.util.Scanner;
import java.util.stream.IntStream;
public class railroad2{
    public static void main(String[] args) {
    	
    	
    	
        IntStream.range(0, 1).mapToObj((x) -> Integer.parseInt(new Scanner(System.in).nextLine().split(" ")[1]) % 2 == 0 ? "possible" : "impossible").forEach(System.out::println);
        
        
        
    }
}
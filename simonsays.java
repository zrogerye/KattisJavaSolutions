
import java.util.Scanner;

public class simonsays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cases = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < cases; i++) {
      String line = sc.nextLine();
      if(line.startsWith("Simon says "))
        System.out.println(line.substring(10));
    }
  }
}
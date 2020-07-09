import java.util.Arrays;
import java.util.Scanner;

public class anthonyanddiablo {

    public Scanner file;

    public static void main(String[] args){
        new anthonyanddiablo().run();
    }

    private void run() {
        file = new Scanner(System.in);

        double[] numers = Arrays.stream(file.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        double radian = numers[1] / (2 * 3.14);
        double area = 3.14 * Math.pow(radian, 2);

        if(numers[0] <= area) {
            System.out.println("Diablo is happy!");
        }else {
            System.out.println("Need more materials!");
        }

    }
}
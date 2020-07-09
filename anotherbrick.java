import java.util.Scanner;

public class anotherbrick {

    public Scanner scan;

    public static void main(String[] args){
        new anotherbrick().run();
    }

    private void run() {
        scan = new Scanner(System.in);
        double h = scan.nextDouble();
        int w = scan.nextInt(), bricks = scan.nextInt();
        int[] pile = new int[bricks];

        for (int i = 0; i < bricks; i++) {
            pile[i] = scan.nextInt();
        }

        int width = w;
        for (int i = 0; i < pile.length; i++) {
            width -= pile[i];

            if(width == 0) {
                width = w;
                h--;
                if(h == 0) {
                    System.out.println("YES");
                    return;
                }
            }else if(width < 0) {
                System.out.println("NO");
                return;
            }

        }
    }
}
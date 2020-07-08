import java.util.Scanner;

public class shatteredcake {
	
	public void run()throws Exception{
		Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int pieces = sc.nextInt();
        int area = 0;
        while (pieces-- > 0) {
            area += sc.nextInt() * sc.nextInt();
        }
        System.out.println(area / width);

        sc.close();
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new shatteredcake().run();
	}

}

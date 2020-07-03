import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class kornislav {

	
	public void run()throws Exception{
		Scanner c = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        for(int i=0;i<4;i++)a[i]= sc.nextInt();
        Arrays.sort(a);
        System.out.println(a[0]*a[2]);
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new kornislav().run();

	}

}

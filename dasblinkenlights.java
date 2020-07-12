import java.util.Scanner;

public class dasblinkenlights {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new dasblinkenlights().run();
	}
	
	public void run()throws Exception{
		Scanner file = new Scanner(System.in);
		int p = file.nextInt();
		int q = file.nextInt();
		int s = file.nextInt();
		
		if(lcm(p, q) <= s){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
	
	private static int gcd(int a, int b){
		while(b > 0){
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	private static int lcm(int a, int b){
		return a * (b / gcd(a, b));
	}

}

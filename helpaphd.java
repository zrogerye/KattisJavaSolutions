import java.util.Scanner;

public class helpaphd {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new helpaphd().run();
	}
	
	public void run()throws Exception{
		        Scanner sc = new Scanner(System.in);
		        int cases = Integer.parseInt(sc.nextLine());
		        for(int i = 0; i < cases; i++){
		            String s = sc.nextLine();
		            if(s.equals("P=NP"))
		                System.out.println("skipped");
		            else
		                System.out.println(Integer.parseInt(s.split("\\+")[0]) + Integer.parseInt(s.split("\\+")[1]));
		        }
		}

}

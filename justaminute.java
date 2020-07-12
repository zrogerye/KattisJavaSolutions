import java.util.Scanner;

public class justaminute {
    private double obsSeconds;
    private double slMinutes;

    public static void main(String[] args)throws Exception {
    	new justaminute().run();
    }
    
    public void run()throws Exception{
    	scanData();
    	printResult();
    }

    private void scanData() {
    	Scanner scan = new Scanner(System.in);
    	int obs = Integer.parseInt(scan.nextLine());
    	obsSeconds = 0;
    	slMinutes = 0;
    	for (int i = 0; i < obs; i++) {
    		String[] observation = scan.nextLine().split(" ");
    		obsSeconds += Long.parseLong(observation[1]);
    		slMinutes += Long.parseLong(observation[0]);
    	}
    	scan.close();
    }

    private void printResult() {
    	double result = obsSeconds / (slMinutes * 60);
    	if (result <= 1) {
    		System.out.println("measurement error");
    	} else {
    		System.out.format("%.9f", result);
    		
    	}
    }
}
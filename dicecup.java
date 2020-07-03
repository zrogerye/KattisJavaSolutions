import java.util.Scanner;

public class dicecup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
        String[] nums = new Scanner(System.in).nextLine().split(" ");
        int dice1 = Integer.parseInt(nums[0]);
        int dice2 = Integer.parseInt(nums[1]);
        int center = (dice1 + dice2) / 2;
        int difference = (dice1>dice2)?(dice1-dice2)/2:(dice2-dice1)/2;
        int start = ++center - difference;
        int stop = ++center + difference;
        if((dice1 + dice2) % 2 != 0)
            stop++;
        for(int i = start; i < stop; i++)
            System.out.println(i);

	}

}

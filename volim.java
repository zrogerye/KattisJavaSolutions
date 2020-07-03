import java.io.File;
import java.util.Scanner;

public class volim {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(new File("volim.1.in"));
		Scanner sc = new Scanner(System.in);
        int curr = Integer.parseInt(sc.nextLine());
        int questions = Integer.parseInt(sc.nextLine());
        int time = 0;
        for(int i = 0; i < questions; i++){
            String[] line = sc.nextLine().split(" ");
            time += Integer.parseInt(line[0]);
            if(time > 210)
                break;
            if(!line[1].equals("T"))
                continue;
            curr++;
        }
        curr = (curr % 8 == 0)?8 :curr % 8;
        System.out.println(curr);
        
        
        

	}

}

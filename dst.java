import java.util.Scanner;

public class dst {
    public static void main(String[] args) throws Exception{
        new dst().run();
    }
    
    public void run()throws Exception{
    	Scanner file = new Scanner(System.in);

        int asdf = file.nextInt();
        while (asdf-- > 0) {
            String roll = file.next();
            int change = file.nextInt();
            int hours = file.nextInt();
            int mins = file.nextInt();

            int count = 0;
            if (roll.equals("F")) {
                mins += change;
                while (mins >= 60) {
                    mins -= 60;
                    count++;
                }
                hours += count;
                hours %= 24;
            } else {
                mins -= change;
                while (mins < 0) {
                    mins += 60;
                    count++;
                }
                hours -= count;
                if (hours < 0)
                    hours += 24;
            }
            System.out.println(hours + " " + mins);
        }

        file.close();
    }
}
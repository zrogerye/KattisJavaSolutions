import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class moviecollection {
	
	
	public void run()throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numTestCases = Integer.parseInt(reader.readLine());//test
        while (numTestCases-- > 0) {
        	String temp1[] = reader.readLine().split(" ");
        	int numberof = Integer.parseInt(temp1[0]);
        	
        	
        	
        	
            int[] collection = new int[numberof + 1];
            
            
            
            
            int[] thisIsAVariable = new int[500000];

            for (int i = 1; i <= numberof; i++) 
            {
                uhhhhThingThatDoesThing(thisIsAVariable, i, 1);
                collection[i] = numberof - i + 1;
            }

            int count = numberof;
            temp1 = reader.readLine().split(" ");
            for (String movie : temp1) {
                count++;
                int movieId = Integer.parseInt(movie);
                int total = 0;
                int index = collection[movieId];

                while (index > 0) {
                    total += thisIsAVariable[index];
                    index -= -index & index;
                }

                uhhhhThingThatDoesThing(thisIsAVariable, collection[movieId], -1);
                collection[movieId] = count;
                uhhhhThingThatDoesThing(thisIsAVariable, collection[movieId], 1);
                System.out.print(numberof - total + " ");
            }System.out.println();

        }
}

    public static void main(String[] args) throws Exception {
    	new moviecollection().run();
    }

    public static void uhhhhThingThatDoesThing(int[] thisIsAVariable, int index, int value) {
        if (index >= thisIsAVariable.length) 
        {
            return;
        }
        thisIsAVariable[index] += value;
        index += -index & index;
        uhhhhThingThatDoesThing(thisIsAVariable, index, value);
    }
}
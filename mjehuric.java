import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mjehuric{

    public BufferedReader br;

    public static void main(String[] args) throws IOException {
       new mjehuric().run();
    }

    private void run() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        String[] split;

        int[] nums = new int[5];
        split = br.readLine().split(" ");

        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.valueOf(split[i]);
        }

        while(true){
            boolean uodate = false;
            for (int i = 0; i < 4; i++) {
                if(nums[i + 1] < nums[i]){
                    swap(nums, i, i + 1);
                    for (int j = 0; j < 5; j++) {
                        uodate = true;
                        System.out.print(nums[j] + " ");
                    }

                    System.out.println("");

                }
            }

            if(!uodate){
                break;
            }

        }



    }


    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}
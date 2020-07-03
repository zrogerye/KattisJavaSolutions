import java.util.*;

public class tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        char blank = '=';
        char blank2 = '=';
        if(nums[0] + nums[1] == nums[2])
            blank = '+';
        else if(nums[0] - nums[1] == nums[2])
            blank = '-';
        else if(nums[0] * nums[1] == nums[2])
            blank = '*';
            //be careful, might need to use floating point
        else if(nums[0] / nums[1] == nums[2])
            blank = '/';
        else if(nums[0] == nums[1] + nums[2])
            blank2 = '+';
        else if(nums[0] == nums[1] - nums[2])
            blank2 = '-';
        else if(nums[0] == nums[1] * nums[2])
            blank2 = '*';
        else
            blank2 = '/';
        System.out.printf("%d%c%d%c%d", nums[0], blank, nums[1], blank2, nums[2]);
    }
}
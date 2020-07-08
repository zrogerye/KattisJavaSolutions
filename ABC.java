import java.util.*;




public class ABC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        while(sc.hasNextInt()){
            nums.add(sc.nextInt());
        }
        Collections.sort(nums);
        sc.nextLine();

        char[] order = sc.nextLine().toCharArray();

        for(int i = 0; i < order.length; i++){
            switch(order[i]){
                case 'A':
                    System.out.println(nums.get(0));
                    break;
                case 'B':
                    System.out.println(nums.get(1));
                    break;
                case 'C':
                    System.out.println(nums.get(2));
                    break;
            }
        }
    }
}
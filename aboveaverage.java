import java.util.*;

public class aboveaverage {
    public static void main(String[] args) {
        Scanner file = new Scanner(System.in);
        int c = file.nextInt();
        for(int i=0;i<c;i++){
            int n = file.nextInt();
            int[] arr = new int[n];
            double avg=0;
            for(int j=0;j<n;j++){
                arr[j]=file.nextInt();
                avg+=arr[j];
            }
            avg = avg/n;
            int above=0;
            for(int j=0;j<n;j++)if(arr[j]>avg)above++;
            System.out.printf("%.3f%s  \n",(double)above/n*100,"%");
        }
    }
}
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class synchronizinglists {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new File("sample.in"));
		while(true){
					int cases = sc.nextInt();
		if(cases != 0){
			ArrayList<Integer> l1 = new ArrayList<>();
			ArrayList<Integer> l2 = new ArrayList<>();
			ArrayList<Integer> l3 = new ArrayList<>();
			
			
			for(int i = 0; i < cases; i++){
				l1.add(sc.nextInt());
			}
			for(int i = 0; i < cases; i++){
				l3.add(sc.nextInt());
			}
			for(Integer i: l1){
				l2.add(i);
			}
			Collections.sort(l2);
			Collections.sort(l3);
			int[] l4 = new int[cases];
			for(int i = 0; i < l2.size(); i++){
				l4[l1.indexOf(l2.get(i))] = l3.get(i);
			}
			for(Integer i: l4){
				System.out.println(i);
			}
			System.out.println();
		}
		else break;
		}
		

	}

}

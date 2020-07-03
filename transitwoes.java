import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class transitwoes {

	public static void main(String[] args)throws Exception {
		// TODO uhm do something
		Scanner c = new Scanner(System.in);
		
		
		//first line
		//Scanner c = new Scanner(new File("transitwoes-02.in"));
		int starttime = c.nextInt();
		int timelimit = c.nextInt();
		int transittaken = c.nextInt();
		c.nextLine();
		//System.out.println(starttime);
		//System.out.println(timelimit);
		//System.out.println(transittaken);
		
		//second line
		String a = c.nextLine().trim();
		String[] b = a.split(" ");
		int[] walktimes = new int[b.length];
		for(int x = 0; x < b.length; x++)
		{
			walktimes[x] = Integer.parseInt(b[x]);
		}
		
		//third line
		String d = c.nextLine().trim();
		String[] e = d.split(" ");
		int[] ridetime = new int[e.length];
		for(int x = 0; x < e.length; x++)
		{
			ridetime[x] = Integer.parseInt(e[x]);
		}
		
		//fourth line
		String f = c.nextLine().trim();
		String[] g = f.split(" ");
		int[] busarrival = new int[g.length];
		for(int x = 0 ; x < g.length; x++)
		{
			busarrival[x] = Integer.parseInt(g[x]);
		}
		
		//actual code??????????
		for(int x = 0; x < transittaken; x++)
		{
			starttime+=walktimes[x];
			while(starttime <= busarrival[x])
			{
				starttime++;
			}
			
			
		}
		starttime+=walktimes[walktimes.length-1];
		
		
		//uhhhhhhhhhhhhhhhhh
		if(starttime < timelimit)
		{
			System.out.println("yes");
		}
		if(starttime > timelimit)
		{
			System.out.println("no");
		}
		
		//wth
		//System.out.println(Arrays.toString(walktimes)); 
		//System.out.println(Arrays.toString(ridetime));
		//System.out.println(Arrays.toString(busarrival));
		
		
		

	}

}

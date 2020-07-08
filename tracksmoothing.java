import java.util.Scanner;



	public class tracksmoothing {
		
		public void run()throws Exception{
			Scanner file = new Scanner(System.in);
			
			int cases = file.nextInt();
			
			while (cases --> 0)
			{
				int radius = file.nextInt();
				int numPoints = file.nextInt();
				
				double trackLength = 0;
				
				int[] x = new int[numPoints];
				int[] y = new int[numPoints];
				
				for (int i = 0; i < numPoints; i++)
				{
					x[i] = file.nextInt();
					y[i] = file.nextInt();
				}
				
				int dY = y[0] - y[numPoints - 1];
				int dX = x[0] - x[numPoints - 1];
				
				trackLength += Math.hypot(dX , dY);
				
				for (int i = 0; i < numPoints - 1; i++)
				{
					dY = y[i + 1] - y[i];
					dX = x[i + 1] - x[i];
					
					trackLength += Math.hypot(dY , dX);
				}
				
				double circ = 2*radius*Math.PI;
				
				if (trackLength < circ)
					System.out.println("Not possible");
				else
				{
					System.out.printf("%.6f", (trackLength - circ)/trackLength);
					System.out.println();
				}
			}
			
			file.close();
		}
		
		public static void main(String[] args) throws Exception{
			new tracksmoothing().run();
		}
		
}
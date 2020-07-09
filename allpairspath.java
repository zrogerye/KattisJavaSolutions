import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class allpairspath {

    public static final int INF = 1000000;
    
    public void run()throws Exception{
    	 IO io = new IO(System.in);
         boolean firstRun = true;
         int point, side, nexts, tmp_x, tmp_y;
         long dist;

         try {
             while(true) {
                 point = io.nextInt();
                 side = io.nextInt();
                 nexts = io.nextInt();


                 if (point == 0 && side == 0 && nexts == 0) {
                     break;
                 }


                 if (firstRun) {
                     firstRun = false;
                 } else {
                     System.out.println();
                 }
                 

                 long[][] graph = new long[point][point];
                 for (int i = 0; i < point; i++) {
                     Arrays.fill(graph[i], INF);
                 }
                 

                 for (int i = 0; i < side; i++) {
                     tmp_x = io.nextInt();
                     tmp_y = io.nextInt();
                     graph[tmp_x][tmp_y] = Math.min(io.nextLong(), graph[tmp_x][tmp_y]);
                 }
                 

                 for (int i = 0; i < point; i++) {
                     graph[i][i] = 0;
                 }
                 
                 long[][] res = uhm(graph);
                 for (int i = 0; i < point; i++) {
                     if (res[i][i] < 0) {
                         res[i][i] = -INF; 
                         for (int j = 0; j < point; j++) {
                             for (int k = 0; k < point; k++) {
                                 if (res[j][i] < INF && res[i][k] < INF) {
                                     res[j][k] = -INF;
                                 }
                             }
                         }
                     }
                 }
                 
                 for (int i = 0; i < nexts; i++) {
                     dist = res[io.nextInt()][io.nextInt()];
                     if (dist >= INF) {
                         System.out.println("Impossible");                        
                     } else if (dist <= -INF) {
                         System.out.println("-Infinity");
                     } else {
                         System.out.println(dist);
                     }
                 }
             }
         
         } catch(IOException e) {
             System.exit(0);
         }

         io.close();
    }

    public static void main(String[] args)throws Exception {
        new allpairspath().run();
       
    }
    
    static long[][] uhm(long[][] graph) {
        int point = graph.length;
        long dist[][] = graph.clone();

        for (int k = 0; k < point; k++) {
            for (int i = 0; i < point; i++) {
                for (int j = 0; j < point; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF) {
                        if (dist[i][k] + dist[k][j] < dist[i][j]) {
                            dist[i][j] = dist[i][k] + dist[k][j];
                        }
                    }
                }
            }
        }
        return dist;
    }

    static void printArray(long[][] array) {
        for (long[] e: array) {
            for (long f: e) {
                System.out.printf("%.0f ", f);
            }
            System.out.printf("\n");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    //PrintWriter tingz
    
    static class IO extends PrintWriter {
        static BufferedReader r;
        static StringTokenizer t;

        public IO(InputStream i) {
            super(new BufferedOutputStream(System.out));
            r = new BufferedReader(new InputStreamReader(i));
            t = new StringTokenizer("");
        }

        public String next() throws IOException {
            while (!t.hasMoreTokens()) {
                t = new StringTokenizer(r.readLine());
            }
            return t.nextToken();
        }

        public int nextInt() throws IOException{
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
}
import java.io.*;
import java.util.*;

public class prozor {
	
	public void run()throws Exception{
		IO io = new IO(System.in);

		int rows = io.nextInt();
		int columns = io.nextInt();
		int racket = io.nextInt();

		char[][] window = new char[rows][columns];
		String line;
		for (int r = 0; r < rows; r++) {
			line = io.next();
			for (int c = 0; c < columns; c++) {
				window[r][c] = line.charAt(c);
			}
		}

		int bestHit = 0;
		int bestR = 0;
		int bestC = 0;
		int hit;
		for (int r = 0; r < rows - racket + 1; r++) {
			for (int c = 0; c < columns - racket + 1; c++) {
				
				hit = 0;
				for (int i = r + 1; i < r + racket - 1; i++) {
					for (int j = c + 1; j < c + racket - 1; j++) {
						if (window[i][j] == '*') {
							hit ++;
						}
					}
				}
				if (hit > bestHit) {
					bestHit = hit;
					bestR = r;
					bestC = c;
				}
			}
		}

		window[bestR][bestC] = '+';
		window[bestR + racket - 1][bestC] = '+';
		window[bestR + racket - 1][bestC + racket - 1] = '+';
		window[bestR][bestC + racket - 1] = '+';
		
		for (int i = bestC + 1; i < bestC + racket - 1; i++) {
			window[bestR][i] = '-';
		}
		for (int i = bestR + 1; i < bestR + racket - 1; i++) {
			window[i][bestC] = '|';
		}
		for (int i = bestC + 1; i < bestC + racket - 1; i++) {
			window[bestR + racket - 1][i] = '-';
		}
		for (int i = bestR + 1; i < bestR + racket - 1; i++) {
			window[i][bestC + racket - 1] = '|';
		}
		io.println(bestHit);
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < columns; c++) {
				io.printf("%c", window[r][c]);
			}
			io.println();
		}
		io.close();
	}

	public static void main(String[] args) throws Exception {
		new prozor().run();
	}

	static class IO extends PrintWriter {
		static BufferedReader r;
		static StringTokenizer t;

		public IO(InputStream i) {
			super(new BufferedOutputStream(System.out));
			r = new BufferedReader(new InputStreamReader(i));
			t = new StringTokenizer("");
		}

        public String nextLine() throws IOException {
            return r.readLine();
        }

		public String next() throws IOException {
			while (!t.hasMoreTokens()) {
				t = new StringTokenizer(nextLine());
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
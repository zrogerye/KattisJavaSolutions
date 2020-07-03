import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class maptiles2 {
	
	public static void main(String[] args) {
		MyScanner in = new MyScanner();
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		
		String s = in.nextLine();
		int zoomLevel = s.length(), length = (int) Math.pow(2, zoomLevel);
		int xLower = 0, xUpper = length - 1, yLower = 0, yUpper = length - 1;
		
		for (int i = 0; i < zoomLevel; i++) {
			char c = s.charAt(i);
			
			if (c == '0') {
				xUpper = (xLower + xUpper) / 2;
				yUpper = (yLower + yUpper) / 2;
			} else if (c == '1') {
				xLower = (xLower + xUpper) / 2 + 1;
				yUpper = (yLower + yUpper) / 2;
			} else if (c == '2') {
				xUpper = (xLower + xUpper) / 2;
				yLower = (yLower + yUpper) / 2 + 1;
			} else {
				xLower = (xLower + xUpper) / 2 + 1;
				yLower = (yLower + yUpper) / 2 + 1;
			}
		}
		
		out.printf("%d %d %d\n", zoomLevel, xLower, yLower);
		
		out.close();
	}
	
	public static class MyScanner {
		private static BufferedReader br;
		private String line;
		private StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String nextLine() {
			try {
				line = br.readLine();
			} catch (IOException e) {
				return null;
			}

			if (line != null) {
				st = new StringTokenizer(line);
			}

			return line;
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				line = nextLine();
				if (line == null) {
					return null;
				}
			}

			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

}

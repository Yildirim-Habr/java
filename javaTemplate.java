import java.io.*;
import java.util.*;
import java.math.*;

/******************************\
 * The solution is at the top *
 *                            *
 *   Created by : azhar556    *
\******************************/

public class Solution {
    static class Task {
        public void solve() {
        
		}
    }
    public static void main(String[] args) {        
        long time = System.currentTimeMillis();
        int t;// = in.readInt();
        t = 1;
        Task solver = new Task();
        while (t-- > 0) solver.solve(); 
        err.println("Time elapsed : " + (System.currentTimeMillis() - time) / 1000F + " s.");
        err.close(); out.close();
    }
	static class Util {
		public int[] radixSort(int[] f){ 
			return radixSort(f, f.length); 
		}
		private int[] radixSort(int[] f, int n) {
			int[] to = new int[n];
			{
				int[] b = new int[65537];
				for(int i = 0;i < n;i++)b[1+(f[i]&0xffff)]++;
				for(int i = 1;i <= 65536;i++)b[i]+=b[i-1];
				for(int i = 0;i < n;i++)to[b[f[i]&0xffff]++] = f[i];
				int[] d = f; f = to;to = d;
			}
			{
				int[] b = new int[65537];
				for(int i = 0;i < n;i++)b[1+(f[i]>>>16)]++;
				for(int i = 1;i <= 65536;i++)b[i]+=b[i-1];
				for(int i = 0;i < n;i++)to[b[f[i]>>>16]++] = f[i];
				int[] d = f; f = to;to = d;
			}
			return f;
		}	
	}
    static InputReader in = new InputReader();
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static PrintWriter err = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.err)));    
    static class InputReader {
		private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		private StringTokenizer token;
		public String read() {
			while (token == null || !token.hasMoreTokens()) {
				try {
					token = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return token.nextToken();
		}
		public char readChar() {
			return Character.valueOf(read().charAt(0));
		}
		public int readInt() {
			return Integer.parseInt(read());
		}
		public double readDouble() {
			return Double.parseDouble(read());
		}
		public long readLong() {
			return Long.parseLong(read());
		}
    }
}
// Collections Arrays Math
// Vector HashSet TreeSet HashMap TreeMap ArrayDeque 

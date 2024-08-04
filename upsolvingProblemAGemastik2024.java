package pkgA;

import java.io.*;
import java.util.*;
import java.math.*;

/******************************\
 * The solution is at the top *
 *                            *
 *   Created by : azhar556    *
\******************************/
public class A {
	static void solve() {
		long a = nl();
		long b = nl();
		long c = nl();
		long d = nl();
		
		long ans = 0;
		
		if (b == 0 && c == 0) {
			a += d;

			ans += (long)Math.ceil((double)a/3);
		}
		else {
			ans += (long)Math.ceil((double)a/3);

			b += c;
			ans += (long)Math.ceil((double)b/3);
			
			ans += (long)Math.ceil((double)d/3);	
		}
		
		out.println(ans);
	}
 
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
//        int t = ni();
        int t = 1;
        while (t-- > 0) solve(); 
        err.println("Time elapsed : " + (System.currentTimeMillis() - time) / 1000F + " s.");
        err.close(); out.close();
    }
 
	static int[] radixSort(int[] f){ return radixSort(f, f.length); }
	static int[] radixSort(int[] f, int n)
	{
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
 
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static PrintWriter err = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.err)));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer token;
    
    static class Permutation {
		   public static int[] swap(int data[], int left, int right) {
		 
			    int temp = data[left];
		        data[left] = data[right];
		        data[right] = temp;
		 
		        return data;
		    }
		 
		    public static int[] reverse(int data[], int left, int right) {
		 
		        while (left < right) {
		        	int temp = data[left];
		            data[left++] = data[right];
		            data[right--] = temp;
		        }
		 
		        return data;
		    }
		 
		    public static boolean nextPermutation(int data[]) {
		        if (data.length <= 1)
		            return false;
		 
		        int last = data.length - 2;
		 
		        while (last >= 0) {
		            if (data[last] < data[last + 1]) {
		                break;
		            }
		            last--;
		        }
		 
		        if (last < 0)
		            return false;
		 
		        int nextGreater = data.length - 1;
		 
		        for (int i = data.length - 1; i > last; i--) {
		            if (data[i] > data[last]) {
		                nextGreater = i;
		                break;
		            }
		        }
		 
		        data = swap(data, nextGreater, last);
		        data = reverse(data, last + 1, data.length - 1);
		        return true;
		    }
		    static boolean prevPermutation(int[] data) {
				  int n = data.length;
				  int i = n - 2;
				  while (i >= 0 && data[i] <= data[i + 1]) {
				      i--;
				  }
				 
				  if (i < 0) {
				      return false;
				  }
				 
				  int j = n - 1;
				  while (j > i && data[j] >= data[i]) {
				      j--;
				  }
				 
				  swap(data, i, j);
			 
			      reverse(data, i + 1, n - 1);
			      return true;
			}
    }
    
    static String ns() {
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
    static char nc() {
        return Character.valueOf(ns().charAt(0));
    }
    static int ni() {
        return Integer.parseInt(ns());
    }
    static double nd() {
        return Double.parseDouble(ns());
    }
    static long nl() {
        return Long.parseLong(ns());
    }
}

// Collections Arrays Math
// Vector HashSet TreeSet HashMap TreeMap ArrayDeque 

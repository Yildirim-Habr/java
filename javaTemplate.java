import java.io.*;
import java.util.*;

/******************************\
 * The solution is at the top *
 *                            *
 *   Created by : azhar556    *
\******************************/

public class Solution {
    static void solve() {
        
    }    

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int t;// = ni();
        t = 1;
        while (t-- > 0) solve(); 
        err.println("Time elapsed : " + (System.currentTimeMillis() - time) / 1000F + " s.");
        err.close(); out.close();
    }

    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static PrintWriter err = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.err)));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer token;
        
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

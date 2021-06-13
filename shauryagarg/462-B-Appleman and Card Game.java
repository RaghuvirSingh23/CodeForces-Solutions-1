import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
 
public class C {
 
    public static void main(String args[]) {
        FastReader in = new FastReader();
        long n = in.nextInt();
        long k = in.nextInt();
        String s = in.nextLine();
        HashMap<Character,Long> a = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(a.containsKey(s.charAt(i)))
                a.put(s.charAt(i),a.get(s.charAt(i))+1);
            else
                a.put(s.charAt(i),1L);
        }
        long ans = 0;
        while(k>0){
            long max = Collections.max(a.values());
            if(k<=max){
                ans += k*k;
                break;
            }
            else{
                ans += max*max;
                k -= max;
                a.values().remove(max); 
            }
        }
        System.out.println(ans);
    }
 
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
 
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
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
 
        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
 
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
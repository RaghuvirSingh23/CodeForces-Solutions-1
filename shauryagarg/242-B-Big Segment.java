import java.io.*;
import java.util.*;

public class B {
    public static void main(String args[]){
        FastReader in = new FastReader();
        int n = in.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        long maxX = -1;
        long max = 0;
        long maxY = -1;
        int count = -1;
        if(n==1){
            System.out.println(1);
            return;
        }
        for(int i=0; i<n; i++){
            x[i] = in.nextLong();
            y[i] = in.nextLong();
            if(Math.abs(y[i]-x[i])>Math.abs(maxX-maxY)){
                maxX = x[i];
                maxY = y[i];
                count = i;
            }
        }
        // System.out.println(maxX + " " + maxY);
        boolean flag = false;
        for(int i=0; i<n; i++){
            if(x[i]>=maxX && y[i]<=maxY)
                flag = true;
            else{
                flag = false;
                break;
            }
            // System.out.println(flag);
        }
        // System.out.println(flag);
        if(flag) System.out.println(count+1);
        else System.out.println(-1);
        
    }

    
    
    public static long gcd(long a, long b) {
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

        long[] readArrayLong(int n){
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
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

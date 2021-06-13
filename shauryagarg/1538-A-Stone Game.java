import java.io.*;
import java.util.*;

public class B {
    public static void main(String args[]){
        FastReader in = new FastReader();
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int[] a = new int[n];
            int maxI=-1, minI=-1;
            for(int i=0; i<n; i++){
                a[i] = in.nextInt();
                if(a[i]==n)
                    maxI = i+1;
                else if(a[i]==1)
                    minI = i+1;
            }
            // System.out.println(maxI + " " + minI);
            if(minI<=n/2 && maxI<=n/2){
                System.out.println(Math.max(minI,maxI));
            }
            else if(minI>n/2 && maxI>n/2){
                System.out.println(Math.max(n-minI+1,n-maxI+1));
            }
            else{
                if(minI > maxI){
                    System.out.println(Math.min(n-minI+maxI+1,Math.min(minI,n-maxI+1)));
                }
                else if(maxI > minI){
                    System.out.println(Math.min(n-maxI+minI+1,Math.min(maxI,n-minI+1)));
                }
                // else{
                //     System.out.println(Math.min(minI+(n-maxI+1),maxI+(n-minI+1)));
                // }
            }
            
            
        }

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

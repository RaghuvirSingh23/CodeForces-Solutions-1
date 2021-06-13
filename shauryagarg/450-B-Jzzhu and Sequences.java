import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class A {
    public static void main(String args[]){
        FastReader in = new FastReader();
        long x = in.nextLong();
        long y = in.nextLong();
        long n = in.nextLong();
        long[] a = new long[6];
        a[0] = x;
        a[1] = y;
        for(int i=2; i<6; i++){
            a[i] = y-x;
            y = a[i];
            x = a[i-1];
        }
        int rem = (int) (n%6);
        if(rem==0){
            if(a[5]<0)
                System.out.println(1000000007+a[5]%1000000007);
            else
                System.out.println(a[5]%1000000007);
            return;
        
        }
        if(a[rem-1]%1000000007>=0)
            System.out.println(a[rem-1]%1000000007);
        else
            System.out.println(1000000007+a[rem-1]%1000000007);


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

        long[] readArrayLong(int n) {
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class A {
    public static void main(String args[]){
        FastReader in = new FastReader();
        String s = in.nextLine();
        
        int h = s.indexOf("h");
        if(h!=-1) s = s.substring(h);
        else{
            System.out.println("NO");
            return;
        }
        int e = s.indexOf("e");
        if(e!=-1) s = s.substring(e);
        else{
            System.out.println("NO");
            return;
        }
        int i = s.indexOf("i");
        if(i!=-1) s = s.substring(i);
        else{
            System.out.println("NO");
            return;
        }
        int d = s.indexOf("d");
        if(d!=-1) s = s.substring(d);
        else{
            System.out.println("NO");
            return;
        }
        i = s.indexOf("i");
        if(i!=-1) s = s.substring(i);
        else{
            System.out.println("NO");
            return;
        }
        System.out.println("YES ");

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

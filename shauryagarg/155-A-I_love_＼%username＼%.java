import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class A {
    public static void main(String args[]) {
        FastReader in = new FastReader();
        int n = in.nextInt();
        int[] a = new int[n];
        int max = -1, min = 10001;
        for(int i=0; i<n; i++)
            a[i] = in.nextInt();

        int count = 0;
        for(int i=0; i<n; i++){
            if(i==0){
                max = a[i];
                min = a[i];
            }
            else{
                if(a[i]>max){
                    max = a[i];
                    count++;
                }
                else if(a[i]<min){
                    min = a[i];
                    count++;
                }
            }
        }
        System.out.println(count);
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

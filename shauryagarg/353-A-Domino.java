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

        int n = in.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int sumX=0, sumY=0;
        for(int i=0; i<n; i++){
            x[i] = in.nextInt();
            y[i] = in.nextInt();
            sumX += x[i];
            sumY += y[i];
        }

        if(sumX%2==0 && sumY%2==0) System.out.println(0);

        else if((sumX%2==0 && sumY%2!=0) || (sumX%2!=0 && sumY%2==0)){
            System.out.println(-1);
        }

        else{
            int flag = 1;
            for(int i=0; i<n; i++){
                if((x[i]%2==0 && y[i]%2!=0) || (x[i]%2!=0 && y[i]%2==0)){
                    flag = 0;
                    System.out.println(1);
                    break;
                }
                else flag = 1;
            }
            if(flag==1) System.out.println(-1);
        }

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

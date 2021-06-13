import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class C {
    public static void main(String args[]){
        FastReader in = new FastReader();
        int t = in.nextInt();
        while(t-->0){
            // List<Integer> a = new ArrayList<>();
            int[] a = in.readArray(4);
            int max1 = 0, max2=0;
            if(a[0]>a[1]) max1 = a[0];
            else max1 = a[1];
            if(a[2]>a[3]) max2 = a[2];
            else max2 = a[3];
            Arrays.sort(a);
            int x = a[3];
            int y = a[2];
            if((x==max1 && y==max2) || (x==max2 && y==max1)) System.out.println("YES");
            else System.out.println("NO");
            
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

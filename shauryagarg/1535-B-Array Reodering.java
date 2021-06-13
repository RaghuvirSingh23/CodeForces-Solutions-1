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
            int n = in.nextInt();
            int[] a = in.readArray(n);
            Arrays.sort(a);
            List<Integer> b = new ArrayList<>();
            int count = 0, evenNo=0, oddNo=0;
            for(int i=0; i<n; i++){
                if(a[i]%2==0) evenNo++;
                else{
                    oddNo++;
                    b.add(a[i]);
                }
            }
            for(int i=0; i<evenNo; i++){
                count += n-1;
                n--;
            }
            for(int i=0; i<oddNo-1; i++){
                for(int j=i+1; j<oddNo; j++){
                    if((gcd(b.get(i), 2*b.get(j))>1) && (a[j]!=1 || a[i]!=1)) count++;
                }
            }

            System.out.println(count);
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class B {
    public static void main(String args[]){
        FastReader in = new FastReader();
        int t = in.nextInt();
        long[] a = in.readArrayLong(4);
        String s = in.nextLine();
        long diff1 = a[2]-a[0];
        long diff2 = a[3]-a[1];
        char[] d = s.toCharArray();
        int count = 0;
        boolean flag = false;
        for(int i=0; i<d.length; i++){
            if(d[i]=='N'){
                if(diff2>0) diff2--;
                count++;
            }
            else if(d[i]=='S'){
                if(diff2<0) diff2++;
                count++;
            }
            else if(d[i]=='E'){
                if(diff1>0) diff1--;
                count++;
            }
            else if(d[i]=='W'){
                if(diff1<0) diff1++;
                count++;
            }
            if(diff1==0 && diff2==0){
                flag = true;
                break;
            }
        }
        if(flag) System.out.println(count);
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

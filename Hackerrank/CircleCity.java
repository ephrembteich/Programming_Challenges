import java.io.*;
import java.util.*;

public class CircleCity {

    public static void main(String[] args) {
        MyScanner scan = new MyScanner();
        int T = scan.nextInt();
        
        for(int i=0; i<T; i++){
            int D = scan.nextInt();
            int K = scan.nextInt();
            
            int subs = 0;
            for(int j=0; j<Math.ceil(Math.sqrt(D)); j++){
                double cal = Math.sqrt(D-j*j);
                if((cal == Math.floor(cal)) && !Double.isInfinite(cal)){
                    subs += 4;
                }
            }
            
            if(subs>K){
                System.out.println("impossible");
            }else{
                System.out.println("possible");
            }
        }
    }
    
    public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
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

		String nextLine(){
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
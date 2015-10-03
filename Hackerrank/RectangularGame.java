import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RectangularGame {

    public static void main(String[] args) {
        MyScanner scan = new MyScanner();
        int N = scan.nextInt();
        
        long a = scan.nextLong();
        long b = scan.nextLong();
        long minX = a;
        long minY = b;
        for(int i=1; i<N; i++){
            a = scan.nextLong();
            b = scan.nextLong();
            if(a<minX){
                minX = a;
            }
            if(b<minY){
                minY = b;
            }
        }
        System.out.println(minX*minY);
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
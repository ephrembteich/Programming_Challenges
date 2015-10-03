import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SherlockAndCounting {

	public static void main(String[] args) {
		MyScanner scan = new MyScanner();
		int T = scan.nextInt();

		//The equation is i^2+i*N-N*K
		for(int i=0; i<T; i++){
			long N = scan.nextLong();
			long K = scan.nextLong();

			double delta = N*N-4*N*K;
			if (delta<=0){
				System.out.println(N-1);
			}else {
				double D = Math.sqrt(delta);
				long A = (long) Math.floor((N-D)/2), B = (long) Math.ceil((N+D)/2);
				/* This is a positive quadratic and represents a normal parabola.
				 * This parabola is divided by the roots A and B to 3 intervals.
				 * But to be less than zero, we must take only the middle interval (between the roots)
				 * because the other two converge to y=infinity as x grow
				 */
				System.out.println(A+(N-B));			
			}
		}
	}

	//-----------MyScanner class for faster input----------
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
	//--------------------------------------------------------
}
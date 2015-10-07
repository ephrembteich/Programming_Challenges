/*
 * ACM Jordanian Collegiate Programming Contest 2013
 */

import java.io.*;
import java.util.StringTokenizer;

public class PasswordPatterns {
	
	public static void main(String[] args) {
		MyScanner scan = new MyScanner();
		int T  = scan.nextInt();
		
		for(int i=0; i<T; i++){
			String str = scan.next();
			int len = str.length();
			
			String result = "NO";
			int start = 0;
			int end = len;
			int j=0;
			String sub1 = str.substring(start, j+1);
			String sub2 = str.substring(end-j-1, end);
			while(j<len/2){
				if(!(!sub1.equals(sub2) && j<len/2)){
					result="YES";
					break;
				}
				j++;
				sub1 = str.substring(start, j+1);
				sub2 = str.substring(end-j-1, end);
			}
			
			System.out.println("Case "+(i+1)+": "+result);
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
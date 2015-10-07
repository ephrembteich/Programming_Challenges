/* Codeforces Round #110 (Div. 2)
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Trace {

	public static void main(String[] args) {
		MyScanner scan = new MyScanner();
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		double result = 0;
		for(int i=n; i>0; i--){
			if(i%2==n%2){
				result += Math.PI*arr[i-1]*arr[i-1];
			}else{
				result -= Math.PI*arr[i-1]*arr[i-1];
			}
		}
		System.out.println(result);
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
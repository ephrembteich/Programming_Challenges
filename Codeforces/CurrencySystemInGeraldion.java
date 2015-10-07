/* Codeforces Round #313 (Div. 2)
 */

import java.io.*;
import java.util.StringTokenizer;

public class CurrencySystemInGeraldion {

	public static void main(String[] args) {
		MyScanner scan = new MyScanner();
		int T = scan.nextInt();
		
		boolean one = false;
		int i=0;
		while(!one && i<T){
			if(scan.nextInt()==1){
				one=true;
			}
			i++;
		}
		System.out.println(one?"-1":"1");
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
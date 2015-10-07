import java.io.*;
import java.util.StringTokenizer;

public class AmrAndPins {

	public static void main(String[] args) {
		MyScanner scan = new MyScanner();
		int r = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		double distance = Math.sqrt(Math.pow(x2-x,2)+Math.pow(y2-y,2));
		System.out.println((int)Math.ceil(distance/(r*2)));
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
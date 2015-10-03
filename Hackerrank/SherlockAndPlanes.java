import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SherlockAndPlanes {

	public static void main(String[] args) {
		MyScanner scan = new MyScanner();
		int T = scan.nextInt();
		
		for(int i=0; i<T; i++){
			Point3d p1 = new Point3d(scan.nextInt(), scan.nextInt(), scan.nextInt());
			Point3d p2 = new Point3d(scan.nextInt(), scan.nextInt(), scan.nextInt());
			Point3d p3 = new Point3d(scan.nextInt(), scan.nextInt(), scan.nextInt());
			Point3d p4 = new Point3d(scan.nextInt(), scan.nextInt(), scan.nextInt());

			if((p1.x==p2.x && p1.x==p3.x && p3.x==p4.x)||(p1.y==p2.y && p1.y==p3.y && p3.y==p4.y)||
					(p1.z==p2.z && p1.z==p3.z && p3.z==p4.z)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
	
	public static class Point3d{
		int x;
		int y;
		int z;
		
		public Point3d(int x, int y, int z){
			this.x = x;
			this.y = y;
			this.z = z;
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
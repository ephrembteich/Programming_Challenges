import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PolarAngles {

	public static void main(String[] args) {
		MyScanner scan = new MyScanner();
		int T = scan.nextInt();

		PointAngle[] arr = new PointAngle[T];
		for(int i=0; i<T; i++){
			int x = scan.nextInt();
			int y = scan.nextInt();
			double factor = 2*Math.PI;
			double angle = (Math.atan2(y, x)+factor)%factor;
			double r = Math.sqrt(x*x + y*y);
			arr[i] = new PointAngle(x, y, angle, r);
		}
		quickSort(arr, 0, T-1);
		
		for(int i=0; i<T; i++){
			System.out.println(arr[i].x+" "+arr[i].y);
		}
	}
	
	public static void quickSort(PointAngle[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
		if (low >= high)
			return;
 
		int middle = low + (high - low) / 2;
		PointAngle pivot = arr[middle];
		int i = low, j = high;
		while (i <= j) {
			/* If the angle are equal we compare with the radius*/
			while (arr[i].angle < pivot.angle || (arr[i].angle==pivot.angle && arr[i].r<pivot.r))
				i++;
			while (arr[j].angle > pivot.angle || (arr[j].angle==pivot.angle && arr[j].r>pivot.r))
				j--;
 
			if (i <= j) {
				PointAngle temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		if (low < j)
			quickSort(arr, low, j);
		if (high > i)
			quickSort(arr, i, high);
	}
	
	public static class PointAngle{
		int x;
		int y;
		double angle;
		double r;
		
		public PointAngle(int x, int y, double angle, double r) {
			this.x = x;
			this.y = y;
			this.angle = angle;
			this.r = r;
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
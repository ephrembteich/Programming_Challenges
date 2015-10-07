import java.util.Scanner;


public class CoinsGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		int L = scan.nextInt();
		int m = scan.nextInt();

		int []N = new int[m];
		int max = 0;
		for(int i=0; i<m;i++){
			N[i]=scan.nextInt();
			if(N[i]>max){
				max = N[i];
			}
		}

		int []arr = new int[max+1];
		arr[0] = 0;
		//DP
		for(int j=1; j<=max; j++){
			boolean canP = false;
			if((j-K>=0 && arr[j-K]==0)||(j-L>=0 && arr[j-L]==0)||(arr[j-1]==0)){
				canP=true;
			}
			if(canP){
				arr[j]=1;
			}else{
				arr[j]=0;
			}
		}
		for(int i=0; i<m; i++){
			if(arr[N[i]]==0){
				System.out.print("B");
			}else{
				System.out.print("A");
			}
		}
		scan.close();
	}
}
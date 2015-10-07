import java.util.Scanner;

public class QCJ3TheGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=0; i<N; i++){
			int S = scan.nextInt();
			int add = 0;
			for(int j=0;j<S; j++){
				int coins = scan.nextInt();
				if(coins%2==1){
					add ^=(j+1);
				}
			}
			if(add==0){
				System.out.println("Hanks Wins");
			}else{
				System.out.println("Tom Wins");
			}
		}
		scan.close();
	}
}
import java.util.Scanner;

public class MMMGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=0; i<T; i++){
			int N = scan.nextInt();
			int add = 0;
			boolean allones = true;
			for(int j=0; j<N; j++){
				int Ai = scan.nextInt();
				if(Ai!=1){
					allones = false;
				}
				add ^=Ai;
			}
			if(allones){
				if(N%2==0){
					System.out.println("John");
				}else{
					System.out.println("Brother");
				}
			}else{
				if(add!=0){
					System.out.println("John");
				}else{
					System.out.println("Brother");
				}
			}
		}
		scan.close();
	}
}
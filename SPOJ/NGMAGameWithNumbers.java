import java.util.Scanner;

public class NGMAGameWithNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		
		if(N%10==0){
			System.out.println(2);
		}else{
			System.out.println(1);
			System.out.println(N%10);
		}
	}
}
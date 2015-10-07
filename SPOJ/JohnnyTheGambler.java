import java.util.Scanner;

public class JohnnyTheGambler {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int casesNum = scanner.nextInt();
		
		for(int i=0; i<casesNum; i++)
		{
			int[] array = new int[100001];
			int X = scanner.nextInt();
			int cardsNum = scanner.nextInt();
			long count = 0;

			for(int j=0; j<cardsNum; j++){
				int card = scanner.nextInt();
				if(card<=X){
					count+=array[X-card];
					array[card] ++;
				}
			}
			System.out.println((i+1)+". "+count);
		}
		scanner.close();
	}
}
import java.util.*;

public class MaximizeXOR {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = Integer.parseInt(scan.nextLine());
        int R = Integer.parseInt(scan.nextLine());

        System.out.println(maxXor(L, R));
        scan.close();
    }
	
    public static int maxXor(int L, int R) {
        int max = 0;
        for(int i=L; i<=R; i++){
            for(int j=L; j<=R; j++){
                if((i ^ j)>max){
                    max = i ^ j;
                }
            }
        }
        return max;
    }
}
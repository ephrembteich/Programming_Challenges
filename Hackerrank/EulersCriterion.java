/* For info on Euler's Critirion refer to thi link: https://en.wikipedia.org/wiki/Euler%27s_criterion */
import java.util.Scanner;

public class EulersCriterion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        for(int i=0; i<T; i++){
            int A = scan.nextInt();
            int M = scan.nextInt();
            
            long answer = solve(A, (M-1)/2, M);
            if(answer==1 || A==0 || A==2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        scan.close();
    }
    
    /* This method is in O(log(n)), optimized from O(n) by subsequently dividing the power
     * by two and multipltying the answer by two.
     */
    public static long solve(int A, int pow, int M){
        if(pow==0){
            return 1;
        }else if(pow==1){
            return A%M;
        }else{
            long answer = solve(A, pow/2, M);
            long temp = (answer*answer)%M;
            
            /* If pow is odd, then by dividing it by two, we would have lost one operation.
             * So we multiply once again with (A%M)
             */
            if(pow%2==1){
                temp *= (A%M);
                temp %= M;
                return temp;
            }else {
                return temp;
            }
        }
    }
}
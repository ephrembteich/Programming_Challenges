/* This problem can be solved with the help of matrix multiplication, we refer to 
 * this page "http://www.geeksforgeeks.org/program-for-nth-fibonacci-number/".
 * Recursion and dynamic programming won't get accepted and will give you time limit error.
 * The fact that the matrix M = {{1,1},{1,0}} is a special matrix; M^n will give a new matrix
 * where M(0, 0) is F(n+1), the Fibonacci number of n+1.
 * Note that this is only for the case of a normal Fibonacci sequence where F(0)=0 and F(1)=1
 */
import java.util.*;

public class FibonnaciFindingEasy {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        for(int i=0; i<T; i++){
            long A = scan.nextInt();
            long B = scan.nextInt();
            long N = scan.nextInt();
            
            if(N==0){
                System.out.println(A);
            }else if(N==1){
                System.out.println(B);
            }else{
                long [][] superM = {{1, 1},{1, 0}};
                /* Because the base case has changed from F(0)=0 and F(1)=1 to F(0)=A and F(1)=B
                 * we use a new matrix which is {{A, B-A},{B-A, 2*A-B}}, and we multiply it with 
                 * the special matrix {{1, 1},{1, 0}} n-times with Result(0, 0)=F(n)
                 */
                long [][] result = {{A, B-A},{B-A, 2*A-B}};
                
                /* This method optimizes the multiplication from O(n) to O(log(n)) due to the fact
                 * that we are multiplying with the same matrix over and over again. Lets take n=4,
                 * we need 3 multiplications of M (n*n*n*n), but we can optimize it to 2 multiplications
                 * if we do n*n, copy it to t (so now t=n*n) and then do t*t
                 * The program might not pass in java without this optimization
                 */
                while (N != 0) {
                    if (N%2==1) {
                        result = multiply(superM, result);
                    }
                    superM = multiply(superM, superM);
                    N >>>= 1;
                }
                //this bit is to convert a negative value to positive
                System.out.println((result[0][0]+1000000007)%1000000007);
            }
        }
        scan.close();
    }
    
    public static long[][] multiply(long [][] X, long [][] Y){
        long [][] result = new long[2][2];
        result[0][0] = (X[0][0]*Y[0][0] + X[0][1]*Y[1][0])%1000000007;
        result[0][1] = (X[0][0]*Y[0][1] + X[0][1]*Y[1][1])%1000000007;
        result[1][0] = (X[1][0]*Y[0][0] + X[1][1]*Y[1][0])%1000000007;
        result[1][1] = (X[1][0]*Y[0][1] + X[1][1]*Y[1][1])%1000000007;
        return result;
    }
}
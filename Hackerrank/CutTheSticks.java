import java.util.*;

public class CutTheSticks {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int [] arr = new int[1001];
        
        for(int i=0; i<N; i++){
            int num = scan.nextInt();
            arr[num]++;
        }
        cut(arr);
        scan.close();
    }
    
    private static void cut(int[] arr){
        int count = 0;
        int min = 0;
        boolean found= false;
        for(int i=1; i<1000; i++){
            if(arr[i] != 0){
                if(!found){
                    min = i;
                    found = true;
                }
                count += arr[i];
                int temp = arr[i];
                arr[i] = 0;
                arr[i-min] += temp; 
            }
        }
        if(count != 0){
            System.out.println(count);
            cut(arr);
        }
    }
}
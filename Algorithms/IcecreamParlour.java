import java.util.Scanner;
import java.util.Arrays;
 
public class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i=0;i<T;i++){
            int M = in.nextInt();
            int N = in.nextInt();
            int[] c = new int[N];
            for(int j=0;j<N;j++){
                c[j] = in.nextInt();
            }
            int c1 = 0;
            int c2 = 0;
            boolean flag = false;
            for(int j=0;j<N;j++){
                for(int k =0;k<N;k++){
                    if(c[j]+c[k]==M&& j!=k){
                        c1 = j+1;
                        c2 = k+1;
                        flag = true;
                        break;
                    }
                } 
                if(flag ==true){
                    break;
                }
            }
            System.out.println(c1<c2?(c1+" "+c2):(c2+" "+c1));
        }
    }
}
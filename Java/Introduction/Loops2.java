/*
Input Format :
    The first line contains an integer, t, denoting the number of queries.
    Each line i of the t subsequent lines contains three space-separated integers describing the respective a, b, and n values for that query.
Output Format :
    (a+2^0*b),(a+2^0*b+2^1*b),(a+2^0*b+2^1*b+2^2*b),(a+2^0*b+2^1*b+2^2*b....+2^n-1*b)
 */

import java.util.*;

public class Loops2 {

   public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            for(int j = 0;j<n;j++){
                sum = sum + (int)Math.pow(2,j) * b;
                System.out.print(sum+" ");
            }
            System.out.println();
        }   

        in.close();
    }
}

/* 
    You must read  integers from stdin and then print them to stdout. 
    Each integer must be printed on a new line. 
*/

import java.util.*;
public class StdInStdOut1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        scan.close();
    }
}
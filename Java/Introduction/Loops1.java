/*
Input Format :
    A single integer, N.
Output Format :
    Print 10 lines of output; each line i (where 1 <= i <= 10 ) contains the result of N*i in the form: N x i = result.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
        bufferedReader.close();
    }
}

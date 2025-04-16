import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {
    public static void miniMaxSum(List<Integer> arr) {
        int n = arr.size();
        long[] temp = new long[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr.get(i);
        }
        for (int i = 0; i < n; i++) {
            temp[i] = sum - arr.get(i);
        }
        long min = temp[0];
        long max = temp[0];
        for (int k = 1; k < n; k++) {
            if (temp[k] < min)
                min = temp[k];
            if (temp[k] > max)
                max = temp[k];
        }
        System.out.println(min + " " + max);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        Result.miniMaxSum(arr);
    }
}

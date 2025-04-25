import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {
    public static void plusMinus(List<Integer> arr) {
        int length = arr.size();
        double positive = 0, negative = 0, zero = 0;
        for (int num : arr) {
            if (num > 0)
                positive++;
            else if (num < 0)
                negative++;
            else
                zero++;
        }
        System.out.println(String.format("%.6f", (positive / length)));
        System.out.println(String.format("%.6f", (negative / length)));
        System.out.println(String.format("%.6f", (zero / length)));
    }
}

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        Result.plusMinus(arr);
        sc.close();
    }
}
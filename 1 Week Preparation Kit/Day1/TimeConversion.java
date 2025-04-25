import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Result {
    public static String timeConversion(String s) {
        DateTimeFormatter input = DateTimeFormatter.ofPattern("hh:mm:ssa");
        DateTimeFormatter output = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse(s, input);
        return time.format(output);
    }
}

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = Result.timeConversion(s);
        System.out.println(result);
        sc.close();
    }
}

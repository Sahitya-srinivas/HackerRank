import java.util.Scanner;

abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    public void setTitle(String s) {
        title = s;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook myBook = new MyBook();
        myBook.setTitle(title);
        System.out.println("The title is: " + myBook.getTitle());
        sc.close();
    }
}
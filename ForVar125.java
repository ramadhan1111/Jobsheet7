import java.util.Scanner;

public class ForVar125 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);

        for (int i = 1, j = 10; i < j; i++, j--) {
            System.out.printf("%03d -- %03d\n", i, j);
        }
    }
}
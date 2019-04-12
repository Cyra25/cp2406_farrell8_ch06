import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number you want to count by.");
        int number = input.nextInt();
        final int END = number*100;
        for (int i = number; i <= END; i += number) {
            System.out.println(i);
            if (i % (number*10) == 0) {
                System.out.println();
            }
        }
    }
}

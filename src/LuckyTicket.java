import java.io.Console;
import java.util.Scanner;

public class LuckyTicket {
    public static void check() {
        Scanner sc = new Scanner(System.in);
        String cont;
        System.out.println("Enter 6 digits of your ticket number");
        while (true) {
            cont = sc.nextLine();
            if (cont.equalsIgnoreCase("stop")) break;

            try {
                int ticket = Integer.parseInt(cont);
                System.out.println(luck(ticket));
                System.out.println("Enter another ticket or enter 'stop' to exit");
            } catch (NumberFormatException nfe) {
                System.out.println("Enter correct number");
            }
        }
    }

    private static int sum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    private static String luck(int ticket) {
        int quotient = ticket / 1000;
        int remainder = ticket % 1000;
        if (quotient > 999 || quotient < 100) return ("Wrong number of digits, enter 6 digits");
        else if (sum(quotient) == sum(remainder)) return ("Lucky");
        else return ("Not lucky");
    }
}

import java.util.Scanner;

public class Calculator {
    public static void count() {
        String cont;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stop to exit");

        while (true) {
            System.out.println();
            try {
                System.out.println("Enter first number");
                cont = sc.nextLine();
                if (cont.equalsIgnoreCase("stop")) break;
                int first = Integer.parseInt(cont);

                System.out.println("Enter second number");
                cont = sc.nextLine();
                if (cont.equalsIgnoreCase("stop")) break;
                int second = Integer.parseInt(cont);

                System.out.println("Enter operator");
                cont = sc.nextLine();
                if (cont.equals("stop")) break;


                switch (cont) {
                    default -> System.out.println("Invalid operator");
                    case "+" -> System.out.println(first + " + " + second + " = " + (first + second));
                    case "-" -> System.out.println(first + " - " + second + " = " + (first - second));
                    case "*" -> System.out.println(first + " * " + second + " = " + (first * second));
                    case "/" -> {
                        if (second == 0) {
                            System.out.println("Divide by 0");
                        } else {
                            System.out.println(first + " / " + second + " = " + (first / second));
                        }
                    }
                    case "%" -> {
                        if (second == 0) {
                            System.out.println("Divide by 0");
                        } else {
                            System.out.println(first + " % " + second + " = " + (first % second));
                        }
                    }
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Enter correct number");
            }
        }
        System.out.println("Calculation stopped");
    }
}
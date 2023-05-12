import java.util.Scanner;

public class Presents {
    public static void count() {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int orange = sc.nextInt();
        int apple = sc.nextInt();
        int pear = sc.nextInt();

        if (weight < orange && weight < apple && weight < pear) {
            System.out.println("Too heavy!");

        } else {
            int count = 0;
            for (int i = 0; i <= weight; i += orange) {
                for (int j = 0; j <= weight; j += apple) {
                    for (int k = 0; k <= weight; k += pear) {
                        int sum = i + j + k;

                        if (sum == weight) {
                            //System.out.println(i + " " + j + " " + k);
                            count++;
                        }
                    }
                }
            }
            System.out.println("Number of possible presents : " + count);
        }


    }
}

/*
На вход программы подаётся 4 числа: вес подарка, вес апельсина, вес яблока, вес груши.
Каждый подарок состоит из произвольного набора апельсинов, яблок и груш,
необходимо вывести количество способов составить подарок с заданными весом.
        Пример:
        Вход программы: 40 25 15 10
        Ответ: 3
        Пояснение:
        1 вариант - 1 апельсин весом 25 и 1 яблоко весом 15.
        2 вариант - 2 яблока весом 15 и 1 груша.
        3 вариант - 4 груши.
*/
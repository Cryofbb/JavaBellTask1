public class Counter {
    public static void count(int num, int extracted){
        for (int i = num; i > 0; i -= extracted) {
            System.out.println(i);
        }
    }
}

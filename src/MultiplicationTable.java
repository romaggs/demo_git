public class MultiplicationTable {
    public static void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.printf("%d x %d = %d%n", number, i, result);
        }
    }
}

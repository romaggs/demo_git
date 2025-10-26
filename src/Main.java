public class Main {
    public static void main(String[] args) {
        // Demonstrate primitive variables
        int wholeNumber = 42;
        double fractionalNumber = 3.14;
        boolean isLearningJava = true;
        char initial = 'J';
        System.out.println("Primitive examples:");
        System.out.printf("int: %d, double: %.2f, boolean: %b, char: %c%n", wholeNumber, fractionalNumber, isLearningJava, initial);

        // If/else example
        if (wholeNumber > 50) {
            System.out.println("The number is larger than 50.");
        } else if (wholeNumber == 42) {
            System.out.println("The number is exactly 42.");
        } else {
            System.out.println("The number is smaller than 50.");
        }

        // Switch example (Java 14+ syntax)
        int dayOfWeek = 3;
        String dayName = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Unknown";
        };
        System.out.println("Day name: " + dayName);

        // Loop examples
        System.out.println("Counting with a for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Counting with a while loop:");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();

        // Run calculator demo
        Calculator calculator = new Calculator();
        System.out.println("Calculator demo: 8 * 7 = " + calculator.calculate(8, 7, '*'));

        // Multiplication table demo
        System.out.println("Multiplication table for 5:");
        MultiplicationTable.printTable(5);

        // Array processor demo
        int[] numbers = {3, 5, 7, 9, 11};
        ArrayProcessor processor = new ArrayProcessor(numbers);
        System.out.println("Array sum: " + processor.sum());
        System.out.println("Array average: " + processor.average());
        System.out.println("Max value: " + processor.max());

        // Person class demo
        Person person = new Person("Ada", "Lovelace", 36);
        System.out.println(person.introduce());
        person.haveBirthday();
        System.out.println(person.introduce());
    }
}

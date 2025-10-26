public class Person {
    private final String firstName;
    private final String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First name must not be empty");
        }
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last name must not be empty");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age must be non-negative");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void haveBirthday() {
        age++;
    }

    public String introduce() {
        return String.format("Hello, my name is %s %s and I am %d years old.", firstName, lastName, age);
    }
}

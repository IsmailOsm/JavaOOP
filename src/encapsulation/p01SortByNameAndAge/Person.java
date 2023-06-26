package encapsulation.p01SortByNameAndAge;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old.", this.getFirstName(), this.lastName, this.getAge());
    }


    public String getFirstName() {
        return firstName;
    }


    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }
}

package Arrays.Person;

public class Person
{

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }
    public void displayPerson(){
        System.out.print("  Last name: "+ lastName);
        System.out.print(", First name: "+firstName);
        System.out.print(", Age: "+ age);
    }
    public String getLast(){
        return lastName;
    }
}

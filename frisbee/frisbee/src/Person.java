public class Person {
    private String firstname;
    private String lastname;

    public Person(String firstName, String lastName) {
        firstname = firstName;
        lastname = lastName;
    }

    public int throwDisc(int pow) {
        int power = Math.min(Math.max(pow, 1), 10);
        return power * 2;
    }

    public String toString() {
        return lastname + ", " + firstname;
    }

    
}

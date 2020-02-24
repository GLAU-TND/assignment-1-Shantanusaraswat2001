public class Person {
    String first;
    String last;
    String[] phone;
    String email;
    Person next;
    char priority;

    Person(String first, String last, String[] phone, String email) {
        this.first = first;
        this.last = last;
        this.phone = phone;
        this.email = email;
        priority = (char) first.charAt(0);
        next = null;

    }
}
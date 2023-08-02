package Creational.Builder;

//here p is an immutable person we create with builder pattern
public class main {
    public static void main(String[] args) {
        Person p = new Person.PersonBuilder()
                        .name("Shubham")
                        .age(22)
                        .address("New Delhi")
                        .phoneNo("1234567891")
                        .build();
        System.out.println("Done");
    }
}

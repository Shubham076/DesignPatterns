package Creational.Builder;

//here p is an immutable person we create with builder pattern
/*
Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.
 */
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

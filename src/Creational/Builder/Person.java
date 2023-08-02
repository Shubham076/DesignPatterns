package Creational.Builder;

public class Person {
    private String name;
    private int age;
    private String phoneNo;
    private String address;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.phoneNo = builder.phoneNo;
        this.address = builder.address;
    }

    static class PersonBuilder{
        private String name;
        private int age;
        private String phoneNo;
        private String address;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }
        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }
        public PersonBuilder phoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}

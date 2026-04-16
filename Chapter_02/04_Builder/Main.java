public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.PersonBuilder("John", "Doe")
                .age(30)
                .address("123 Main St")
                .phoneNumber("555-1234")
                .build();


        Person person2 = new Person.PersonBuilder("Jane", "Smith")
                .age(25)
                .phoneNumber("555-5678")
                .build();
    }
}

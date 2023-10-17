package ie.atu;

import java.util.Scanner;

public class Person {
    String firstName;
    String lastName;
    int age;

    // Default Constructor
    public Person() {
        this.firstName = " ";
        this.lastName = " ";
        this.age = 0;
    }

    // Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName + ", Age: " + age);
    }

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.println("Enter age: ");
        this.age = scanner.nextInt();
    }
}

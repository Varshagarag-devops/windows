import java.util.Scanner;

class Student {
    // Attributes
    String name;
    int age;
    String department;
    String srn;
    String phoneNumber;

    // Constructor
    Student(String name, int age, String department, String srn, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.srn = srn;
        this.phoneNumber = phoneNumber;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("SRN: " + srn);
        System.out.println("Phone Number: " + phoneNumber);
    }
}

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter SRN: ");
        String srn = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = sc.nextLine();

        // Creating Student object
        Student student1 = new Student(name, age, department, srn, phoneNumber);

        // Displaying the student details
        student1.displayDetails();

        sc.close();
    }
}

package javaLearnings;

public class Student {
    // Static variable
    static String schoolName = "Greenwood High";

    // Non-static variable
    String studentName;

    // Constructor
    Student(String name) {
        this.studentName = name;
    }

    // Method to display student info
    void displayInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("School Name: " + schoolName);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        // Changing static variable using class name
        Student.schoolName = "Sunrise Academy";

        s1.displayInfo();
        System.out.println("-----");
        s2.displayInfo();
        
//        SumOfArray a=new SumOfArray();
        System.out.println(SumOfArray.result);
    }
}


package classAndObject;

// Assign and print the roll number, phone number and address of two
// students having names "Sam" and "John" respectively by creating two objects of class 'Student'.

public class StudentExecution {
    public static void main(String[] args) {
        Student student1 = new Student("Sam", 1, "1234567890", "123 Main St");
        Student student2 = new Student("John", 2, "0987654321", "456 Elm St");

        System.out.println(student1);
        System.out.println(student2);
    }
}

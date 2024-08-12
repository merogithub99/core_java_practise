package classAndObject;

// Create a class named 'Student' with String variable 'name' and
// integer variable 'roll_no'. Assign the value of roll_no as '2'
// and that of name as "John" by creating an object of the class Student.

public class Student {
    String name;
    int roll_no;
    String phoneNumber;
    String address;

    public Student(String name, int roll_no, String phoneNumber, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

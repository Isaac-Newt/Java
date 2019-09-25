package student;

public class Student {
    // Declare data members
    String name;
    String address;
    String phoneNumber;
    int roll_no;

    // Constructor method
    Student(String name, String address, String phone, int roll) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phone;
        this.roll_no = roll;
    }

    // Override the Object-Class toString method
    public String toString() {
        // Print the student's informatoin
        String studentInfo;
        studentInfo = this.name + " lives at " + this.address +
        ", their phone number is " + this.phoneNumber +
        ", and their roll number is " + this.roll_no;

        System.out.println(studentInfo);
        return studentInfo;
    }
}

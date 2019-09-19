package student;

public class Main {

    public static void main(String[] args) {

        // Create an instance of Student that is me
        Student janeDoe;
        janeDoe = new Student(20, 946, "Jane Doe", "Computer Science");
        
        // Print the student's name and major and school
        String studentName = janeDoe.getName();
        String studentMajor = janeDoe.getMajor();
        String studentSchool = janeDoe.getSchool();
        
        System.out.println(
            studentName + " is a student at " + studentSchool +
            " and is majoring in " + studentMajor
        );
        
        // Create a new reference to isaacList
        Student ID_946;
        ID_946 = janeDoe;
        System.out.println(ID_946.getID());

    }

}

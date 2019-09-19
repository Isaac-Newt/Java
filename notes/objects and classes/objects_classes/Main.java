package objects_classes;

public class Main {

    public static void main(String[] args) {
        // Create an instance of "JavaClass"
        JavaClass newClassObject = new JavaClass(202, 25, "Shad", "Java");
        
        // Print course name
        String name = newClassObject.toString();
        System.out.println("The course name is " + name);
        
        // Reassign classroom
        
        // This is a bad way to do this, but will work for public attributes
        newClassObject.classroom = 204;
        
        // For example, the below will not work
        // newClassObject.enrollmentCap = 30;
        // Instead, use the setter
        newClassObject.setEnrollmentCap(30);
    }

}

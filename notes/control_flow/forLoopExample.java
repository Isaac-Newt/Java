package java_project_2;

public class forLoopExample {

    public static void main(String[] args) {

        // Nested loops example
        for (int i = 0; i < 5; ++i) {
            for (int j = 4; j >= i; --j) {
                System.out.printf("%-3s", "*");
            }
            System.out.println();
        }

    }

}
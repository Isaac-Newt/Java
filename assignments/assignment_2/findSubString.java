import java.util.Scanner;

class findSubString {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a string: ");
      String testString = sc.nextLine();

      System.out.print("Enter a substring to find: ");
      String subString = sc.nextLine();

      boolean found = testString.contains(subString);
      System.out.println(found);

      sc.close();
    
    }

}

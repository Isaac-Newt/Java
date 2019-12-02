package ex_4_arrays;

public class Test {

	public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] characterArray = {'H', 'e', 'l', 'l', 'o'};
        
        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(characterArray);
    }

    public static <T> void displayArray(T[] array) {
        for (T item: array) {
            System.out.print(item);
            System.out.print(" ");
        }
        
        System.out.println();
    }

}

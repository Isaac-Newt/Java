package abstract_classes;

public class Test {

    public static void main(String[] args) {
        Pdf myPDF = new Pdf("My OOP PDF");
        String output = myPDF.toString();
        System.out.println(output);
    }

}

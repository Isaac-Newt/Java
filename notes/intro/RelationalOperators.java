package java_project_2;

public class RelationalOperators {
	public static void main(String[] args) {
		int a, b, c;
		a = 9;
		b = 6;
		c = 8;
		
		boolean booleanOne = (a >= b) && (b <= c);
		boolean booleanTwo = (a != b) || (a != c);
		
		System.out.println("The values are: " + booleanOne + " and " + booleanTwo);
	}
}

package java_project_2;

public class PrePostFixExample {

	public static void main(String[] args) {
		int k = 0;
		int m = 3;
		m = m * k++;
		System.out.println("Postfix: k = " + k + ", m = " + m);
		
		int l = 0;
		int n = 3;
		n = n * ++l;
		System.out.println("Prefix: l = " + l + ", n = " + n);
	}

}

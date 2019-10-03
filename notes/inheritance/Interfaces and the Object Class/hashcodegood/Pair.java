package hashcodegood;

public class Pair {
	String first;
	String second;

	// define first and second as strings being the first & last names of person
	public Pair(String f, String s) {
		first = f;
		second = s;
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		Pair p = (Pair)ob;
		return p.first.equals(first) && p.second.equals(second);
	}
	
	public int hashCode() {
		// seed
		int result = 17;

		// this calls the default hash for the strings first & second
		int hashFirst = first.hashCode();
		int hashSecond = second.hashCode();

		// Build the hash for the object Person based on the first & last names
		result += 31 * result + hashFirst;
		//System.out.println("First="+result);
		result += 31 * result + hashSecond;
		//System.out.println("Second="+result);

		// Return the hash for Person
		return result;
		
	}

}

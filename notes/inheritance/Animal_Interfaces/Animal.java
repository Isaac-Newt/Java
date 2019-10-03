package AnimalInterface;

public abstract class Animal {
	//abstarct class must have one abstract method defined in it
	public abstract String Eat();
	
	//Abstract class can have data members and implemented methods in it
	private String ScinetificName; 
	public void setName(String n) {
		this.ScinetificName=n;
	}
    
	public String getName() {
		return this.ScinetificName;
	}
	
	//This is very special method and same will appear in an Interface
	String TestMethod() {
		return "Its an Abstarct class method";
	}
}

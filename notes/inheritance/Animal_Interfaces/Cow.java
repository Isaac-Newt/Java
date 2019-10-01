package AnimalInterface;

public class Cow extends Animal implements Mammals
{
	
	public Cow()
	{
		
	}
	public Cow(String n)
	{
		super.setName(n);
	}
	@Override
	public String givesBirth() 
	{
		
		return "Yes cow gives birth";
	}

	@Override
	public String Eat() 
	{
		
		return "I am a Herbivore";
	}
	
	@Override
	public String toString()
	{
		return "I am"+super.getName()+" and "+this.Eat()+" "+this.givesBirth();
	}
	
	//This how it is resolved this version is newer version and always available by overriding one defined in Abstract class or interface
	@Override
	public String TestMethod()
	{
		return "I am cow";
	}

}

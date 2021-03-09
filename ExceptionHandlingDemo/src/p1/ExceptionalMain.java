package p1;



class Animal 
{
	public void doAnimalThings()
	{
		System.out.println("inside do Animal things ....");
	}

}

public class ExceptionalMain {

	Animal a; 
	public void doStuff(Animal a)
	{
		
		
		try 
		{
			System.out.println("1");
			a.doAnimalThings(); // NullPointerException
			System.out.println("2");
		}
		catch (NullPointerException e) {
			System.out.println(" Catch Block "+e.getMessage());
		}
		
		
		
	}
	public static void main(String[] args) {
		
		ExceptionalMain obj = new ExceptionalMain();
		
		obj.doStuff(obj.a);
		
	}
	
}//end class

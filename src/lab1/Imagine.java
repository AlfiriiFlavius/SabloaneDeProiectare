package lab1;

public class Imagine extends Element{

	
	public String continut;
	
	public Imagine(){}
	public Imagine(String nume,String continut) 
	{
		super(nume);
		this.continut=continut;
		
	}
	
	public String toString() {
	       return continut;
	   }
	@Override
	void print() {
		System.out.println("Imagine " + numeElement + " " + continut);
		
	}
	
	
	
	
}

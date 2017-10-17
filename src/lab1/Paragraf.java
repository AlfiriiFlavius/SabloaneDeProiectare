package lab1;

public class Paragraf extends Element{
	
public String continut;
	
	public Paragraf(){}
	public Paragraf(String nume,String continut) 
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

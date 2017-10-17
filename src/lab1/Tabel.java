package lab1;

public class Tabel extends Element{
	
public String continut;
	
	public Tabel(){}
	public Tabel(String nume,String continut) 
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

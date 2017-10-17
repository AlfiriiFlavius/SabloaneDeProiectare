package lab1;

import java.io.IOException;

public abstract class Element {
	
	public String numeElement;
	
	public Element(){
		
	}
	public Element(String nume)
	{
		this.numeElement=nume;
	}
	
	abstract void print();
	
	public String toString() {
	       return numeElement;
	   }
	
	
	

}

package lab1;

import java.io.IOException;

public interface Element {
	
	
	/*
	
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
	   */
	
	public void addElement(Element e);
	public void removeElement(Element e);
	public int getElements();
	public void print();
	
	
	
	

}




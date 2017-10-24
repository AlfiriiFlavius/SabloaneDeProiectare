package lab1;

public class Imagine implements Element{

	
	public String continut;
	
	public Imagine(){}
	public Imagine(String continut) 
	{
		this.continut=continut;
		
	}
	
	public String toString() {
	       return continut;
	   }
	
	
	public void addElement(Element e) {
		// TODO Auto-generated method stub	
	}

	public void removeElement(Element e) {
		// TODO Auto-generated method stub	
	}

	public int getElements() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void print() {
		System.out.println("Imagine :"+this.continut);
	}
	
	
	
	
}




	
	



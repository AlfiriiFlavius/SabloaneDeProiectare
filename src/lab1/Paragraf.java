package lab1;

public class Paragraf implements Element{
	
public String continut;
	
	public Paragraf(){}
	public Paragraf(String continut) 
	{
		this.continut=continut;
		
	}
	
	public void print() {
		System.out.println("Paragraf: "+this.continut);	
	}
	
	public void addText(String text){
		this.continut=text;
	}
	
	public void show(){
		System.out.println("Paragraf");
	}

	public void addElement(Element e){}		
	public void removeElement(Element e) {}
	public int getElements() { return 0;}

}




	

	

	



package lab1;

public class Tabel extends AbstractElement{
	
public String numeTabel;
	
	public Tabel(){}
	public Tabel(String continut) 
	{
		this.numeTabel=continut;
	}
	
	public void print() {
		System.out.println("Paragraf: "+this.numeTabel);	
	}
	
	
	/*
	public void show(){
		System.out.print("Tabel");
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
	*/
	
	

}




	



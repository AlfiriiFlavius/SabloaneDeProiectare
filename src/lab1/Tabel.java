package lab1;

public class Tabel implements Element{
	
public String numeTabel;
	
	public Tabel(){}
	public Tabel(String continut) 
	{
		this.numeTabel=continut;
	}
	
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
	
	public void print() {
		System.out.println("Table :"+this.numeTabel);
	}

}




	



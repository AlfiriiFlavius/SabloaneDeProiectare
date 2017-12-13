package lab1;

public class DeleteCommand implements Command{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		Element book = DocumentManager.getInstance().getElement();
		//book.delete();
		
		DocumentManager.getInstance().setElement(book);
		
		
	}
	
	

}

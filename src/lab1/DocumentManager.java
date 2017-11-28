package lab1;

public class DocumentManager {
	
	 private static DocumentManager instance = null;
	 private Element doc;
	 
	 private DocumentManager() {}
	   
	   public static DocumentManager getInstance() 
	   {
	      if(instance == null)
	      {
	         instance = new DocumentManager();
	      }
	      return instance;
	   }
	   
	   
				
		public Element getDoc() 
		{
			return doc;
		}

		public void setDoc(Element doc) 
		{
			this.doc = doc;
		}
	   
	   
	   
}


public enum TransactioType {


	  debit("Withdraw"),
	  deposit("Credit");
	  
	  
	  private String span;
		
		
		
		TransactioType(String s)
		{
			
			span=s;			
			
		}
		
		
		public  String toString()
		{
			
			
			return span;
		}







}

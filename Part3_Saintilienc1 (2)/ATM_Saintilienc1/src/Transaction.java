import java.util.Date;


public class Transaction {

	private Date date;
	private double amount;
	private String description;
	private TransactioType type;
	
	
	public Transaction(double amount, String description, TransactioType t){
	    this.amount=amount;
	    this.description=description;
	    this.date= new Date();
	    type=t;
	 }
	
	public double getAmount(){
		return amount;
	}
	
	public String toString(){
		return ("Date "+date + "\n"+ "Amount " +amount +"\n"+"Description " + description+"\n"+"Type "+type);
	}
	
	
	
	
}
	
	

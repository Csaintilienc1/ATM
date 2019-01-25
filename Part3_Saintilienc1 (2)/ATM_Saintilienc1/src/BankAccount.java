import java.text.NumberFormat;
import java.util.ArrayList;

public class BankAccount {
	
	private double currentbalance;
	private int accountnumber;
	private String accountholder; 
	private String customeraddress;
	private ArrayList<Transaction> transactions;
	private double deposit;
	private double debit;
	private String Password;
	private String SecretQuestion; 
	private String Answer;
	
	
	public BankAccount(String accountname,String customeraddress, int accountnumber)
	{
		transactions=new ArrayList<Transaction>();
		currentbalance=0;
		this.accountholder=accountname;
		this.customeraddress=customeraddress;
		this.accountnumber=accountnumber;
		this.Password=Password;
		this.SecretQuestion=SecretQuestion;
		this.Answer=Answer;
	}
	public double getcurrentbalance(){
		return currentbalance;}
	
	public int accountnumber(){
		return accountnumber; 
	}
		public String customername(){
			return accountholder;
		}
		public String customeraddress(){
			return customeraddress();
		}
			public void deposit(double amount){
			     currentbalance+=amount; 
			     transactions.add(new Transaction(amount, "depositing . . . ." ,TransactioType.deposit));
			     
			}  
			
			
			public int getaccountnumber(){
				return accountnumber;
			}
			
			public String getPassword(){
				return Password;
			}
			
			public void setPassword(String Password){
				this.Password=Password;
			}
			 public String getSecretQuestion(){
				 return SecretQuestion;
			 }
			
			 public void setSecretQuestion(String SecretQuestion){
				 this.SecretQuestion=SecretQuestion;
			 }
			 
			 public String getAnswer(){
				 return Answer;
			 }
			 public void setAnswer(String Answer){
				 this.Answer=Answer;
			 }
			  
			 
			 
			 
			public double getTransactionTotal(){
				double total=0;
				for(Transaction t:transactions){
					total=total+ t.getAmount();
				} return total;
			}
			
		public void printSummary(){
			System.out.println("AccountHolder:" +accountholder+"\n" +"Balance:"+currentbalance+"\n"); 
		         for(Transaction t:transactions){
		        	 System.out.println("Here are your past purchases");
		        	 System.out.println(t.toString());
		         
		         }
		
		}
			
		
		public void reconcile(){
			if (currentbalance==getTransactionTotal()){
			  System.out.println("Transaction Sucessful");	
		}
	}	   
		public BankAccount(){
			accountholder="";
			accountnumber=0;
			customeraddress="";
			currentbalance=0;
			transactions=new ArrayList<Transaction>();
			
			
		}
		
		
		
			public void debit(double amount){
			    
				
			    if (amount>= currentbalance)
			    		System.out.println("You do not have enough");
			    else currentbalance-=amount;
			    
			    
			   
			}
			
			public void getdeposit(double amount){
				currentbalance=amount+currentbalance; 
			}
			
			public void getdebit(double amount){
				currentbalance=currentbalance-amount; 
			}
			
		public void print(){ 
			NumberFormat fmt= NumberFormat.getCurrencyInstance();
			System.out.println(accountnumber +" " +accountholder+
			customeraddress +" "+ fmt.format(currentbalance));
			
			
			}
		
		
				

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount mybankaccount= new BankAccount("John Smith","34 someplace Ave", 5654);   
				mybankaccount.deposit(5.00);
				mybankaccount.debit(1.50);
				mybankaccount.print();
				
				
	}

}

import java.util.ArrayList;

public class Bank {

	public ArrayList<BankAccount>bankaccounts;
	public String BankName;
	
	public Bank(){
	    bankaccounts = new ArrayList<BankAccount>();
	}
	          public void printinfo(){
	        	  for(BankAccount b:bankaccounts){
	        		  System.out.println("Name");
	        		  b.printSummary();
	        	  }
	          }
	          
	          public BankAccount getAccount(String a){
	        	BankAccount X=null;
	        	  
	        	  for (BankAccount b:bankaccounts){
	        		 if (b.customername().equals(a)){
	        			 return b;
	        	 }
                     
                }
	        	  return X;
	        	 
	  
}
	          public String getbankname(){
	        	  return BankName;
	          }
	          public void setbankname(String BankName){
	        	  this.BankName=BankName;
	          }
	          
	   
	          public void transfer(BankAccount a, BankAccount b , double amount){
                       a.getdebit(amount);
                       if (amount<=b.getcurrentbalance()){
                            b.getdeposit(amount);    
                       }

            }
	      
	       public void addToList(BankAccount a ){
		       bankaccounts.add(a);

	       }
	  
	public static void main (String[] args) {
	Bank myBank= new Bank();	
	BankAccount a=new BankAccount();
	a.deposit(500);
	myBank.addToList(a);
	BankAccount b = new BankAccount();
	b.deposit(500);
	myBank.addToList(b);
    myBank.transfer(a, b, 90);
    myBank.printinfo();
    
	
	
	}
}

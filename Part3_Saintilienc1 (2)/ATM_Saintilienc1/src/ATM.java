import java.util.*;

public class ATM {

 private static ArrayList <Bank> Banks;
 



 		public ATM(){
 			Banks=new ArrayList<Bank>();
 			}
 		
 				
 		 public Bank selectbank(String BN){ 
 			 Bank X=null;
 			  Bank fake= new Bank();

                  for(Bank B:Banks){
            	 if(B.getbankname().equals(BN)){
            		 return B;
            	 }
                  }		 
      return fake;
             
 		 
 		 }

    public void addBanks(Bank one, Bank two){
    Banks.add(one);
    Banks.add(two);
    }	 		
    public BankAccount selectAccount(String AccountHolder, String Password,String BankName){
 		 			
 		 	  Bank one =selectbank(BankName);
 		 	 BankAccount Claudel=one.getAccount(AccountHolder);
 		 	  
 		 	 if(Password.equals(Claudel.getPassword()))
 		 		 return Claudel;
 		 	 else{
 		 		System.out.println("It appears you have forgotten your password. Here is your secret Question "+ Claudel.getSecretQuestion());
 		 	      Scanner scan=new Scanner(System.in);        
 		 		  String Answer=scan.next();
 		 		  if(Answer==Claudel.getAnswer())
 		 			  return Claudel; 
 		 			  
 		 	 }
 		 	 
 		return null; 
 		
 		
 		 	        
 		 	  
 		 	    	 
 		 			
    }
    public void Menu(){
    	
    Scanner scan=new Scanner(System.in);
    String BankName=scan.next();
    String customername=scan.next();
    String Password=scan.next();
    BankAccount one=selectAccount(BankName,customername, Password);
    int input= scan.nextInt();
    System.out.println("Debit ");
    System.out.println("Deposit");
    System.out.println("Transfer");
     if(input==2){
    	 System.out.println("How much do you want to take out?");
    	 scan.nextDouble();
    	 one.debit(input);
     scan.nextDouble(); 
     }else {
    	 System.out.println("How much do you want to deposit?");
    	 scan.nextDouble();
    	one.deposit(input);
    	scan.nextDouble();
 }
     
     
}
    public void addToList(Bank a ){
	       Banks.add(a);

    }

public static void main(String[] args){
	
	Banks=new ArrayList<Bank>();
	
	ATM ATM=new ATM();
	Bank WellsFargo=new Bank(); 
	BankAccount one= new BankAccount();
	one.setSecretQuestion("What is your Birth Month?");
	one.setAnswer("November");
	one.setPassword("June");
	BankAccount two= new BankAccount();
	two.setPassword("Cake 231");
	two.setSecretQuestion("What is your cat's name?");
	two.setAnswer("Felix");
	BankAccount three=new BankAccount();
	three.setPassword("Rabbit06");
	three.setSecretQuestion("What is your favorite car?");
	three.setAnswer("BMW");
	
	ATM.addToList(WellsFargo);
	WellsFargo.addToList(one);
	WellsFargo.addToList(two);
	WellsFargo.addToList(three);

	
	Bank Chase= new Bank();
	BankAccount A=new BankAccount();
	A.setPassword("Ferrari");
	A.setSecretQuestion("What hometown did you grow up in?");
	A.setAnswer("Orange");
	BankAccount B=new BankAccount();
	B.setPassword("Dodge");
	B.setSecretQuestion("Who is your favorite superhero?");
	B.setAnswer("Superman");
	BankAccount C=new BankAccount();
	C.setPassword("Chevy");
	C.setSecretQuestion("What is your favorite meal");
	C.setAnswer("Spagetti");
	ATM.Menu();

ATM.addToList(Chase);
Chase.addToList(A);
Chase.addToList(B);
Chase.addToList(C);



}
    
}



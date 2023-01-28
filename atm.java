import java.util.Scanner;

public class ATM_MACHINE {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		 int balance = 500000, withdraw, deposit;  
		 while(true)
		 {
			 System.out.println("1. Withdraw \n2.Deposit\n3.Check Balance\n4.EXIT");
			 System.out.println("Choose the operation you want to perform:");
			 int choice = sc.nextInt();
			 if(choice==1)
			 {
				 System.out.print("Enter money to be withdrawn:");
				 withdraw = sc.nextInt();  
        	 if(balance >= withdraw)  
        	{  
        		balance = balance - withdraw;  
        		System.out.println("Please collect your money");  
            }  
        	else  
        	{ 
        		System.out.println("Insufficient Balance");  
           }  
         }
         else if(choice==2) 
         {
        	 System.out.print("Enter money to be deposited:");
        	 deposit = sc.nextInt();
        	 balance = balance + deposit;
        	 System.out.println("Your Money has been successfully depsited");
        	 System.out.println("");  
         }
         else if(choice==3)
         {
        	 System.out.println("TOTAL BALANCE:"+balance);
         }
         else
         {
        	 System.exit(0);
         }
	}
	}
}
      

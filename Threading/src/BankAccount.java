
public class BankAccount {
	private double balance=2000;
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public synchronized double deposit(double amt)
	{
		balance=+amt;
		notify();
		System.out.println("deposited"+balance);
		return balance;
	}
   public synchronized double withdraw(double amt)
   {
	   if(balance <amt)
	   {
		   System.out.println("insufficient");
		   try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   balance=balance-amt;
	   System.out.println("Amount withdrwan"+balance);
	   return balance;
   }
}

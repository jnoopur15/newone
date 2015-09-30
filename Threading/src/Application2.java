
public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final BankAccount bk1=new BankAccount(2000);
		Thread t1=new Thread(){
			public void run()
			{
				
				bk1.deposit(1000);
			}
		};
		t1.start();
		Thread t2=new Thread(){
			public void run()
			{bk1.withdraw(800);
				
				
			}
		};
		t2.start();
	}

}

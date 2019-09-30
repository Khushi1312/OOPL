import java.util.Scanner;
class Bank
{
	String name;
	int AccNo;
    String type;
	float balance;
	static int ror=13;
	Scanner sc=new Scanner(System.in);
	Bank()
	{
		name="Default";
		AccNo=0000;
		type="Default";
		balance=00;
	}
	Bank(String n,int ano,String t,float b)
	{
		name=n;
		AccNo=ano;
		type=t;
		balance=b;
	}
	void deposit()
	{
		int amt;
		System.out.println("Enter amount to deposit:");
		amt=sc.nextInt();
		balance+=amt;
		System.out.println("Balance: "+balance);
	}
	void withdraw()
	{
		int amt;
		System.out.println("Enter amount to withdraw:");
		amt=sc.nextInt();
		if(amt>balance)
			System.out.println("Not enough balance");
		else
			balance-=amt;		
		System.out.println("Balance: "+balance);
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Account number: "+AccNo);
		System.out.println("Type: "+type);
		System.out.println("Balance: "+balance);	
	}
	static void rateshow()
	{
			System.out.println("Rate: "+ror);
	}

}
class Q3
{
	 public static void main(String args[])
	 {
	 	Bank ob=new Bank();
	 	ob.display();
	 	ob.deposit();
	 	ob.withdraw();
	 	Bank.rateshow();
	 	Bank ob1=new Bank("ABCD",98765,"Savings Account",50000);
	 	ob1.display();
	 }
}
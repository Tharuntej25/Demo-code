public class Bank
{
    static int currentBalance = 500;
    public static void greetcustomer()  
    {
        System.out.println("Hello , Welcome");
    }
        public void deposit(int amount)
        {
        currentBalance = currentBalance + amount;
        System.out.println("Amount deposited succesfully");
        }
        public static void withdrawl(int amount)
       
        {
        currentBalance = currentBalance - amount;
         System.out.println("Amount withdrawl succesfully");
        }
        public int getCurrentBalance()
        {
         return currentBalance;
        }
    public static void main (String[] args)
    {
         Bank bank=new Bank();
        greetcustomer();
       System.out.println("current balance is : "+bank.getCurrentBalance());
        bank.deposit(500);
        System.out.println("current balance is : "+bank.getCurrentBalance());  
        withdrawl(200);      
    }

}
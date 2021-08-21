
package P4Q10;

public class Account {
    private int accountNo;
    private String accountHolderName;
    private double balance;
    static int accountCount;
    private static double annualInterestRate;
    
    public Account(int accountNo, String accountHolderName, double balance){
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        accountCount++;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public static void setAnnualInterestRate(double annualInterestRate){
        Account.annualInterestRate = annualInterestRate;
    }
    
    public static double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public void cashOut(double amount){
        balance -= amount;
    }
    
    public void cashIn(double amount){
        balance += amount;
    }
}

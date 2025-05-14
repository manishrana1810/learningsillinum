public class BankAccount {
    int AccountNumber,Balance;
    public BankAccount(int AccountNumber){
        this.AccountNumber=AccountNumber;
        this.Balance=0;

    }
    public BankAccount(int AccountNumber,int Balance){
        this.AccountNumber=AccountNumber;
        this.Balance=Balance;


    }
    public int Deposit(int amount){
        return this.Balance=this.Balance+amount;

    }
    public int Withdraw(int amount){
        return this.Balance=this.Balance-amount;
    }
}

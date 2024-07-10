public class BankAccount {
    private int accountNumber;
    private double Balance;

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setBalance(int Balance){
        this.Balance=Balance;
    }
    public double getBalance(){
        return Balance;
    }

    public void methodofBankAccount(){
        System.out.println("The account number is " + accountNumber + " and the remaining balance is " + Balance );
    }
}

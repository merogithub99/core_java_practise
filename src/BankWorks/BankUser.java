package BankWorks;

public class BankUser {
    String accountNumber;
    int balance;
    String accountHolderName;
    String pin;


    public BankUser() {
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }



    public BankUser(String accountNumber, int balance, String accountHolderName, String pin) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.pin = pin;
    }


    @Override
    public String toString() {
        return "BankUser{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}

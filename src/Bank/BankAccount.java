//Create a BankAccount class to represent the bank account.
//Include attributes such as accountNumber, balance, and transactionHistory (a list of transactions).
//Implement methods for deposit, withdrawal, and displaying the transaction history.
//Ensure encapsulation of account details.

//Implement methods for deposit and withdrawal in the **`BankAccount`** class.
//Update the account balance accordingly.
package Bank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private List<Transaction> transactionHistory;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.transactionHistory = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
       this.balance = balance;
    }
    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }
    public void setTransactionHistory(List<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public void deposit (double amount){
        if (amount > 0){
            balance += amount;
            Transaction depositTransaction = new Transaction(new Date(), "deposit", amount);
            transactionHistory.add(depositTransaction);
            System.out.println("Deposited: "+amount);
        } else{
            System.out.println("Please deposit a positive amount");
        }
    }

    public void withdrawal (double amount){
        if (amount > 0){
            if (balance>=amount){
                balance -= amount;
                Transaction withdrawTransaction = new Transaction(new Date(), "withdrawal", amount);
                transactionHistory.add(withdrawTransaction);
                System.out.println("Withdrawn: "+amount);
            } else{
                System.out.println("Please withdraw a positive amount");
            }

        } else{
            System.out.println("Please withdraw a positive amount");
        }
    }

    public void displayTransactionHistory(){
        System.out.println("Transaction History for Account " + accountNumber + ":");
        for (Transaction transaction : transactionHistory) {
            System.out.println(transaction);
        }

    }
}

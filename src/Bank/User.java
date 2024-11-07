//Create a User class to represent a banking system user.
//Include attributes such as username, password, and account (an instance of the BankAccount class).
//Implement encapsulation to protect sensitive user data.

//Implement a method to allow users to update their account details (username and password).
package Bank;

public class User {

    private String username;
    private String password;
    private BankAccount account;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public BankAccount getAccount() {
        return account;
    }
    public void setAccount(BankAccount account) {
        this.account = account;
    }
    public void displayAccountDetails(){
        if (this.username!=null && this.account.getAccountNumber()!=null){
            System.out.println("Account Details of "+ this.username);
            System.out.println("Account Number: " + this.account.getAccountNumber());
            System.out.println("Account Balance: " + this.account.getBalance());
        }
        for (Transaction transaction: this.account.getTransactionHistory()){
            System.out.println(transaction);
        }
    }

    public void updateUsername(String newUsername){
         this.username = newUsername;
    }

    public void updatePassword(String newPassword){
        this.password = newPassword;
    }
}

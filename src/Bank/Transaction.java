//Create a Transaction class to represent individual transactions.
//Include attributes like date, type (deposit or withdrawal), and amount.
//Implement encapsulation for transaction details.

package Bank;
import java.util.Date;

public class Transaction {

    private Date date;
    private String type;
    private double amount;

    public Transaction(Date date, String type, double amount) {
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        } else {
            System.out.println("Amount must be positive");
        }

    }



}

import Bank.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Joe", "Engineer", 50000);
        System.out.println(employee);
        employee.addPayment(new Payment(new Date(), 1500, "Card"));
        employee.displayPaymentHistory();
        System.out.println(employee.salaryCalculation(5.0));


    }
}
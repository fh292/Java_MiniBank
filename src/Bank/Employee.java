package Bank;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int employeeID;
    private String name;
    private String position;
    private double salary;
    private List<Payment> paymentHistory;
    private double overtime;
    private double bonus;

    public Employee(int employeeID, String name, String position, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.paymentHistory = new ArrayList<>();
        this.overtime = 1.5;
        this.bonus = 100;
    }
    public void addPayment(Payment payment) {
        this.paymentHistory.add(payment);
    }
    public List<Payment> getPaymentHistory() {
        return paymentHistory;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPaymentHistory(List<Payment> paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void displayPaymentHistory() {
        System.out.println("Payment History: ");
        for (Payment payment : paymentHistory) {
            System.out.println(payment);
        }
    }

    public double salaryCalculation(double overtimeHours){
        double overtimePay = salary * overtime * overtimeHours ;
        return salary + overtimePay + bonus;
    }

}

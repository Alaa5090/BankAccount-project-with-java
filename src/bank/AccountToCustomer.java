package bank;

import bank.Customer;

public class AccountToCustomer {
    
    private final int ID;
    private final Customer customer;
    private double balance;

    public AccountToCustomer(int ID, Customer customer, double balance) {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }

    public AccountToCustomer(int ID, Customer customer) {
        this.ID = ID;
        this.customer = customer;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountToCustomer{" + "ID=" + ID + ", customer=" + customer + ", balance=" + balance + '}';
    }
    
    public String getCustomerName(){
        return this.customer.getNAME();
    }
    
    public void deposit(double value) {
        if (this.balance >= value) 
            this.balance -= value;
        else System.out.println("Amount WithDrown Exceeds "
                                + "The Current Balance");
    }

    public void withdrow(double value) {
        this.balance += value;
    }
}

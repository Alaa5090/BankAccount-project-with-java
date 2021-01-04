package bank;

public class Account {
    
    private final String id,name;
    private int balance;
    
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    
    public void credit(int amount){
        balance += amount;
    }
    
    public int debit(int amount){
        if(balance>= amount){
            balance -= amount;
        }
        else 
            System.out.println("Amount Exceeded Balance");
        return balance;
    }
    
    public int transferTo(Account ac , int amount){
        if(balance > debit(amount))    
            ac.credit(amount);
        else
            System.out.println("Amount Exceeded Balance");
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name = " + name + ", balance=" + balance + '}';
    }
    
}

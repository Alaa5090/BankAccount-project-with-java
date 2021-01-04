package bank;

class BankAccount {

    private final String NAME;
    private static int count;
    private int NUMBER;
    private double balance;

    private BankAccount(String NAME) {
        this.NAME = NAME;
        this.NUMBER = count++;
    }
    
    private BankAccount(String NAME, double balance) {
        this(NAME);
        this.balance = balance;
    }
    
    public String getNAME() {
        return NAME;
    }

    public int getNUMBER() {
        return NUMBER;
    }

    public double getBalance() {
        return balance;
    }
    
    public static BankAccount createBankAccount(String NAME) {
        return new BankAccount(NAME);
    }

    public static BankAccount createBankAccount(String NAME, double balance) {
        return new BankAccount(NAME, balance);
    }

    public boolean deposit(double value) {
        if (this.balance >= value) {
            this.balance -= value;
            return true;
        }
        return false;
    }

    public void withdrow(double value) {
        this.balance += value;
    }

    public boolean transferTo(BankAccount account, double value) {
        if (this.deposit(value)) {
            account.withdrow(value);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "NAME=" + NAME + ", NUMBER=" + NUMBER + ", balance=" + balance + '}';
    }

}

public class Test {

    public static void main(String[] args) {

        BankAccount account1 = BankAccount.createBankAccount("moaz");
        BankAccount account2 = BankAccount.createBankAccount("Mohamed", 853);
        BankAccount account3 = BankAccount.createBankAccount("Alaa", 15000);

        System.out.println(account1+"\n"+account2+"\n"+account3);
        
        account1.withdrow(800);
        if(!account1.deposit(1000))
            System.out.println("Failed");
        account2.withdrow(1000);
        if(account2.deposit(500))
            System.out.println("Success");
        account3.withdrow(5000);
        System.out.println(account3.getBalance()+"\n"+account2.getBalance());
        if(account3.transferTo(account2, 500))
        {
            System.out.println("Success");
        }
        System.out.println(account3.getBalance()+"\n"+account2.getBalance());
        if(account1.transferTo(account3, 85585))
            System.out.println("Failed");    
    }
}

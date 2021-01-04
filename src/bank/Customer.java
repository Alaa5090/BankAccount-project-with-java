package bank;

public class Customer {
    
    private final int ID;
    private static int count;
    private final String NAME;
    private final char GENDER;

    public Customer(String NAME, char GENDER) {
        this.ID = count++;
        this.NAME = NAME;
        this.GENDER = GENDER;
    }

    public int getID() {
        return ID;
    }

    public String getNAME() {
        return NAME;
    }

    public char getGENDER() {
        return GENDER;
    }

    @Override
    public String toString() {
        return "Customer{" + "ID=" + ID + ", NAME=" + NAME + ", GENDER=" + GENDER + '}';
    }
    
}

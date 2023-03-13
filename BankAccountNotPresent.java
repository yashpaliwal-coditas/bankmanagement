package bank_management;

public class BankAccountNotPresent extends Exception{
    public BankAccountNotPresent() {
        System.out.println("Bank account not found in our record");
    }
}

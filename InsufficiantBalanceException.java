package bank_management;

public class InsufficiantBalanceException extends Exception{
    public InsufficiantBalanceException() {
        System.out.println("Insufficiant balance");
    }
}

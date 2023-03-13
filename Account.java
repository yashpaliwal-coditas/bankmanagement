package bank_management;

public class Account {
    String name, address, emailId , accountType,companyName;
    int phoneNumber,balance;
    long accountNumber;


    public Account(String name, String address, String emailId, String accountType, int phoneNumber, long accountNumber) {
        this.name = name;
        this.address = address;
        this.emailId = emailId;
        this.accountType = accountType;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.companyName = null;
    }

    public Account(String name, String address, String emailId, String accountType, String companyName, int phoneNumber, long accountNumber) {
        this.name = name;
        this.address = address;
        this.emailId = emailId;
        this.accountType = accountType;
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", emailId='" + emailId + '\'' +
                ", accountType='" + accountType + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }
}

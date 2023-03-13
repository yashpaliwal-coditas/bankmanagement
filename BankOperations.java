package bank_management;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BankOperations {
    Scanner sc = new Scanner(System.in);
    List<Account> list = new ArrayList<Account>();
    public void get(){
        System.out.println("press enter");
        sc.nextLine();
        System.out.println("Enter the name");
        String name= sc.nextLine();
        System.out.println("enter address");
        String address = sc.nextLine();
        System.out.println("enter email");
        String email = sc.nextLine();
        System.out.println("enter account type current / savings");
        String accountType = sc.nextLine();
        System.out.println("Enter phone number");
        int phoneNumber = sc.nextInt();
        Random random = new Random();
        long accountNumber = random.nextInt(999999999)+1000000000000l;
        if(!accountType.equals("current"))
        list.add(new Account(name,address,email,accountType,phoneNumber,accountNumber));
        else{
            System.out.println("enter company name");
            sc.nextLine();
            String companyName = sc.nextLine();
            list.add(new Account(name,address,email,accountType,companyName,phoneNumber,accountNumber));
        }
        System.out.println("Congratulation your account is activated , your account balance is "+accountNumber);
    }
    public void deposit(){
        System.out.println("Please enter your account number to deposit");
        long accountNumber = sc.nextLong();
        boolean exist = false;
        for(Account a:list){
            if(a.accountNumber == accountNumber){
                exist = true;
                System.out.println("enter the amount to be deposited");
                int amount = sc.nextInt();
                a.balance += amount;
                System.out.println("your updated balance is "+a.balance);
            }
        }
        if(!exist){
            try{
                throw new BankAccountNotPresent();
            }
            catch (BankAccountNotPresent b){
                System.out.println("Please enter correct account number");
            }
        }
    }
    public void withdraw(){
        System.out.println("Please enter your account number to withdraw");
        long accountNumber = sc.nextLong();
        boolean exist = false;
        for(Account a:list){
            if(a.accountNumber == accountNumber){
                exist = true;
                System.out.println("enter the withdraw amount ");
                int amount = sc.nextInt();
                if(a.balance>=amount) {
                    a.balance -= amount;
                    System.out.println("your updated balance is " + a.balance);
                }
                else{
                    try{
                        throw new InsufficiantBalanceException();
                    }catch (InsufficiantBalanceException i){
                        System.out.println("please enter less amount");
                    }
                }
            }
        }
        if(!exist){
            try{
                throw new BankAccountNotPresent();
            }
            catch (BankAccountNotPresent b){
                System.out.println("Please enter correct account number");
            }
        }
    }
    public void display(){
        for(Account a:list){
            System.out.println(a);
        }
    }
}

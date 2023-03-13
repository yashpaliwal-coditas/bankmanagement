package bank_management;

import studentmanagement.Manage;

import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args) {
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
        BankOperations manage = new BankOperations();
        while (flag){
            System.out.println("1: Create account\n2: Deposit money \n3: Withdraw money\n4: Display all accounts\n0: Exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1: manage.get();
                    break;
                case 2: manage.deposit();
                    break;
                case 3: manage.withdraw();
                    break;
                case 4: manage.display();
                    break;
                case 0: flag = false;
            }
        }
    }
}

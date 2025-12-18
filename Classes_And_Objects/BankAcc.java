// //Design a class BankAccount with the following specification :

// Attributes :

// accountNumber (string) : Represents the account number of the user's account
// balance (double) : Represents the balance of the account
// Constructor :

// Implement a parameterised constructor to have the accountNmber and balance initialised while creating the object.
// Methods :

// deposit (double amount) : It adds the amount to the balance of the user's account.
// withdraw (double amount) : It deduct the money (amount) from the balance. If the balance is insufficient then print "Insufficient funds!" and do not change the original amount.
// displayDetails() : It diplays th accuntNumber and balance of the account.

import java.util.*;
class BankAccount{
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        if(balance>0){
            this.balance=balance;
        }
        else{
            balance=0.00;
        }
    }//constructor
    public void deposit(double amount){
        if(amount>0){balance+=amount;}
        else{
            System.out.println("Enter a positive amount");
        }
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient Balance!");
        }
        else{
            balance-=amount;
        }
    }
    public void displayDetails(){
        System.out.println("Accout Number : " + this.accountNumber);
        System.out.printf("Balance : %.2f\n", this.balance);
    }
    
    }


public class BankAcc{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Account Number : ");
        String accountNumber=scanner.next();
        System.out.println("Enter Balance : ");
        double balance=scanner.nextDouble();
        System.out.println("Enter the amount to be deposited : ");
        double dep_amount=scanner.nextDouble();
        System.out.println("Enter the amoutnt to be withdrawn : ");
        double withd_amount=scanner.nextDouble();
        BankAccount bankacc=new BankAccount(accountNumber,balance);
        bankacc.deposit(dep_amount);
        bankacc.withdraw(withd_amount);
        bankacc.displayDetails();
        
        scanner.close();
    }

}


package BankWorks;

import java.io.File;
import java.nio.file.*;
import java.util.Scanner;

public class AmountFunction {
    Scanner scanner = new Scanner(System.in);

    public void withDrawAmount() {
        System.out.println("Enter your accountNumber:");
        String accountNumber = scanner.nextLine();


        for (int i = 0; i < InputIo.bankUsers.size(); i++) {
            if (accountNumber.equals(InputIo.bankUsers.get(i).accountNumber)) {
                scanner.nextLine();
                System.out.println("What is the amount you want to withdraw?");
                int withdrawBalance = scanner.nextInt();
                if (InputIo.bankUsers.get(i).balance >= withdrawBalance) {
                    InputIo.bankUsers.get(i).balance -= withdrawBalance;
                    String message = "successfully withdrawn the amount "+withdrawBalance;
                    String fileName="withdraw_messages_"+"account_"+accountNumber;
                    FileFolderCreator.createFileForMessage(fileName,message);
                } else {
                    System.out.println("Insufficient balance!!!!!!!! ");
                }

                System.out.println("your remaining balance is:" + InputIo.bankUsers.get(i).balance);
            }
            else {
                System.out.println("not valid account number");
                return;
            }
        }

    }

    public void transferBalance() {
        System.out.println("Enter your accountNumber");
        String myAccount = scanner.nextLine();
        System.out.println("What is the receiver account number");
        String receiverAccount = scanner.nextLine();
        scanner.nextLine();
        int receiveAccountIndex = 0;

        for (int i = 0; i < InputIo.bankUsers.size(); i++) {
            if (receiverAccount.equals(InputIo.bankUsers.get(i).accountNumber)) {
                receiveAccountIndex = i;
            }
        }
        if (!(receiverAccount.equals(InputIo.bankUsers.get(receiveAccountIndex).accountNumber))) {
            System.out.println("receiver account may not exist!");
            return;
        }
        for (int i = 0; i < InputIo.bankUsers.size(); i++) {
            if (myAccount.equals(InputIo.bankUsers.get(i).accountNumber)) {
                System.out.println("What is the amount you want to transfer?");
                int transferBalance = scanner.nextInt();
                if (InputIo.bankUsers.get(i).balance >= transferBalance) {
                    InputIo.bankUsers.get(i).balance -= transferBalance;
                    InputIo.bankUsers.get(receiveAccountIndex).balance += transferBalance;
                    System.out.println("fund transfer successfully");
                    String fileName="fundTransfer_messages_"+"account_"+myAccount;
                    String message = "successfully transferred " +transferBalance + " amount to account number"+ receiverAccount;
                    FileFolderCreator.createFileForMessage(fileName,message);
                } else {
                    System.out.println("Insufficient balance ");
                }
                System.out.println("your remaining balance is:" + InputIo.bankUsers.get(i).balance);
            }else{
                System.out.println(" sender account does not exist!!");
                return;
            }
        }
    }


    public void depositAmount() {
        System.out.println("Enter your accountNumber:");
        String accountNumber = scanner.nextLine();
        scanner.nextLine();

        for (int i = 0; i < InputIo.bankUsers.size(); i++) {
            if (accountNumber.equals(InputIo.bankUsers.get(i).accountNumber)) {
                System.out.println("What is the amount you want to deposit?");
                int depositBalance = scanner.nextInt();
                    InputIo.bankUsers.get(i).balance += depositBalance;
                System.out.println("deposit success!!!!");
                String fileName="deposit_messages_"+"account_"+accountNumber;
                String message= "successfully deposited amount "+ depositBalance +" to your account";
                FileFolderCreator.createFileForMessage(fileName,message);
                System.out.println("your new  balance is:" + InputIo.bankUsers.get(i).balance);
            }else{
                System.out.println("account does not exist");
                return;
            }
        }
    }

    public void displayInfo(){
        for (BankUser bankUser1 : InputIo.bankUsers) {
            System.out.print("Name: "+bankUser1.getAccountHolderName() + " ");
            System.out.print("CurrentBalance: "+ bankUser1.getBalance() + " ");
            System.out.print("Account Number: "+bankUser1.getAccountNumber() + " ");
            System.out.println(" ");
        }
    }

}

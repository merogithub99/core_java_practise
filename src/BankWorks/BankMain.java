package BankWorks;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankUser bankUser = new BankUser();
        AmountFunction amountFunction = new AmountFunction();
        System.out.println("Creating bank accounts..........");
        System.out.println("some account created successfully!");
        InputIo inputIo = new InputIo();
        List<BankUser> bankUserList = inputIo.createAccount(bankUser);
        FileFolderCreator.createFolder();

        boolean status = true;
        while (status) {
            System.out.println("1:Display bank information ");
            System.out.println("2: Deposit amount to your account ");
            System.out.println("3:WithDraw amount from your account");
            System.out.println("4:Transfer amount to another account");
            System.out.println("5:exit");
            System.out.println("Enter your choice ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    amountFunction.displayInfo();
                    break;
                case 2:
                    amountFunction.depositAmount();
                    break;
                case 3:
                    amountFunction.withDrawAmount();
                    break;
                case 4:
                    amountFunction.transferBalance();
                    break;
                case 5:
                    status = false;
                    break;
                default:
                    System.out.println("please enter the valid choice!!!");
            }
        }


    }
}

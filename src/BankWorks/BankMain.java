package BankWorks;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) throws IOException {
        BankUser bankUser = new BankUser();
        AmountFunction amountFunction = new AmountFunction();
        System.out.println("Creating bank accounts..........");
        System.out.println("some account created successfully!");
        InputIo inputIo = new InputIo();
        List<BankUser> bankUserList = inputIo.createAccount(bankUser);
        FileFolderCreator.createFolder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader (System.in));

        boolean status = true;
        while (status) {
            System.out.println("----------------------------------------");
            System.out.println("|           Menu of our Bank           |");

            System.out.println("----------------------------------------");
            System.out.println("|1:Display bank information            |");
            System.out.println("|2: Deposit amount to your account     |");
            System.out.println("|3:WithDraw amount from your account   |");
            System.out.println("|4:Transfer amount to another account  |");
            System.out.println("|5:exit                                |");
            System.out.println("|6:Register yourself (add)             |");

            System.out.println("|Enter your choice                     |");
            System.out.println(" ");
            System.out.println("|---------------------------------------|");
            int choice = Integer.parseInt(bufferedReader.readLine());
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
                case 6:
                    inputIo.addBankUser();
                    break;
                default:
                    System.out.println("please enter the valid choice!!!");
            }
        }


    }
}

package BankWorks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AmountFunction {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int pinEntryCount = 0;

    public void withDrawAmount() {
        while (pinEntryCount <= 3) {
            try {
                System.out.println("Enter your account number:");
                String accountNumber = bufferedReader.readLine();
                System.out.println("Enter your PIN number (Only three chances):");
                String pin = bufferedReader.readLine();

                boolean isValidUser = false;
                for (int i = 0; i < InputIo.bankUsers.size(); i++) {
                    if (accountNumber.equals(InputIo.bankUsers.get(i).accountNumber) && pin.equals(InputIo.bankUsers.get(i).pin)) {
                        isValidUser = true;
                        System.out.println("What is the amount you want to withdraw?");
                        int withdrawBalance = Integer.parseInt(bufferedReader.readLine());

                        if (InputIo.bankUsers.get(i).balance >= withdrawBalance) {
                            InputIo.bankUsers.get(i).balance -= withdrawBalance;
                            System.out.println("Success!");
                            String message = "Successfully withdrawn the amount " + withdrawBalance;
                            String fileName = "withdraw_messages_account_" + accountNumber;
                            FileFolderCreator.createFileForMessage(fileName, message);
                        } else {
                            System.out.println("Insufficient balance!");
                        }

                        System.out.println("Your remaining balance is: " + InputIo.bankUsers.get(i).balance);
                        return;
                    }
                }

                if (!isValidUser) {
                    pinEntryCount++;
                    if (pinEntryCount >= 3) {
                        System.out.println("You have entered the wrong PIN 3 times. Returning to the main menu.");
                        return;
                    } else {
                        System.out.println("Invalid account number or PIN. Please try again.");
                    }
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    public void transferBalance() {
        try {
            System.out.println("Enter your account number:");
            String myAccount = bufferedReader.readLine();
            System.out.println("Enter your PIN number:");
            String pin = bufferedReader.readLine();
            System.out.println("What is the receiver's account number:");
            String receiverAccountNumber = bufferedReader.readLine();

            int receiveAccountIndex = -1;

            for (int i = 0; i < InputIo.bankUsers.size(); i++) {
                if (receiverAccountNumber.equals(InputIo.bankUsers.get(i).accountNumber)) {
                    receiveAccountIndex = i;
                    break;
                }
            }

            if (receiveAccountIndex == -1) {
                System.out.println("Receiver account may not exist!");
                return;
            }

            for (int i = 0; i < InputIo.bankUsers.size(); i++) {
                if (myAccount.equals(InputIo.bankUsers.get(i).accountNumber) && pin.equals(InputIo.bankUsers.get(i).pin)) {
                    System.out.println("What is the amount you want to transfer?");
                    int transferBalance = Integer.parseInt(bufferedReader.readLine());

                    if (InputIo.bankUsers.get(i).balance >= transferBalance) {
                        InputIo.bankUsers.get(i).balance -= transferBalance;
                        InputIo.bankUsers.get(receiveAccountIndex).balance += transferBalance;
                        System.out.println("Fund transfer successful!");
                        String fileName = "fundTransfer_messages_account_" + myAccount;
                        String message = "Successfully transferred " + transferBalance + " amount to account number " + receiverAccountNumber;
                        FileFolderCreator.createFileForMessage(fileName, message);
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    System.out.println("Your remaining balance is: " + InputIo.bankUsers.get(i).balance);
                    return;
                }
            }
            System.out.println("Sender account does not exist!");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Invalid input. Please try again.");
        }
    }

    public void depositAmount() {
        try {
            System.out.println("Enter your account number:");
            String accountNumber = bufferedReader.readLine();

            for (int i = 0; i < InputIo.bankUsers.size(); i++) {
                if (accountNumber.equals(InputIo.bankUsers.get(i).accountNumber)) {
                    System.out.println("What is the amount you want to deposit?");
                    int depositBalance = Integer.parseInt(bufferedReader.readLine());
                    InputIo.bankUsers.get(i).balance += depositBalance;
                    System.out.println("Deposit successful!");
                    String fileName = "deposit_messages_account_" + accountNumber;
                    String message = "Successfully deposited amount " + depositBalance + " to your account";
                    FileFolderCreator.createFileForMessage(fileName, message);
                    System.out.println("Your new balance is: " + InputIo.bankUsers.get(i).balance);
                    return;
                }
            }
            System.out.println("Account does not exist!");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Invalid input. Please try again.");
        }
    }

    public void displayInfo() {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                    Details of all Users                                                         ");
        System.out.println("-----------------------------------------------------------------------------");
        for (BankUser bankUser1 : InputIo.bankUsers) {
            System.out.print("Name: " + bankUser1.getAccountHolderName() + " ");
            System.out.print("Current Balance: " + bankUser1.getBalance() + " ");
            System.out.print("Account Number: " + bankUser1.getAccountNumber() + " ");
            System.out.print("PIN: " + bankUser1.getPin() + " ");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------");
        }
        System.out.println("-----------------------------------------------------------------------------");

    }



}

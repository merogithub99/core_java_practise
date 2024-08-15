package BankWorks;

import fileWorks.Location;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputIo {

    static List<BankUser> bankUsers = new ArrayList<>();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String filePath = "C://Users/Rdhak/Desktop/_5thsem/bankUsers.csv";

    public List<BankUser> createAccount(BankUser bankUser) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                BankUser bankUser1 = new BankUser();
                bankUser1.setAccountNumber(data[0]);
                bankUser1.setBalance(Integer.parseInt(data[1]));
                bankUser1.setAccountHolderName(data[2]);
                bankUser1.setPin(data[3]);
                bankUsers.add(bankUser1);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return bankUsers;

    }


    public void addBankUser() {
        try {
            System.out.println("Enter your name:");
            String name = bufferedReader.readLine();
            System.out.println("Enter your account number of choice but not already existing:");
            String accountNumber = bufferedReader.readLine();
            for (BankUser bankUser : bankUsers) {
                if (bankUser.accountNumber.equals(accountNumber)) {
                    System.out.println("sorry that account number already exist! please choose another");
                    return;
                }

            }
            System.out.println("Enter your PIN number:");
            String pin = bufferedReader.readLine();
            System.out.println("Give some money if you want to deposit initially or (0):");
            int balance = Integer.parseInt(bufferedReader.readLine());
            String fullDetails = accountNumber + "," + balance + "," + name + "," + pin;


            BankUser bankUser2 = new BankUser();
            bankUser2.setPin(pin);
            bankUser2.setBalance(balance);
            bankUser2.setAccountNumber(accountNumber);
            bankUser2.setAccountHolderName(name);
            bankUsers.add(bankUser2);

            try (FileWriter fileWriter = new FileWriter(filePath, true)) {
                fileWriter.write(fullDetails + "\n");
                System.out.println("Bank user added successfully!");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

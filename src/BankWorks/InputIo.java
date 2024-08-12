package BankWorks;

import fileWorks.Location;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputIo {

    static List<BankUser> bankUsers = new ArrayList<>();

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
                bankUsers.add(bankUser1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return bankUsers;

    }
}

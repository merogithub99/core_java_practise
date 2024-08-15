package BankWorks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileFolderCreator {

    public static void createFolder() {
        Path dirPath = Paths.get("C://Users/Rdhak/Desktop/_5thsem/BankMessages");
        if (Files.notExists(dirPath)) {
            try {
                Files.createDirectories(dirPath);
            } catch (Exception exception) {
                System.out.println("something bad has happened");
            }

        } else {
            System.out.println("directory already there!");
        }
    }

    public static void createFileForMessage(String fileName, String message) {
        String path = "C:/Users/Rdhak/Desktop/_5thsem/BankMessages/" + fileName + ".txt";
        try {
            File file = new File(path);
            if (file.createNewFile()) {
                System.out.println("you received the message at " + path);
            } else {
                System.out.println("File already exists: " + path);
            }
            try (FileWriter fileWriter = new FileWriter(file, true)) {
                fileWriter.write(message + "\t" + System.lineSeparator());
                System.out.println("Message send to file system ");
            } catch (IOException e) {
                System.out.println(" error : " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

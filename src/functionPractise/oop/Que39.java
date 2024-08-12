import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Que39 {

    public static void copyFile(String sourceFile, String destinationFile) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(sourceFile));
            writer = new BufferedWriter(new FileWriter(destinationFile));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.err.println("An error occurred while copying the file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println("An error occurred while closing the file streams: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        String sourceFilePath = "src/functionPractise/oop/source.txt";
        String destinationFilePath = "src/functionPractise/oop/destination.txt";

        copyFile(sourceFilePath, destinationFilePath);
    }
}

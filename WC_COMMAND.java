import java.util.*;
import java.io.*;

public class WC_COMMAND{
    public static void main(String[] args) {
        File File1;
        File1 = new File("C:\\Users\\user\\OneDrive\\Documents\\iot.txt");
        int lineCount = 0;
        int charCount = 0;
        try {
            Scanner obj = new Scanner(File1);
            while (obj.hasNextLine()) {
                String data = obj.nextLine();
                String[] line = data.split("\\s+");
                int wordCount = line.length;
                //charCount += line.length;
                System.out.println("Number of words in line " + (lineCount + 1) + ": " + wordCount);
                lineCount++;
            }
            System.out.println("the number of line in the file: " + lineCount);
            //System.out.println("Total number of characters in the file: " + charCount);
            obj.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
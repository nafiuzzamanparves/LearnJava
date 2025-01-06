package tech.bisew.isdb.twentyFirstClass.classTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadPlainText {
    public static void main(String[] args) {

        File file = new File("scores.txt");
        try (Scanner scanner = new Scanner(file)) {


            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }
}

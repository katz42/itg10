package main.java.ezhidkova.week12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOStreams {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try (FileWriter fileWriter = new FileWriter("text.txt")){
            System.out.println("Введите строку в консоль:");
            String str = scanner.nextLine();
            fileWriter.write(str);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        String s = "";
        try (FileReader fileReader = new FileReader("text.txt")) {
            int inChar = fileReader.read();
            while (inChar != -1) {
                s += (char) inChar;
                inChar = fileReader.read();
            }
            System.out.println(s);
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}

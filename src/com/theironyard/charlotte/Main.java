package com.theironyard.charlotte;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)throws IOException {

        File f = new File("shirt.txt");
        FileWriter fw = new FileWriter(f);

        System.out.println("What brand of shirt do you want?");
        String brand = scanner.nextLine();
        fw.write(brand + "\n");
        System.out.println("Select [men] or [women]");
        String gender = scanner.nextLine();
        fw.append(gender + "\n");
        fw.close();

        scanner = new Scanner(f);
        scanner.useDelimiter("\\Z");
        String contents = scanner.next();
        System.out.println(contents);
    }
}

package com.theironyard.charlotte;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner inputScanner = new Scanner(System.in);
        File f = new File("shirt.txt");


        if (f.exists()) {
            Scanner fileScanner = new Scanner(f);
            Scanner input = fileScanner.useDelimiter("\\Z");
            System.out.println("Here's your current shirt");

            if (input.hasNext()) {
                System.out.println(input.next());
            }
        }

        System.out.println("would you like to change the list? [yes] or [no]");
        String answer = inputScanner.nextLine();
        if( answer.equals("yes")) {


            FileWriter fw = new FileWriter(f);

            System.out.println("What brand of shirt do you want?");
            String brand = inputScanner.nextLine();
            fw.write(brand + "\n");

            System.out.println("Select [men] or [women]");
            String gender = inputScanner.nextLine();
            fw.append(gender + "\n");

            System.out.println("Select size [small], [medium] or [large]");
            String size = inputScanner.nextLine();
            fw.append(size + "\n");

            System.out.println("Select shirt length [short] or [long]");
            String length = inputScanner.nextLine();
            fw.append(length + "\n");

            System.out.println("Select color [orange] [yellow] or [blue]");
            String color = inputScanner.nextLine();
            fw.append(color + "\n");

            fw.close();
        }
        if(answer.equals("no")){
            System.out.println("Okay. Let me know if you change your mind");
        }
    }
}

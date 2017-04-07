package com.theironyard.charlotte;
import java.util.HashMap;
/**
 * Created by Keith on 4/7/17.
 */
public class Shirt extends Properties {

    public Shirt(String brand, String gender, String size, String color, String sleeve ){

        System.out.println("What brand of shirt do you want?");
        brand = Main.input.nextLine();
        this.brand = brand;

        System.out.println("Is the shirt for a man or a woman?");
        gender = Main.input.nextLine();
        this.gender = gender;

        System.out.println("What shirt size do you want? Small, Medium or Large");
        size = Main.input.nextLine();
        this.size = size;

        System.out.println("What shirt color would you like?");
        color = Main.input.nextLine();
        this.color = color;

        System.out.println("Is the shirt [long sleeve] or [short sleeve]?");
        sleeve = Main.input.nextLine();
        this.sleeve = sleeve;

    }

}

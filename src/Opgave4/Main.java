package Opgave4;

import java.util.ArrayList;

public class Main {

    public static void main(String [] args){

        ArrayList<String> data = new ArrayList<>();
        data.add("Espresso, En kraftfuld og koncentreret kaffe, 25.0");
        data.add("Latte, Espresso med dampet mælk, 45.0");
        data.add("Cola, Kold og brusende, 30.0");
        data.add("Vand, Stille kildevand, gratis");

        double totalPrice = 0;

        for(String d : data){
        String [] drinks = d.split(",");
        String name = drinks [0].trim();
        String beskrivelse = drinks[1].trim();
        try {
            double price = Double.parseDouble(drinks[2].trim());
            totalPrice += price;
            System.out.println(name + " - " + beskrivelse + " (" + price + "kr) ");
        }catch (NumberFormatException e){
            System.out.println("Ugyldig pris ");
        }
        }
        System.out.println(totalPrice);



    }
}

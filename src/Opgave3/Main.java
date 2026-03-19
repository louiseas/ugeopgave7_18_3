package Opgave3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        try {
            ArrayList<String> lines = readLines("Data/Assignment.csv");
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }

        try{
            ArrayList<String> lines = readLines2("Data/findesIkke.csv");
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }


    }

    public static ArrayList<String> readLines(String path) throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<>();
        FileReader fileReader = new FileReader("Data/Assignment.csv");
        Scanner scanner = new Scanner(new File(path));
        while(scanner.hasNextLine()){
            lines.add(scanner.nextLine());
        }
        scanner.close();
        System.out.println(lines);
        return lines;
    }

    public static ArrayList readLines2(String path) throws FileNotFoundException {
        ArrayList lines = new ArrayList<>();

            Scanner scan = new Scanner(new File(path));
            while (scan.hasNextLine()) {
                lines.add(scan.nextLine());
            }
            scan.close();

        return lines;
    }

}

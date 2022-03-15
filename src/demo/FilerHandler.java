package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FilerHandler {
    public ArrayList<String> loadModules() {
        File data = new File("resources/imdb-data.csv");
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner scan = new Scanner(data);

                String line = scan.nextLine();
                String[] stringAsArray = line.split(";");
                for (int i=0; i < stringAsArray.length; i++) {
                   list.add(stringAsArray[i]);
                }

        } catch (FileNotFoundException e) {
            System.out.println("File has not been found.");
            e.printStackTrace();
        }
        return list;
    }


    public void writer(String listAsString) throws FileNotFoundException {
       PrintStream ps = new PrintStream(new FileOutputStream("resources/ddl.sql"));
       ps.print(listAsString);
    }
    public void writer2(String listAsString) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("resources/dml.sql"));
        ps.print(listAsString);
    }

    public ArrayList<String> loadMovies() {
        File data = new File("resources/imdb-data.csv");
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner scan = new Scanner(data);
            scan.nextLine();

            String line = scan.nextLine();
            String[] stringAsArray = line.split(";");
            for (int i=0; i < stringAsArray.length; i++) {
                list.add(stringAsArray[i]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File has not been found.");
            e.printStackTrace();
        }
        return list;
    }
}

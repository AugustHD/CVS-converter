package demo;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FilerHandler fh = new FilerHandler();
        ArrayList<String> list = fh.loadModules();
        String createTable = "CREATE TABLE imdb( \n";
        for (int i=0; i < list.size(); i++) {
            createTable += list.get(i);
            createTable += " VarChar(255), \n";
        }
        createTable += ");";

        fh.writer(createTable);


    }
}

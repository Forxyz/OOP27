package classwork20160711;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Text5 {
    public static void main(String[] args) throws IOException{
        FileReader reader = new FileReader("text.txt");
        Scanner sc = new Scanner(reader);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());

        }

    }
}

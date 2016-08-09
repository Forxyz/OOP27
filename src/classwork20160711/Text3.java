package classwork20160711;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Семейство on 12.07.2016.
 */
public class Text3 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("text.txt");


        char [] buff = new char[5];
        int count;


        StringBuilder builder = new StringBuilder();

        while((count = reader.read(buff)) != -1){
            builder.append(buff, 0,count);
        }
        String result = builder.toString();
        System.out.println(result);


    }
}

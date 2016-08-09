package classwork20160711;

import java.io.IOException;
import java.io.FileWriter;

public class Text {

    public static void main(String[] args) throws IOException{
        FileWriter wr = new FileWriter("text.txt", true);//если запись есть изза тру информация  не сотреться

        for (int i = 0; i < 100; i++) {
            wr.write("line" + i);


        }

        wr.flush();//записывает с памяти ОС
        wr.close();

    }
}

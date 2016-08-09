/*package classwork20160711;

import java.io.FileReader;
import java.io.IOException;


public class text2 {
    public static void main(String[] args) throws IOException{
        FileReader reader = new FileReader("text.txt");

        for (int i = 0; i < 100; i++) {
            int ch = reader.read();
            System.out.print((char)ch);

        }
    }
}*/
/*package classwork20160711;

        import java.io.FileReader;
        import java.io.IOException;


public class text2 {
    public static void main(String[] args) throws IOException{
        FileReader reader = new FileReader("text.txt");


        int ch;

        while ((ch = reader.read()) != -1){

            System.out.print((char) ch);
        }
    }
}*/
package classwork20160711;

        import java.io.FileReader;
        import java.io.IOException;


public class Text2 {
    public static void main(String[] args) throws IOException{

        FileReader reader = new FileReader("text.txt");


/*        char []buf = new  char[20];
        int cont;

        while ((cont = reader.read(buf)) != -1) {
            System.out.println(buf);
            String str = "";
            str = str + buf;
            System.out.println(str);
        }*/

        char []buf = new  char[5];
        int cont;
        String str = "";

        StringBuilder sb =  new StringBuilder();

        while ((cont = reader.read(buf)) != -1) {
            String part = new String(buf, 0, cont);
           // str += part;
            sb.append(part);
        }
        String result =    sb.toString();
        System.out.println(result);
    }
}
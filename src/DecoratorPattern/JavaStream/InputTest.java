package DecoratorPattern.JavaStream;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaaseInputStream(new BufferedInputStream(new FileInputStream("src/DecoratorPattern/JavaStream/test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.println((char) c);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

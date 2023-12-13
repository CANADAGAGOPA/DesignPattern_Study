package DP03_DecoratorPattern.IOStream.LowerCaseInput;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = null;

        try {
            in = new LowerCaseInputStream(new BufferedInputStream(
                    new FileInputStream("C:\\Users\\User\\Desktop\\디자인 패턴\\DesignPattern\\src\\DP03_DecoratorPattern\\IOStream\\text.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }
        System.out.println();
    }
}

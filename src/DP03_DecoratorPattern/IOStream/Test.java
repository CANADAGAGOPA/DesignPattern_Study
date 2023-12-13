package DP03_DecoratorPattern.IOStream;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        int c;

        try {
            LineNumberReader in = new LineNumberReader(new BufferedReader(
                    new FileReader("C:\\Users\\User\\Desktop\\디자인 패턴\\DesignPattern\\src\\DP03_DecoratorPattern\\IOStream\\text.txt")));

            String line;
            while ((line = in.readLine()) != null) {
                System.out.print(in.getLineNumber() + " : ");
                System.out.println(line);
            }
            System.out.println();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

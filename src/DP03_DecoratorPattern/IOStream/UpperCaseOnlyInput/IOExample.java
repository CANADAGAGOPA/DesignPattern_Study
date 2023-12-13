package DP03_DecoratorPattern.IOStream.UpperCaseOnlyInput;

import java.io.*;

public class IOExample {
    public static void main(String[] args) {
        int c;

        byte buffer[] = new byte[256];
        int bytes_read;

        InputStream in = null;

        try {
            in = new UpperCaseOnlyInputStream(
                    new BufferedInputStream(
                            new FileInputStream("C:\\Users\\User\\Desktop\\디자인 패턴\\DesignPattern\\src\\DP03_DecoratorPattern\\IOStream\\text.txt")));

            /* 한 byte 씩 출력
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
             */

            while ((bytes_read = in.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytes_read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}

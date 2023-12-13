package DP03_DecoratorPattern.IOStream.UpperCaseOnlyInput;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UpperCaseOnlyInputStream extends FilterInputStream {
    public UpperCaseOnlyInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c;

        while ((c = in.read()) != -1) { // End Of File
            if (Character.isUpperCase(c)) {
                break;
            }
        }

        return c;
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);

        if (result == -1) {
            return -1;
        }

        int j = offset;
        int count = 0;

        for (int  i = offset; i < offset+result; i++) {
            if (Character.isUpperCase(b[i])) {
                b[j] = b[i];
                j++;
                count++;
            }
        }

        return count;
    }
}

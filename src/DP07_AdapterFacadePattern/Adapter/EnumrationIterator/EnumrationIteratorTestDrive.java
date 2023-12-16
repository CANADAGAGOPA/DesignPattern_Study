package DP07_AdapterFacadePattern.Adapter.EnumrationIterator;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Objects;
import java.util.Vector;

public class EnumrationIteratorTestDrive {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();

        v.add("kim");
        v.add("lee");
        v.add("park");
        v.add("kwon");

        Iterator<Object> i = new EnumerationIterator(v.elements());
        while (i.hasNext()) {
            Object s = i.next();
            System.out.println(s);
        }
        System.out.println();

        /*
        Enumeration<String> e = v.elements();

        while (e.hasMoreElements()) {
            String s = e.nextElement();
            System.out.println(s);
        }
         */

        /*
        Iterator<String> i = v.iterator();

        while (i.hasNext()) {
            String s = i.next();
            System.out.println(s);
        }
        System.out.println();
         */
    }
}

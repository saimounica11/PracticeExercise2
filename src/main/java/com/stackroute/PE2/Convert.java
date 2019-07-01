package com.stackroute.PE2;
import java.io.*;
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) throws Exception {

        // pass the path to the file as a parameter
        FileReader fr =
                new FileReader("/home/nagumothu/PE2/src/main/java/com/stackroute/PE2/convert.txt");

        int i;
        int count=0;
        while ((i = fr.read()) != -1) {
            count++;
            System.out.print((Character.toUpperCase((char) i)));

        }
        System.out.println(count);
    }
}

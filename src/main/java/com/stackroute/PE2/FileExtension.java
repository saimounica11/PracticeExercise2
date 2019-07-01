package com.stackroute.PE2;
import java.io.File;
import java.io.FilenameFilter;

public class FileExtension {
    public static void main(String a[]) {
        File file = new File("/home/nagumothu/Documents/input");
        File[] files = file.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".md")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        for (File f : files) {
            System.out.println(f.getName());
        }
    }
}

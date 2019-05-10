package no1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Et {
    public static void write(OutputStream out, String s) {
        byte[] b = s.getBytes();
        try {
            out.write(b);
            out.flush();
            out.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("out.txt");
            write(file,getTriangleString());
            write(System.out, getTriangleString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String getTriangleString() {
        StringBuffer string = new StringBuffer();
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {
                string.append(" ");
            }
            for (int t = 1; t <= 2*(6-i)-1; t++) {
                string.append("*");
            }
            string.append("\n");
        }
        return string.toString();
    }
}

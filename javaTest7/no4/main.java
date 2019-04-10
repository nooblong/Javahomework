package no4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("enter String");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] c = s.toCharArray();
        System.out.println("old:" + s);
        System.out.print("to char: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
        System.out.println("first 3 char is");
        for (int i = 0; i < 3; i++) {
            System.out.print(c[i] + "");
        }
    }
}

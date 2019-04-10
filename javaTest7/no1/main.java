package no1;

public class main {
    public static void main(String[] args) {

        MyString myString = new MyString("www.google.com");
        System.out.println("myString is www.google.com");
        System.out.println("g has "+myString.showsum('g')+" times");
        System.out.println("o has "+myString.showsum('o')+" times");
        System.out.println("slide myString[4] to [9]");
        System.out.println(myString.find(4,9));

    }
}

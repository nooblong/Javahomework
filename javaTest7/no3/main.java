package no3;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        IDcard iDcard = new IDcard();
        String[] id = {"44170200000000000X","12170200000000000X"};
        for (String x:id) {
            System.out.println("id is " + x);
            if (iDcard.ifInGuangdong(x))
                System.out.println("In Guangdong");
            else
                System.out.println("Not in Guangdong");
        }
        iDcard.setS("AB-C-ABC");
        System.out.println("before split");
        iDcard.printS();
        iDcard.replace("A","First");
        System.out.println("change A to First");
        iDcard.printS();
        System.out.println("after split");
        iDcard.split("\\-");
        iDcard.printS();
        System.out.println("输入两个字符串比较");
        Scanner scanner = new Scanner(System.in);
        System.out.println("判断结果"+iDcard.compare(
                scanner.next(),scanner.next()));
    }
}

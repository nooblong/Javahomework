package No1;

import java.util.Scanner;

public class Student {
    public String id;
    public String name;
    public int chinese;
    public int math;
    public int english;
    public int average;

    Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("学号，名字，语文，数学，英语");
        id = sc.next();
        name = sc.next();
        chinese = sc.nextInt();
        math = sc.nextInt();
        english = sc.nextInt();
        average = (chinese+math+english)/3;
    }
    public int[] getScore(){
        int score[] = {chinese,math,english};
        return score;
    }

    public static int[] getAllAverage(Student[] students) {
        int sumChinese = 0;
        int sumMath = 0;
        int sumEnglish = 0;
        for (int i = 0; i < students.length; i++) {
            sumChinese += students[i].getScore()[0];
            sumMath += students[i].getScore()[1];
            sumEnglish += students[i].getScore()[2];
        }
        int allAverage[] = {sumChinese/3,sumMath/3,sumEnglish/3};
        return allAverage;
    }
}

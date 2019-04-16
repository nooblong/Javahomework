# 吉林大学珠海学院计算机学院 

## 软件工程系实验报告


### 实验课程：  Java面向对象程序设计
实验地点：        B401           
学    号：        04181009        
姓    名：       李胤龙        

2019/4/7

## 实验项目：⒈学习应用泛型编写程序
## 2.掌握使用枚举类型编写程序，学会运用for语句简化。

## 实验时间：2018/4/7

## 实验内容：

### for语句的简化，编写程序，满足以下条件：
    • 新建一个学生Student类，属性包括学号、姓名、3门课程成绩及平均分。
    • 生成一个学生数组，包括3名学生，从键盘中输入学生信息，计算学生平均分并最终输出每位学生的学号、姓名、平均分。
    • （尽量用for语句简化形式来做）
（键盘输入请参考实验二中的testInput.java文件）

## 源码：
```java
//main.java
package No1;
public class main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println("学号"+students[i].idr
            +",姓名"+students[i].name+",平均分"+students[i].average);
        }
        System.out.println("三名同学总平均分");
        int[] average = Student.getAllAverage(students);
        System.out.println("语文"+average[0]+" 数学"+average[1]
        +" 英语"+average[2]);

    }
}
//Student.java
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
```
## 运行结果

学号，名字，语文，数学，英语\
11 zhangsan 91 92 40\
学号，名字，语文，数学，英语\
12 lisi 35 100 97\
学号，名字，语文，数学，英语\
13 laowang 100 20 30\
学号11,姓名zhangsan,平均分74\
学号12,姓名lisi,平均分77\
学号13,姓名laowang,平均分50\
三名同学总平均分\
语文75 数学70 英语55

## p117No3

```java
//Day.java
package p177No3;
public enum Day{
     JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST,
    SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
     public String toString(){
         String a = "-" + super.toString() + "-";
         if (a.length()<11){
             int toAdd = 11 - a.length();
             for (int i = 0; i < toAdd; i++) {
                 a += "-";
             }
         }
         return a;
     }
}
//main.java
package p177No3;
//3.首先在程序中定义一个枚举类型，它含有7个枚举变量，分别表示一个星期每一天的名称。然后再控制台输出这些名称
public class main {
    public static void main(String[] args) {
        for (Day d:Day.values()) {
            System.out.println(d);
        }
    }
}
```
## 运行结果
-JANUARY---\
-FEBRUARY--\
-MARCH-----\
-APRIL-----\
-MAY-------\
-JUNE------\
-JULY------\
-AUGUST----\
-SEPTEMBER-\
-OCTOBER---\
-NOVEMBER--\
-DECEMBER--

## p177No4

```java
//main.java
package p177No4;
//请应用枚举类型编写程序，在控制台输出 2008年每一个月的天数。要求在输出中含有各个月份的英文名称
import p177No3.Day;
import java.util.Calendar;
public class main {
    public static void main(String[] args) {
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Day[] d = Day.values();
        for (int i = 0; i < days.length; i++) {
            System.out.println(d[i]+"有"+days[i]+"天");
        }
    }
}
```
## 运行结果
-JANUARY---有31天\
-FEBRUARY--有29天\
-MARCH-----有31天\
-APRIL-----有30天\
-MAY-------有31天\
-JUNE------有30天\
-JULY------有31天\
-AUGUST----有31天\
-SEPTEMBER-有30天\
-OCTOBER---有31天\
-NOVEMBER--有30天\
-DECEMBER--有31天


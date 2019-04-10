# 吉林大学珠海学院计算机学院 

## 软件工程系实验报告


### 实验课程：  Java面向对象程序设计
实验地点：        B401           
学    号：        04181009        
姓    名：       李胤龙        

2019/4/7

## 实验项目：实验六、数组、字符串（1）

## 实验时间：2018/4/7

## 实验目的：

1.	掌握字符串常量String类的操作方法
2.	学习编写处理字符串的程序
3.	掌握字符串StringBuffer类的用法。

## 实验内容：

### 1.1、	编写程序完成如下功能：输出字符串“www.google.com”的长度，并分别计算并显示出‘o’ 与‘g’的个数，截取其中“google”进行输出显示。

## 源码：
```java
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
package no1;

public class MyString {
    public String s;

    MyString(String s) {
        this.s = s;
    }

    public int showsum(char i) {
        int num = 0;
        int sum = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.indexOf(i, num) != -1) {
                num = s.indexOf(i, num) + 1;
                sum += 1;
            } else
                return sum;
        }
        return -1;
    }

    public String find(int i, int j) {
        char[] c = s.toCharArray();
        StringBuffer ns = new StringBuffer();
        for (int k = i; k <= j; k++) {
            ns.append(c[k]);
        }
        return new String(ns);
    }
}
```
## 运行结果:
myString is www.google.com\
g has 2 times\
o has 3 times\
slide myString[4] to [9]\
google

## 实验内容 
### 2、	编写程序，尝试用“==”与equals()方法比较“Hello java”与“Hello java”是否相等
源码:
```java
package no2;

public class main {
    public static void main(String[] args) {
        String a = "Hello java";
        String b = "Hello java";
        String c = "Hello java";
        String d = a;
        System.out.println("\"equals\" a & b " + a.equals(b));
        System.out.println("\"==\" a & b " + (a == b));
    }
}
```
## 运行结果:
"equals" a & b true\
"==" a & b true

## 实验内容
1. 编写一个应用程序，实现以下功能，请用自编方法或者是JDK中String类中的方法皆可。（请参考JDK帮助）：
2. 用一个方法判断一个身份证号码是否是广东省身份证（提示：判断前缀“44”）；
3. 实现以下功能：
4. 定义一个字符串为“AB-C-ABC”,请用“First”替换所有的A；再依据-将字符串进行分割成对应的子串；
5. 从键盘中输入两个字符串，比较两个字符串的大小，规则是按照字典序；
6. 将字符串转成对应的字符数组；将该字符数组的前3个元素创建成一个新字符串并输出；

## 源码
```java
package no3;

public class IDcard {
    private String s;

    boolean ifInGuangdong(String s) {
        return s.startsWith("44");
    }

    void setS(String s) {
        this.s = s;
    }

    String replace(String olds, String news) {
        s = s.replace(olds, news);
        return s;
    }

    String split(String toSplit) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String i : s.split(toSplit)) {
            stringBuffer.append(i + " ");
        }
        s = stringBuffer.toString();
        return s;
    }

    void printS() {
        System.out.println(s);
    }
    int compare(String sysin1, String sysin2){
        return sysin1.compareTo(sysin2);
    }
}
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
```

## 运行结果
id is 44170200000000000X\
In Guangdong\
id is 12170200000000000X\
Not in Guangdong\
before split\
AB-C-ABC\
change A to First\
FirstB-C-FirstBC\
after split\
FirstB C FirstBC

## 实验总结

String的split()方法用到了正则表达式；

String类重写了equal()方法
对比的是字符串内的内容是否相等

对于==，如果作用于基本数据类型的变量，则直接比较其存储的 “值”是否相等；

　　　　如果作用于引用类型的变量，则比较的是所指向的对象的地址
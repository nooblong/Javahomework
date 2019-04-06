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

1.	掌握数组的概念与用法
2.	掌握异常处理的用法。
3.	学习编写程序处理异常。

## 实验内容：

### 1.编写应用程序Sort.java，按升序顺序输出一维数组中的元素。

## 源码：
```java
import java.util.Random;

public class Sort {
    //打印
    static void printArray(int[] array) {
        System.out.println("Array is");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //主函数
    public static void main() {
        int[] array = new int[10];
        //生成
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(500);
        }
        printArray(array);
        sort(array);
        System.out.println("\nAfter:");
        printArray(array);
    }

    //排序
    public static int[] sort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp;
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
        return array;
    }

}
```
## 运行结果:
Array is

177 216 63 112 180 1 366 65 59 301 

After:

Array is

1 59 63 65 112 177 180 216 301 366 

### 2.教材第四章课后习题第５或６题，必须完成一题；可两题都做
### （尽量不要用结构化程序设计的思想即在主方法中完成功能）

## 源码
---
第五题
```java
import java.lang.Math;

public class No5 {
    static int[] times = new int[21];
    public static void main() {
        int tmp = 0;
        for (int i = 0; i < 10000; i++) {
                tmp = (int)(Math.random() * 20 + 0.5);
                if(tmp <= 20 && tmp >= 0){
                    add(tmp);
                }
        }
        //输出
        int cal = 0;
        for(int i:times){
            cal ++;
            System.out.println(cal + "的个数为" + i);
        }
    }
    private static void add(int a){
        times[a] += 1;
    }
}
```
---
第六题
```java
import java.lang.Math;
public class No6 {
    //主函数
    public static void main(){
        char[] array = new char[10];
        System.out.println();
        ABC(array);//初始化array为随机字母
        printArray(array);
        int[] tmp = new int[10];

        //将char[]转成int[]用Sort内方法排序
        for (int i = 0; i < 10; i++) {
            tmp[i] = array[i];
        }
        Sort.sort(tmp);
        //转换回char[]
        for (int i = 0; i < 10; i++) {
            array[i] = (char)tmp[i];
        }
        //输出
        printArray(array);
    }

    //初始化array
    public static void ABC(char[] array){
        System.out.println("生成随机字母");
        for(int i = 0; i < 10; i++){
            array[i] = ((char)(Math.random()*26+'a'));
        }
    }
    //打印array
    public static void printArray(char[] a){
        for (char word:a) {
            System.out.print(word + " ");
        }
        System.out.println("排序后");
        System.out.println();
    }

}
```
## 运行结果

1的个数为237

2的个数为498

3的个数为491

4的个数为487

5的个数为493

6的个数为518

7的个数为503

8的个数为497

9的个数为481

10的个数为513

11的个数为464

12的个数为523

13的个数为503

14的个数为493

15的个数为509

16的个数为524

17的个数为493

18的个数为532

19的个数为480

20的个数为528

生成随机字母

n h l c h c t m i t 排序后

c c h h i l m n t t 

## 选做 3.	教材第四章课后习题４题
提示：能不能将其做成一个万年历，如何封装比较好？

计算某年某月的第一天请参考java.util.Calendar类或者自己计算。

## 源码
```java
import java.util.Calendar;
import java.util.Scanner;

public class No4 {
    public static void main() {
        int year = 2020;
        int month = 1;
        System.out.println("输入年份");
        year = javain();
        System.out.println("输入月份");
        month = javain();
        System.out.println(year + "年" + " \t" + month + "月");
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        int dayMax = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);//获得当月天数
        int dayStart = getWhichStart(calendar);
        System.out.println("从星期几开始---" + dayStart);
        System.out.println("这个月几天---" + dayMax);
        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");
        print(dayStart, dayMax);//打印
    }

    private static int getWhichStart(Calendar calendar) {
        //一个月从哪天开始
        //0是星期天，1是星期一
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        return week - 1;
    }

    private static void print(int dayStart, int dayMax) {
        int space = 0;
        if (dayStart != 0) {
            //输出空格
            for (int i = 0; i < dayStart; i++) {
                space += 1;
                System.out.print(" \t\t");
            }
        }
        for (int i = 1; i <= dayMax; i++) {
            //输出数字
            System.out.print(i + " \t\t");
            space += 1;
            if (space % 7 == 0)//换行
                System.out.println();
        }
    }

    private static int javain() {
        //获取输入
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

```

## 运行结果

![](http://ww1.sinaimg.cn/large/ea095645ly1g1t4p7a0pzj20nd08g3yt.jpg)
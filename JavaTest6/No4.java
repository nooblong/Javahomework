import java.util.Calendar;
import java.util.Scanner;

public class No4 {
    public static void main() {
        int year;
        int month;
        Calendar calendar = Calendar.getInstance();
        calTheSame(calendar);
        System.out.println("输入年份");
        year = javain();
        System.out.println("输入月份");
        month = javain();
        calendar.set(year, month - 1, 1);
        System.out.println(year + "年" + " \t" + month + "月");
        int dayMax = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);//获得当月天数
        int dayStart = getWhichStart(calendar);
        System.out.println("从星期几开始---" + dayStart);
        System.out.println("这个月几天---" + dayMax);
        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");

        print(dayStart, dayMax, calendar);//打印
    }

    private static int getWhichStart(Calendar calendar) {
        //一个月从哪天开始
        //0是星期天，1是星期一
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        return week - 1;
    }

    private static void print(int dayStart, int dayMax, Calendar calendar) {
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

    private static void calTheSame(Calendar calendar) {
        //2008年日期的个位数与相应的星期刚好相同的总天数
        //2008年9月1日恰好是星期一
        //所以根据题意，7为星期日
        calendar.set(Calendar.YEAR,2008);
        int sum = 0;
        System.out.println("2008年各位数与相应星期相等的天数如下");
        for (int i = 0; i < 12; i++) {//i为月分
            calendar.set(Calendar.MONTH, i);
            System.out.println("月份" + (i+1));
            int dayMax = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            //0是星期天，1是星期一
            for (int j = 1; j < dayMax; j++) {
                calendar.set(Calendar.DATE,j);
                if(j>=10)
                    if(j%10 == calendar.get(Calendar.DAY_OF_WEEK)-1)
                        sum++;
                else
                    if(j == calendar.get(Calendar.DAY_OF_WEEK)-1)
                        sum++;
            }
            System.out.println("总共有"+sum+"天");
        }
        System.out.println("故总共有" + sum + "天");
    }
}
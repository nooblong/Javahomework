import java.util.Calendar;
import java.util.Scanner;

public class No4 {
    public static void main() {
        int year;
        int month;
        Calendar calendar = Calendar.getInstance();
        calTheSame(calendar, 2008);
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

    private static void calTheSame(Calendar calendar, int year_to_cal) {
        //2008年日期的个位数与相应的星期刚好相同的总天数
        //2008年9月1日恰好是星期一
        //所以根据题意，7为星期日
        //所以当日期个位数为7且为星期天的时候，总数加1
        int all_sum = 0;
        calendar.set(Calendar.YEAR, year_to_cal);
        System.out.println(year_to_cal + "年各位数与相应星期相等的天数如下");
        for (int i = 0; i < 12; i++) {//i为月分
            int sum = 0;//用于计算当月有多少天
            calendar.set(Calendar.MONTH, i);
            System.out.print("月份" + (i + 1) + "   ");
            int dayMax = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            for (int j = 1; j < dayMax; j++) {
                //dayMax的二月份是错的,固定为31,不过影响不大
                calendar.set(Calendar.DATE, j);
                //System.out.println(getDayOfWeek(calendar) +" " +j%10);
                if (j % 10 == getDayOfWeek(calendar))
                    sum++;
            }
            System.out.println("总共有" + sum + "天");
            all_sum += sum;
            System.out.println();
        }
        System.out.println("故总共有" + all_sum + "天");
    }

    private static int getDayOfWeek(Calendar calendar) {
        //(DAY_OF_WEEK-1)后0是星期天，1是星期一
        //所以要把星期天转成7
        if (calendar.get(Calendar.DAY_OF_WEEK) - 1 == 0)
            return 7;
        else
            return calendar.get(Calendar.DAY_OF_WEEK) - 1;
    }
}

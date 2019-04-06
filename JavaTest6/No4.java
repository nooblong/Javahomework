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

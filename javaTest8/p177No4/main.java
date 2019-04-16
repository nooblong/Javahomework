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

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

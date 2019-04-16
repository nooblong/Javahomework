package p177No3;
//3.首先在程序中定义一个枚举类型，它含有7个枚举变量，分别表示一个星期每一天的名称。然后再控制台输出这些名称
public class main {
    public static void main(String[] args) {
        for (Day d:Day.values()) {
            System.out.println(d);
        }
    }
}

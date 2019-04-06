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

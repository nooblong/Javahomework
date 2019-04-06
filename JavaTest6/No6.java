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

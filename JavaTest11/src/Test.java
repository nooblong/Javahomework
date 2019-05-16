import java.io.*;

public class Test {
    public static void main(String[] args) {
        int stuNum = 3;
        Student[] studentsInfo = new Student[stuNum];
        MyScanner s = new MyScanner(studentsInfo);
        s.scan();
        File file = new File("chengji.txt");
        WriteAndRead write = new WriteAndRead();
        write.write(s.getStringStudentsInfo(), file);
        write.read();
    }
}

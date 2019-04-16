package No1;
public class main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println("学号"+students[i].id
            +",姓名"+students[i].name+",平均分"+students[i].average);
        }
        System.out.println("三名同学总平均分");
        int[] average = Student.getAllAverage(students);
        System.out.println("语文"+average[0]+" 数学"+average[1]
        +" 英语"+average[2]);

    }
}
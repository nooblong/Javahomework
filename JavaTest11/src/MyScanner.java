public class MyScanner {
    private Student[] studentsInfo;
    public MyScanner(Student[] studentsInfo){
        this.studentsInfo = studentsInfo;
        for (int i = 0; i < studentsInfo.length; i++) {
            studentsInfo[i] = new Student();
        }
    }
    public void scan() {
        for (int i = 0; i < 3; i++){
            try {
                    Student student = studentsInfo[i];
                    System.out.println("输入姓名 年龄 java分数 c分数");
                    java.util.Scanner scanner = new java.util.Scanner(System.in);
                    student.name = scanner.next();
                    student.age = scanner.nextInt();
                    student.cScore = scanner.nextInt();
                    student.javaScore = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("输入错误重新输入");
                i-=1;
            }
        }
    }
    public String getStringStudentsInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Student s : studentsInfo) {
            stringBuilder.append(s.name + " " + s.age + " " +
                    s.cScore + " " + s.javaScore + "\n");
        }
        return stringBuilder.toString();
    }
}
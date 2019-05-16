import java.io.*;

public class WriteAndRead {
    File file;
    OutputStream out;
    InputStream in;

    public void write(String s, File file) {
        try {
            out = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("没有该文件");
            e.printStackTrace();
        }
        try {
            out.write(s.getBytes());
            System.out.println("写入成功");
        } catch (IOException e) {
            System.out.println("写入失败");
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//    public String read() {
//        StringBuffer stringBuffer = new StringBuffer();
//        int n = 0;
//        try {
//            in = new FileInputStream(file);
//        } catch (FileNotFoundException e) {
//            System.out.println("没有该文件");
//            e.printStackTrace();
//        }
//        while (n != -1){
//            try {
//                n = in.read();
//                stringBuffer.append((char))
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}

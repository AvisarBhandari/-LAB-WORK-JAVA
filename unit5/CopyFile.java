import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream("D:\\3th sem\\OOP java\\java Program\\unit5\\input.txt");
            out = new FileOutputStream("D:\\3th sem\\OOP java\\java Program\\unit5\\output.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null)
                in.close();
            if (out != null)
                out.close();
        }
    }
}

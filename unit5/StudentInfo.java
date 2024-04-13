import java.io.*;

public class StudentInfo {
    public static void main(String[] args) {
        try {
            File f = new File("D:\\3th sem\\OOP java\\java Program\\unit5\\Student.txt");
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);

            int i, n, rollno;
            String name, address, cname;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("No of students: ");
            n = Integer.parseInt(br.readLine());
            for (i = 0; i < n; i++) {
                System.out.println("\nRollno: ");
                rollno = Integer.parseInt(br.readLine());
                System.out.println("Name: ");
                name = br.readLine();
                System.out.println("Address:");
                address = br.readLine();
                System.out.println("College Name: ");
                cname = br.readLine();
                dos.writeInt(rollno);
                dos.writeUTF(name);
                dos.writeUTF(address);
                dos.writeUTF(cname);
            }

            dos.close();

            System.out.println("\nRollno\tName\tAddress\tCollage Name");
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            for (i = 0; i < n; i++) {
                rollno = dis.readInt();
                name = dis.readUTF();
                address = dis.readUTF();
                cname = dis.readUTF();
                if (address.equalsIgnoreCase("Chitwan"))
                    System.out.println(rollno + "\t" + name + "\t" + address + "\t" + cname);
            }
            dis.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

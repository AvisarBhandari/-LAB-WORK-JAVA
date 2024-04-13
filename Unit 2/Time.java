import java.util.Scanner;

public class Time {

    int hh, mm, ss;

    Time(int h, int m, int s) {
        hh = h;
        mm = m;
        ss = s;
    }

    Time addTime(Time t2) {
        this.ss = ss + t2.ss;
        this.mm = mm + t2.mm;
        this.hh = hh + t2.hh;
        if (this.ss >= 60) {
            this.mm += (this.ss / 60);
            this.ss = this.ss % 60;
        }
        if (this.mm >= 60) {
            this.hh += (this.mm / 60);
            this.mm = this.mm % 60;
        }
        return this;
    }

    Time subtracTime(Time t2) {
        if (t2.ss > ss) {
            --mm;
            ss += 60;
        }
        this.ss = ss - t2.ss;
        if (t2.mm > mm) {
            --hh;
            mm += 60;
        }
        this.mm = mm - t2.mm;
        this.hh = hh - t2.hh;
        return this;
    }

    void display() {
        System.out.println("HH:SS:MM = " + hh + ":" + mm + ":" + ss);

    }

    public static void main(String[] args) {
        Time t1 = new Time(5, 10, 15);
        Time t2 = new Time(4, 35, 55);
        Time t3, t4;
        System.out.println("Two time Are");
        t1.display();
        t2.display();
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Press 1 for sum and 2 for Different");
        choice = sc.nextInt();
        if (choice == 1) {
            t3 = t1.addTime(t2);
            System.out.println("\n Sum is: ");
            t3.display();
            if (choice == 2) {
                t4 = t1.subtracTime(t2);
                System.out.println("\n Different is: ");
                t4.display();
            }
            sc.close();
        }
    }
}
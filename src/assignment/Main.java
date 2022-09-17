package assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        PhanSo f1 = new PhanSo();
        int ts = sc.nextInt();
        f1.setTuSo(ts);
        f1.setMauSo(sc.nextInt());
        f1.inPhanSo();

        PhanSo f2 = new PhanSo();
        f2.setTuSo(sc.nextInt());
        f2.setMauSo(sc.nextInt());
        f2.inPhanSo();

        PhanSo t = f1.add(f2);
        t.rutGon();
        t.inPhanSo();
        }
    }



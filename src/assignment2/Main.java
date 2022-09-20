package assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(1,"Chổ Ngọc Toàn",100000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số Tiền Muốn Rút: ");
        int x = sc.nextInt();
        if (myAccount.debit(x)){
            System.out.println("Rút Thành Công"+x);
        }else {
            System.out.println("Số Dư Tài Khoản Không Đủ");
        }
        Account nam = new Account(2,"Cao Hoàng Nam", 10000);
        System.out.println("Nhập Số Tiền Cần Chuyển");
        int y = sc.nextInt();
        if (myAccount.tranferTo(nam,y)){
            System.out.println("Chuyen Thành Công" +y+ "Sang Tài Khoản"+nam.getName());
        }else {
            System.out.println("Chuyển Khoản Thất Bại");
        }
    }
}

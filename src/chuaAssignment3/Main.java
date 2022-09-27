package chuaAssignment3;


public class Main{
        public static void main(String[] args){
            KhachHangVN a = new KhachHangVN (1,"Nguyen Van hang","2022-09-02",500,"US");
            KhachHangNN b = new KhachHangNN (2,"Nguyen Van hang","2022-09-02",500,"US");
            System.out.println(a.thanhTien());
            System.out.println(b.thanhTien());

            KhachHang kh = (KhachHang) new KhachHangVN(2,"Nguyen Van B","2022-19-9",100,"Ca nhan");
            System.out.println(kh.thanhTien());

            KhachHangVN khvn = (KhachHangVN) new KhachHang(3,"Nguyen Van C", "2022-09-15",200);
            System.out.println(khvn.thanhTien());
        }
    }


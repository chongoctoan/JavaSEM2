package assignment3;

public class Main {
    public static void main(String[]args){
        Nguoi_NcNgoai nc = new Nguoi_NcNgoai(1,"nam","2020-01-01",50,2000,2000);
        nc.thanh_tien();
        System.out.println("Thành tiền người nước ngoài là: "+nc.getThanh_tien());

        Nguoi_Viet nv = new Nguoi_Viet(1,"nam","2020-01-01",5,2000,20);
        nv.thanh_tien_viet();
        System.out.println("Thành tiền người việt là: "+nv.getThanh_tien_viet());
    }
}
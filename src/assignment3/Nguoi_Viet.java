package assignment3;

public class Nguoi_Viet extends Khach_Hang{
    public Nguoi_Viet() {
    }
    public int thanh_tien_viet;

    public int getThanh_tien_viet() {
        return thanh_tien_viet;
    }

    public void setThanh_tien_viet(int thanh_tien_viet) {
        this.thanh_tien_viet = thanh_tien_viet;
    }

    public Nguoi_Viet(int id, String name, String ngay_xuat, int so_luong, int don_gia, int dinh_muc) {
        super(id, name, ngay_xuat, so_luong, don_gia, dinh_muc);
    }
    public void thanh_tien_viet(){
        if (so_luong<dinh_muc){
            thanh_tien_viet = so_luong * don_gia;
        }else if (dinh_muc < 50){
            thanh_tien_viet = so_luong * 1000;
        }else  if ( dinh_muc< 100 ){
            thanh_tien_viet = so_luong * 1200;
        }else if(dinh_muc<200){
            thanh_tien_viet = so_luong * 1500;
        }else {
            thanh_tien_viet = so_luong * 2000;
        }
    }
}
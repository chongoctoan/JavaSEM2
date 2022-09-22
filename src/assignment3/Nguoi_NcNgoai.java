package assignment3;

public class Nguoi_NcNgoai extends Khach_Hang{
    public Nguoi_NcNgoai() {
    }
    public int thanh_tien;

    public int getThanh_tien() {
        return thanh_tien;
    }

    public void setThanh_tien(int thanh_tien) {
        this.thanh_tien = thanh_tien;
    }

    public Nguoi_NcNgoai(int id, String name, String ngay_xuat, int so_luong, int don_gia, int dinh_muc) {
        super(id, name, ngay_xuat, so_luong, don_gia, dinh_muc);
    }

    public int thanh_tien(){
        return thanh_tien = so_luong * don_gia;

    }
}
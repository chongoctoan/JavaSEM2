package assignment3;

import java.util.Date;

public class Khach_Hang {
    public int id;
    public String name;
    public String ngay_xuat;
    public int so_luong;
    public int don_gia;
    public int dinh_muc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgay_xuat() {
        return ngay_xuat;
    }

    public void setNgay_xuat(String ngay_xuat) {
        this.ngay_xuat = ngay_xuat;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public int getDon_gia() {
        return don_gia;
    }

    public void setDon_gia(int don_gia) {
        this.don_gia = don_gia;
    }

    public int getDinh_muc() {
        return dinh_muc;
    }

    public void setDinh_muc(int dinh_muc) {
        this.dinh_muc = dinh_muc;
    }

    public Khach_Hang() {
    }

    public Khach_Hang(int id, String name, String ngay_xuat, int so_luong, int don_gia, int dinh_muc) {
        this.id = id;
        this.name = name;
        this.ngay_xuat = ngay_xuat;
        this.so_luong = so_luong;
        this.don_gia = don_gia;
        this.dinh_muc = dinh_muc;
    }
}
package chuaAssignment3;

import assignment3.Khach_Hang;

public class KhachHang {
    public int code;
    public String fullname;
    public String date;
    public int quantity;

    public KhachHang() {
    }

    public KhachHang(int code, String fullname, String date, int quantity) {
        this.code = code;
        this.fullname = fullname;
        this.date = date;
        this.quantity = quantity;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int thanhTien(){
        return quantity*2000;
    }
}

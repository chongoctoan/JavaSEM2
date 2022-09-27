package chuaAssignment3;

public class KhachHangNN extends KhachHang {
    public String doiTuong;

    public KhachHangNN(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public KhachHangNN(int id, String fullName, String date, int quantity, String doiTuong) {
        super(id, fullName, date, quantity);
        this.doiTuong = doiTuong;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    @Override
    public int thanhTien() {
        return super.thanhTien();
    }
}
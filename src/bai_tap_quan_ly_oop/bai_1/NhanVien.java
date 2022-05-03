package bai_tap_quan_ly_oop.bai_1;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String gioiTinh, String diaChi) {
        super(ten, tuoi, gioiTinh, diaChi);
    }

    public NhanVien(String congViec) {
        this.congViec = congViec;
    }

    public NhanVien(String ten, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congViec='" + congViec + '\'' +
                '}';
    }
}

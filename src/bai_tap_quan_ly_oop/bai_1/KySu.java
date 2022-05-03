package bai_tap_quan_ly_oop.bai_1;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu(String ten, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "KySu{" + super.toString()+
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                '}';
    }
}

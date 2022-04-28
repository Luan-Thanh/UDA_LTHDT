package Buoi_5.Bai1;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu(String hoVaTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoVaTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public void inThongTinKySu() {
        super.inThongTinCanBo();
        System.out.println("Ky Su Thuoc Nganh Dao Tao: " + nganhDaoTao);
    }
}

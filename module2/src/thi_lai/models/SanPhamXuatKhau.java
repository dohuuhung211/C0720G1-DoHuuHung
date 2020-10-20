package thi_lai.models;

public class SanPhamXuatKhau extends SanPham{
    double giaXuatKhau;
    String quocGiaNhapSP;

    public SanPhamXuatKhau(int id, int maSanPham, String tenSanPham, double giaBan, String soLuong, String nhaSanXuat,
                           double giaXuatKhau, String quocGiaNhapSP) {
        super(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSP = quocGiaNhapSP;
    }

    public double getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(double giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhapSP() {
        return quocGiaNhapSP;
    }

    public void setQuocGiaNhapSP(String quocGiaNhapSP) {
        this.quocGiaNhapSP = quocGiaNhapSP;
    }

    @Override
    public String toString() {
        return "SanPhanXuatKhau{" +
                "giaXuatKhau=" + giaXuatKhau +
                ", quocGiaNhapSP='" + quocGiaNhapSP + '\'' +
                "} " + super.toString();
    }

    @Override
    public void showInfor() {
        this.toString();
    }
}

package com.example.reponsitory;

import com.example.entity.ChungNhan;
import com.example.entity.NhanVien;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienReponsitory extends JpaRepository<NhanVien,String> {
    @Query(value = "select * from nhanvien where Luong < 10000 ", nativeQuery = true)
    public List<NhanVien> lstNhanVien();

    @Query(value = "select sum(nv.Luong)  from nhanvien nv", nativeQuery = true)
    public Long getToTalOfSalary();

    @Query(value = "select * from nhanvien nv join chungnhan c on nv.MaNV = c.MaNV\n" +
            "join maybay m on m.MaMB = c.MaMB\n" +
            "where m.Loai like '%Boeing%'\n" +
            "group by nv.MaNV, nv.Ten", nativeQuery = true)
    public List<NhanVien> maNhanVienBoeing();

    @Query(value = "select * from nhanvien nv join chungnhan c on nv.MaNV = c.MaNV\n" +
            "join maybay m on m.MaMB = c.MaMB\n" +
            "where m.MaMB = 747\n" +
            "group by nv.MaNV, nv.Ten",nativeQuery = true)
    public List<NhanVien> nhanVienLaiMB747();

    @Query(value = "SELECT *\n" +
            "FROM nhanvien\n" +
            "WHERE MaNV In (select cn.MaNV from chungnhan cn inner join maybay mb on mb.MaMB = cn.MaMB where mb.Loai like '%Airbus%' or mb.Loai like '%Boeing%')",nativeQuery = true)
    public List<NhanVien> lstNhanVienLaiCaAirBusVaBoing();

    @Query(value = "select count(*) from nhanvien join chungnhan c on nhanvien.MaNV = c.MaNV\n" +
            "join maybay m on m.MaMB = c.MaMB\n" +
            "where m.Loai = :loai",nativeQuery = true)
    public int getTongSoPhiCongLaiLoaiMayBay(String loai);

    @Query(value = "select nv.MaNV from nhanvien nv join chungnhan c on nv.MaNV = c.MaNV\n" +
            "join maybay m on m.MaMB = c.MaMB\n" +
            "group by nv.MaNV\n" +
            "having count(m.Loai) = 3",nativeQuery = true)
    public List<String> lstMaNVChiLaiDuoc3LoaiMB();

    @Query(value = "select nv.MaNV, max(TamBay) from nhanvien nv join chungnhan c on nv.MaNV = c.MaNV\n" +
            "                                join maybay m on m.MaMB = c.MaMB\n" +
            "group by nv.MaNV\n" +
            "having count(m.Loai) >= 3",nativeQuery = true)
    public List<Object[]> lstNhanVienLaiHon3LoaiMB();

    @Query(value = "select nv.MaNV, count(Loai) from nhanvien nv join chungnhan c on nv.MaNV = c.MaNV\n" +
            "                                join maybay m on m.MaMB = c.MaMB\n" +
            "group by nv.MaNV", nativeQuery = true)
    public List<Object[]> lstMaNVVaTongLoaiMB();

    @Query(value = "select  MaNV,Ten from nhanvien \n" +
            "where MaNV not in (select MaNV from chungnhan)",nativeQuery = true)
    public List<Object[]> lstNhanVienKhongPhaiPhiCong();

    @Query(value = "select MaNV,Ten,Luong\n" +
            "from nhanvien where Luong in (select MAX(Luong) from nhanvien)",nativeQuery = true)
    public List<Object[]> getMaNVCoLuongCaoNhat();

    @Query(value = "select SUM(Luong) from nhanvien\n" +
            "where MaNV in (select MaNV from chungnhan)",nativeQuery = true)
    public int getTongLuongPhiCong();
}
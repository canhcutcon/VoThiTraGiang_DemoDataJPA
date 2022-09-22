package com.example.reponsitory;

import com.example.entity.ChungNhan;
import com.example.entity.NhanVien;
import com.jayway.jsonpath.ValueCompareException;
import com.jayway.jsonpath.internal.function.numeric.Sum;
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



}
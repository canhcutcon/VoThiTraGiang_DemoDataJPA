package com.example.reponsitory;

import com.example.entity.ChungNhan;
import com.example.entity.NhanVien;
import com.jayway.jsonpath.internal.function.numeric.Sum;
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
}
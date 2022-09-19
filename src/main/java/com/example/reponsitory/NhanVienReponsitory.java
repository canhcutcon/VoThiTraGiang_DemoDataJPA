package com.example.reponsitory;

import com.example.entity.NhanVien;
import com.jayway.jsonpath.internal.function.numeric.Sum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienReponsitory extends JpaRepository<NhanVien,String> {
    @Query(value = "select * from nhanvien where Luong < 10000 ",nativeQuery = true)
    public List<NhanVien> lstNhanVien();

    @Query(value = "select sum(nv.Luong)  from nhanvien nv",nativeQuery = true)
    public Long getToTalOfSalary();

//    @Query(value = "select nhanvien  from nhanvien join chungnhan c on nhanvien.MaNV = c.MaNV\n" +
//            "join maybay m on m.MaMB = c.MaMB\n" +
//            "where Loai like 'Boeing%'\n" +
//            "group by nhanvien.MaNV",nativeQuery = true)
//    public List<NhanVien> maNhanVienBoeing();
}

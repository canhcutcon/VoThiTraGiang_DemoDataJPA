package com.example.reponsitory;

import com.example.entity.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MayBayReponsitory extends JpaRepository<MayBay,Integer> {
    @Query(value = "select * from maybay where TamBay > 10000", nativeQuery = true)
    public List<MayBay> lstMayBayCoTamBayLonHon10000();

    @Query(value = "select count(*) as soluong " +
            "from maybay where Loai like '%Boeing%'",nativeQuery = true)
    public Integer mayBayBoing();

    @Query(value = "select * from maybay m join chungnhan c on m.MaMB = c.MaMB\n" +
            "                          join nhanvien nv on nv.MaNV = c.MaNV\n" +
            "where nv.Ten like '%Nguyen%'",nativeQuery = true)
    public List<MayBay> lstMMayBayDoPhiCongHoNguyenLai();

    @Query(value = "select * from maybay\n" +"where TamBay >= 11979",nativeQuery = true)
    public List<MayBay> lstLoaiMayBayBayDuocChuyen280();

    @Query(value = "select Loai from maybay\n" +
            "where exists(select * from chungnhan cn join maybay m on m.MaMB = cn.MaMB)",nativeQuery = true)
    public List<String> loaiMayBayCoPhiCongLai();



}

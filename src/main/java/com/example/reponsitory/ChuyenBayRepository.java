package com.example.reponsitory;

import com.example.entity.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChuyenBayRepository extends JpaRepository<ChuyenBay,String> {
    @Query(value = "SELECT * FROM chuyenbay where GaDen = DAD", nativeQuery = true)
    public List<ChuyenBay> chuyenBayDenDaLat();

    @Query(value = "select * from chuyenbay where DoDai < 10000", nativeQuery = true)
    public List<ChuyenBay> chuyenBayDoDaiNhoHon10000();

    @Query(value = "select * from chuyenbay where (GaDi = 'SGN' and GaDen = 'BMV')",nativeQuery = true)
    public List<ChuyenBay> chuyenBaySGDiBuonMe();

    @Query(value = "select * from chuyenbay where GaDi = 'SGN'",nativeQuery = true)
    public List<ChuyenBay> chuyenBaySG();
}

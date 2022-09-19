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



}

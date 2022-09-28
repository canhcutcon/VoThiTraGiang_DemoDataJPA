package com.example.controller;

import com.example.entity.ChuyenBay;
import com.example.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ChuyenBayController {
    @Autowired
    ChuyenBayService chuyenBayService;

    @GetMapping("/cau1_cacChuyenBayDiDatLat")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<ChuyenBay>> getCacChuyenBayDiDaLat(){
        List<ChuyenBay> lst = chuyenBayService.getChuyenBay().chuyenBaySGDiBuonMe();
        return  new ResponseEntity<List<ChuyenBay>>(lst, HttpStatus.OK);
    }

    @GetMapping("/cau2_cacChuyenBayCOTamBayhon1000")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<ChuyenBay>> getChuyenBayCau2(){
        return new ResponseEntity<List<ChuyenBay>>(chuyenBayService.getChuyenBay()
                .chuyenBayDoDaiNhoHon10000(),HttpStatus.OK);
    }

    @GetMapping("/cau4_cacChuyenBayCoDoDaiHnhohon1000")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<ChuyenBay>> getCau4(){
        return new ResponseEntity<List<ChuyenBay>>(chuyenBayService.getChuyenBay()
                .chuyenBayDoDaiNhoHon10000(), HttpStatus.OK);
    }

    @GetMapping("/cau5_cacChuyenBayXuatPhatTuSG")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<ChuyenBay>> getCau5(){
        return new ResponseEntity<List<ChuyenBay>>(chuyenBayService.getChuyenBay()
                .chuyenBaySGDiBuonMe(),HttpStatus.OK);
    }


}

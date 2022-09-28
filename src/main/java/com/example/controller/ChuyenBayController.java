package com.example.controller;

import com.example.entity.ChuyenBay;
import com.example.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
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

    @GetMapping("/cau_6_SoChuyenBayXuatPhatTuSg")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<Integer> getCau6(){
        return new ResponseEntity<Integer>(chuyenBayService.getChuyenBay()
        .chuyenBaySG(),HttpStatus.OK);
    }

    @GetMapping("/getCau14")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<ChuyenBay>> getChuyenBayDuocThucHienBoiAirbus320(){
        return new ResponseEntity<List<ChuyenBay>>(
                chuyenBayService.getChuyenBay().chuyenBayDuoCBayBoiAirbus320(),
                HttpStatus.OK
        );
    }

    @GetMapping("/getCau17")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<ChuyenBay>> getChuyenBayBayThangTUADenB(){
        return new ResponseEntity<List<ChuyenBay>>(
                chuyenBayService.getChuyenBay().lstChuyenBayDiThang(),
                HttpStatus.OK
        );
    }

    @GetMapping("/getCau18")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<HashMap<String, Integer>> getGavaSoChuyenBayTaiMoiGa(){
        HashMap<String,Integer> lst = new HashMap<>();
        List<String> gaDi = chuyenBayService.getChuyenBay().getGaDi();
        gaDi.forEach(e->lst.put(e,chuyenBayService.getChuyenBay()
                .lstSoChuyenBayTheoGaDi().get(gaDi.indexOf(e))));
        return new ResponseEntity<HashMap<String,Integer>>(
                lst,HttpStatus.OK
        );
    }

    @GetMapping("/getCau19")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<HashMap<String, Integer>> getTongChiPhiOMoiGa(){
        HashMap<String,Integer> lst = new HashMap<>();
        List<String> gaDi = chuyenBayService.getChuyenBay().getGaDi();
        gaDi.forEach(e-> lst.put(e, chuyenBayService.getChuyenBay()
                .lstTongChiPhi().get(gaDi.indexOf(e))));
        return new ResponseEntity<HashMap<String,Integer>>(lst,HttpStatus.OK);
    }

    @GetMapping("/getCau20")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<ChuyenBay>> getCacChuyenBayKhoiHanhTruoc12H(){
        return new ResponseEntity<List<ChuyenBay>>(
                chuyenBayService.getChuyenBay().lstChuyenBayKhoiHanhTruoc12h(),
                HttpStatus.OK
        );
    }

    @GetMapping("/getCau21")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<ChuyenBay>> getCacChuyenBayKhoiHanhTruoc12HTaiMoiGA(){
        return new ResponseEntity<List<ChuyenBay>>(
                chuyenBayService.getChuyenBay().lstChuyenBayKhoiHanhTruoc12hTaiMoiGa(),
                HttpStatus.OK
        );
    }

    @GetMapping("/getCau28")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<ChuyenBay>> getChuyenBayThucHienBoiBoeing(){
        return new ResponseEntity<List<ChuyenBay>>(
                chuyenBayService.getChuyenBay().lstChuyenBayBayBangBoeing(),
                HttpStatus.OK
        );
    }

}

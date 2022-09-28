package com.example.controller;

import com.example.entity.MayBay;
import com.example.service.MayBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MayBayController {

    @Autowired
    MayBayService mayBayService;

    @GetMapping("/cau7_soLoaiMayBayBoeing")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<Integer> getCau7(){
        return new ResponseEntity<Integer>(mayBayService.getMayBay()
        .mayBayBoing(), HttpStatus.OK);
    }

    @GetMapping("/cau11_maSoMayBayDoNguoiHoNguyenLai")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<MayBay>> getCau11(){
        return new ResponseEntity<List<MayBay>>(
                mayBayService.getMayBay().lstMMayBayDoPhiCongHoNguyenLai(),
                HttpStatus.OK
        );
    }

    @GetMapping("/getCau13")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<MayBay>> getLoaiMayBayThucHienChuyenBay280(){
        return new ResponseEntity<List<MayBay>>(
                mayBayService.getMayBay().lstLoaiMayBayBayDuocChuyen280(),
                HttpStatus.OK
        );
    }

}

package com.example.controller;

import com.example.entity.NhanVien;
import com.example.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class NhanVienController {
    @Autowired
    NhanVienService nhanVienService;

    @GetMapping("/cau3_getNhanVienCoLuongnhohon1000")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<NhanVien>> getCau3(){
        return new ResponseEntity<List<NhanVien>>(nhanVienService.getNhanVien()
                .lstNhanVien(), HttpStatus.OK);
    }

    @GetMapping("/cau8_tongLuongPhaiTraChoNhanVien")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<Integer> getCau8(){
        return new ResponseEntity<Integer>(Math.toIntExact(nhanVienService.getNhanVien().getToTalOfSalary()),HttpStatus.OK);
    }

    @GetMapping("/cau9_maSoCacPhiCongLaiMayBAyBoeing")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<NhanVien>> getCau9(){
        return new ResponseEntity<List<NhanVien>>(
                nhanVienService.getNhanVien().maNhanVienBoeing(),
                HttpStatus.OK
        );
    }

    @GetMapping("/cau10_cacNhanVienCoTheLaiMayBay747")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<NhanVien>> getCau10(){
        return new ResponseEntity<List<NhanVien>>(
                nhanVienService.getNhanVien().nhanVienLaiMB747(),
                HttpStatus.OK
        );
    }

    @GetMapping("/getCau12")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<NhanVien>> getMaSoNhanVienVuaLaiDuocBoeingVuaLaiDuocAirbus(){
        return new ResponseEntity<List<NhanVien>>(
                nhanVienService.getNhanVien().lstNhanVienLaiCaAirBusVaBoing(),
                HttpStatus.OK
        );
    }

    @GetMapping("/getCau15")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<NhanVien>> getTenCacPhiCongLaiMayBayBoeing(){
        return new ResponseEntity<List<NhanVien>>(
                nhanVienService.getNhanVien().maNhanVienBoeing(),
                HttpStatus.OK
        );
    }

    @GetMapping("/getCau22")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<String>> getMaCacPhiCongChiLaiDuoc3LoaiMayBay(){
        return new ResponseEntity<List<String>>(
                nhanVienService.getNhanVien().lstMaNVChiLaiDuoc3LoaiMB(),
                HttpStatus.OK
        );
    }

    @GetMapping("/getCau23")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<Object[]>> getMaPhiCongVaTamBayLonNhat(){
        return new  ResponseEntity<List<Object[]>>(
                nhanVienService.getNhanVien().lstNhanVienLaiHon3LoaiMB(),
        HttpStatus.OK
                );
    }

    @GetMapping("/getCau24")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<Object[]>> getMaPhiCongVaTongLoaiMayBay(){
        return new ResponseEntity<List<Object[]>>(
                nhanVienService.getNhanVien().lstMaNVVaTongLoaiMB(),
                HttpStatus.OK
        );
    }

    @GetMapping("/getCau25")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<Object[]>> getNhanVienKhongPhaiPhiCong(){
        return new ResponseEntity<List<Object[]>>(
                nhanVienService.getNhanVien().lstNhanVienKhongPhaiPhiCong(),
                HttpStatus.OK
        );
    }

    @GetMapping("/getCau26")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<List<Object[]>> getNhanVienCoLuongCaoNhat(){
        return new ResponseEntity<List<Object[]>>(
                nhanVienService.getNhanVien().getMaNVCoLuongCaoNhat(),
                HttpStatus.OK
        );
    }

    @GetMapping("/getCau27")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public ResponseEntity<Integer> getTongLuongPhiCong(){
        return new ResponseEntity<Integer>(
                nhanVienService.getNhanVien().getTongLuongPhiCong(),
                HttpStatus.OK
        );
    }




}
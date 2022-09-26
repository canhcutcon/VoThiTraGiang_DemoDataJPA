package com.example.controller;

import com.example.entity.ChuyenBay;
import com.example.entity.NhanVien;
import com.example.service.ChuyenBayService;
import com.example.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    ChuyenBayService chuyenBayService;

    @Autowired
    NhanVienService nhanVienService;

    @GetMapping(value = "/chuyenbays")
    public ResponseEntity<List<ChuyenBay>> home() {
        return ResponseEntity.ok(chuyenBayService.getChuyenBay().chuyenBaySGDiBuonMe());
    }
    @GetMapping(value = "/nhanviens")
    public ResponseEntity<List<NhanVien>> lstNhanVien() {
        return ResponseEntity.ok(nhanVienService.getNhanVien().lstNhanVien());
    }


}

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
}
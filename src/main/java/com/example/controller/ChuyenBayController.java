package com.example.controller;

import com.example.entity.ChuyenBay;
import com.example.entity.NhanVien;
import com.example.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ChuyenBayController {
    @Autowired
    ChuyenBayService chuyenBayService;

    @GetMapping(value = "/chuyenbay")
    public List<ChuyenBay> chuyenbays()
    {
        List<ChuyenBay> chuyenBays = chuyenBayService.getChuyenBay().chuyenBayDenDaLat();
//        model.addAttribute("lstChuyenBay", chuyenBays);
        return chuyenBays;
    }
}

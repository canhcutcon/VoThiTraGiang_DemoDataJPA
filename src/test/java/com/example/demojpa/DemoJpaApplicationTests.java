package com.example.demojpa;

import com.example.reponsitory.ChuyenBayRepository;
import com.example.service.ChuyenBayService;
import com.example.service.MayBayService;
import com.example.service.NhanVienService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJpaApplicationTests {
    @Autowired
    ChuyenBayService chuyenBayService;
    @Autowired
    MayBayService mayBayService;
    @Autowired
    NhanVienService nhanVienService;

    @Test
    void cau_1_CacChuyenBayDiDaLat() {
        System.out.println("1.\tCho biết các chuyến bay đi Đà Lạt (DAD).");
        chuyenBayService.displayAllChuyenBay();
        System.out.println("!================================================!");
    }

    @Test
    void cau_2_CacChuyenBayCoTamBayLonHon1000(){
        System.out.println("2.Cho biết các loại máy bay có tầm bay lớn hơn 10,000km");
        mayBayService.displayMayBayTamBayLonHon10000();
        System.out.println("!================================================!");
    }

    @Test
    void cau_3_CacNhanVienCoLuongNhoHon10000(){
        System.out.println("3.\tTìm các nhân viên có lương nhỏ hơn 10,000.");
        nhanVienService.getNhanVien().lstNhanVien()
                .forEach(System.out::println);
        System.out.println("!================================================!");
    }

    @Test
    void cau_4_CacChuyenBayCoDoDaiNhoHon10000(){
        System.out.println("4.\tCho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.");
        chuyenBayService.getChuyenBay().chuyenBayDoDaiNhoHon10000()
                .forEach(System.out::println);
        System.out.println("!================================================!");
    }

    @Test
    void cau_5_CacChuyenBayXuatPhatTuSGDiBUonMe(){
        System.out.println("5.\tCho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).");
        chuyenBayService.getChuyenBay().chuyenBaySGDiBuonMe()
                .forEach(System.out::println);
        System.out.println("!================================================!");
    }

    @Test
    void cau_5_CacChuyenBayXuatPhatTuSG(){
        System.out.println("5.\tCho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).");
        chuyenBayService.getChuyenBay().chuyenBaySGDiBuonMe()
                .forEach(System.out::println);
        System.out.println("!================================================!");
    }

    @Test
    void cau_6_SoChuyenBayXuatPhatTuSg(){
        System.out.println("6.\tCó bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).");
        chuyenBayService.getChuyenBay().chuyenBaySG()
                .forEach(System.out::println);
        System.out.println("!================================================!");
    }

    @Test
    void cau_7_soLoaiMayBayBoeing(){
        System.out.println("7.\tCó bao nhiêu loại máy báy Boeing.");
        System.out.println(mayBayService.getMayBay().mayBayBoing());
        System.out.println("!================================================!");
    }

    @Test
    void cau_8_TongLuongPhaiTraChoNhanVien(){
        System.out.println("8.\tCho biết tổng số lương phải trả cho các nhân viên..");
        System.out.println(nhanVienService.getNhanVien().getToTalOfSalary());
        System.out.println("!================================================!");
    }

    @Test
    void cau_9_MaSoCacPhiCongLaiMayBayBoeing(){
        System.out.println("9.\tCho biết mã số của các phi công lái máy báy Boeing.");
        nhanVienService.getNhanVien().maNhanVienBoeing()
                .forEach(System.out::println);
        System.out.println("!================================================!");
    }

    @Test
    void cau_10_CacNhanVienCoTheLaiMayBay747(){
        System.out.println("10.\tCho biết các nhân viên có thể lái máy bay có mã số 747");
        nhanVienService.getNhanVien().nhanVienLaiMB747()
                .forEach(System.out::println);
        System.out.println("!================================================!");
    }

    @Test
    void cau_11_MaSoMayBayNhanVienHoNguyenLai(){
        System.out.println("11.\tCho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái.");
        mayBayService.getMayBay().lstMMayBayDoPhiCongHoNguyenLai().forEach(System.out::println);
        System.out.println("!================================================!");
    }


}

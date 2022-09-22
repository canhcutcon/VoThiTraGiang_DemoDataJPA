package com.example.demojpa;

import com.example.reponsitory.ChuyenBayRepository;
import com.example.reponsitory.NhanVienReponsitory;
import com.example.service.ChuyenBayService;
import com.example.service.MayBayService;
import com.example.service.NhanVienService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.Tuple;
import java.util.List;
import java.util.Map;

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
        System.out.println(chuyenBayService.getChuyenBay().chuyenBaySG());
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

    @Test
    void cau_12_MaPhiCongVuaLaiBoeingVuaLaiAirbus(){
        System.out.println("12.\tCho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus.");
        nhanVienService.getNhanVien().lstNhanVienLaiCaAirBusVaBoing()
        .forEach(System.out::println);
        System.out.println("!================================================!");
    }

    @Test
    void cau_13_LoaiBayBayCoTheThucHienChuyenBayVN280(){
        System.out.println("13.\tCho biết các loại máy bay có thể thực hiện chuyến bay VN280.");
        mayBayService.getMayBay().lstLoaiMayBayBayDuocChuyen280()
        .forEach(e -> {System.out.println(e.getLoai());});
        System.out.println("!================================================!");
    }

    @Test
    void cau_14_ChuyenBayDuocThucHienBoiAirbus320(){
        System.out.println("14.\tCho biết các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320");
        chuyenBayService.getChuyenBay().chuyenBayDuoCBayBoiAirbus320()
                .forEach(System.out::println);
        System.out.println("!================================================!");
    }

    //==
    @Test
    void cau_15_TenCacPhiCongLaiMayBayBo(){
        System.out.println("15.\teingCho biết tên của các phi công lái máy bay Boeing");
        nhanVienService.getNhanVien().maNhanVienBoeing()
                .forEach(nv -> System.out.println(nv.getTen()));
        System.out.println("!================================================!");
    }

    @Test
    void cau_16_getLoaiMayBayVaTongSoPhiCongLaiMayBayDo(){
        System.out.println("16.\tVới mỗi loại máy bay có phi công lái cho biết mã số, " +
                "loại máy báy và tổng số phi công có thể lái loại máy bay đó.");
        mayBayService.getMayBay().loaiMayBayCoPhiCongLai()
                .forEach(e->{
                    System.out.println(nhanVienService.getNhanVien()
                    .getTongSoPhiCongLaiLoaiMayBay(e));
                });
        System.out.println("!================================================!");
    }

    @Test
    void cau_17_getDuongBayCoTheDiThangTuAdenBRoiVeA(){
        System.out.println("17.\tGiả sử một hành khách muốn đi thẳng từ ga A đến ga B rồi quay trở về ga A. " +
                "Cho biết các đường bay nào có thể đáp ứng yêu cầu này.");
        chuyenBayService.getChuyenBay().lstChuyenBayDiThang()
                .forEach(System.out::println);
        System.out.println("!================================================!");

    }

    @Test
    void cau_18_SoChuyenBayKhoiHanhOMoiGa(){
        System.out.println("18. Với mỗi ga có chuyến bay xuất phát từ đó" +
                " cho biết có bao nhiêu chuyến bay khởi hành từ ga đó.");
        List<String> gaDi = chuyenBayService.getChuyenBay().getGaDi();
        gaDi.forEach(e-> System.out.println(e +": "+ chuyenBayService.getChuyenBay()
                                                        .lstSoChuyenBayTheoGaDi().get(gaDi.indexOf(e))));
        System.out.println("!================================================!");
    }

    @Test
    void cau_19_TongChiPhiTraChoPhiCongOMoiGa(){
        System.out.println("19.Với mỗi ga có chuyến  bay xuất phát " +
                        "từ đó cho biết tổng chi phí phải trả cho phi công lái các chuyến bay khởi hành từ ga đó");
        List<String> gaDi = chuyenBayService.getChuyenBay().getGaDi();
        gaDi.forEach(e-> System.out.println(e +": "+ chuyenBayService.getChuyenBay()
                .lstTongChiPhi().get(gaDi.indexOf(e))));
        System.out.println("!================================================!");
    }

    @Test
    void cau_20_DanHSachChuyenBayKhoiHanhTruoc12h(){
        System.out.println("20.\tCho biết danh sách các chuyến bay có thể khởi hành trước 12:00");
        chuyenBayService.getChuyenBay().lstChuyenBayKhoiHanhTruoc12h()
                .forEach(System.out::println);
        System.out.println("!================================================!");
    }

    @Test
    void cau_21_ChuyenBayKhoiHanhTruoc12hTaiMoiGa(){
        System.out.println("21. Với mỗi địa điểm xuất phát cho biết có bao nhiêu chuyến bay có thể khởi hành trước 12:00.");
        chuyenBayService.getChuyenBay().lstChuyenBayKhoiHanhTruoc12hTaiMoiGa()
                .forEach(System.out::println);
        System.out.println("!================================================!");
    }

    @Test
    void cau_22_MaSoCuaCacPhiCongChiLaiDuoc3LoaiMB(){
        System.out.println("22.\tCho biết mã số của các phi công chỉ lái được 3 loại máy bay");
        nhanVienService.getNhanVien().lstMaNVChiLaiDuoc3LoaiMB()
                .forEach(System.out::println);

    }

    @Test
    void cau_23_GetMaPhiCongVaTamBayLonNhatCuaLoaiMaiBayPhiCongCoTheLai(){
        System.out.println("23.\tVới mỗi phi công có thể lái nhiều hơn 3 loại máy bay, " +
                "cho biết mã số phi công và tầm bay lớn nhất của các loại máy bay mà phi công đó có thể lái.");
        nhanVienService.getNhanVien().lstNhanVienLaiHon3LoaiMB()
                .forEach(e -> System.out.println(e[0] + ": " + e[1] ));
        System.out.println("!================================================!");
    }

    @Test
    void cai_24_GetMaPhiCongVaTogLoaiMayBayCoTheLai(){
        System.out.println("24.\tVới mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi công đó có thể lái.");
        nhanVienService.getNhanVien().lstMaNVVaTongLoaiMB()
                .forEach(e -> System.out.println("Ma nv " + e[0] + ": " + e[1]));
    }

    @Test
    void cau_25_NhanVienKhongPhaiPhiCong(){
        System.out.println("25.\tTìm các nhân viên không phải là phi công.");
        nhanVienService.getNhanVien().lstNhanVienKhongPhaiPhiCong()
                .forEach(e -> System.out.println(e[0] + ": " + e[1]));
    }

    @Test
    void cau_26_GetMaNhanVienCoLuongCaoNhat(){
        System.out.println("26.\tCho biết mã số của các nhân viên có lương cao nhất.");
        nhanVienService.getNhanVien().getMaNVCoLuongCaoNhat()
                .forEach(e -> System.out.println(e[0] + " | " + e[1] + " | " + e[2]));
    }

    @Test
    void cau_27_TongLuongPhaiTraChoPhiCong(){
        System.out.println("27.\tCho biết tổng số lương phải trả cho các phi công.");
        System.out.println(nhanVienService.getNhanVien().getTongLuongPhiCong());
    }

    @Test
    void cau_28_CacChuyenBayThucHienBoiBoeing(){
        System.out.println("28.\tTìm các chuyến bay có thể được thực hiện bởi tất cả các loại máy bay Boeing.");
        chuyenBayService.getChuyenBay().lstChuyenBayBayBangBoeing()
                .forEach(System.out::println);
    }





}

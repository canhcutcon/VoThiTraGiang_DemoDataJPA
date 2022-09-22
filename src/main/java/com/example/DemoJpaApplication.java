package com.example;

import com.example.service.ChuyenBayService;
import com.example.service.MayBayService;
import com.example.service.NhanVienService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class DemoJpaApplication {
    final ChuyenBayService chuyenBayService;
    final MayBayService mayBayService;
    final NhanVienService nhanVienService;

    public DemoJpaApplication(ChuyenBayService chuyenBayService,
                              MayBayService mayBayService, NhanVienService nhanVienService) {
        this.chuyenBayService = chuyenBayService;
        this.nhanVienService = nhanVienService;
        this.mayBayService = mayBayService;
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoJpaApplication.class, args);
    }
    @PostConstruct
    void postConstruct(){
//        System.out.println("1.\tCho biết các chuyến bay đi Đà Lạt (DAD).");
//        chuyenBayService.displayAllChuyenBay();
//        System.out.println("!================================================!");
//
//        System.out.println("2.Cho biết các loại máy bay có tầm bay lớn hơn 10,000km");
//        mayBayService.displayMayBayTamBayLonHon10000();
//        System.out.println("!================================================!");
//
//        System.out.println("3.\tTìm các nhân viên có lương nhỏ hơn 10,000.");
//        nhanVienService.getNhanVien().lstNhanVien()
//                .forEach(System.out::println);
//        System.out.println("!================================================!");
//
//        System.out.println("4.\tCho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.");
//        chuyenBayService.getChuyenBay().chuyenBayDoDaiNhoHon10000()
//                .forEach(System.out::println);
//        System.out.println("!================================================!");
//
//        System.out.println("5.\tCho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).");
//        chuyenBayService.getChuyenBay().chuyenBaySGDiBuonMe()
//                .forEach(System.out::println);
//        System.out.println("!================================================!");
//
//        System.out.println("6.\tCó bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).");
//        chuyenBayService.getChuyenBay().chuyenBaySG()
//                .forEach(System.out::println);
//        System.out.println("!================================================!");
//
//        System.out.println("7.\tCó bao nhiêu loại máy báy Boeing.");
//        System.out.println(mayBayService.getMayBay().mayBayBoing());
//        System.out.println("!================================================!");
//
//        System.out.println("8.\tCho biết tổng số lương phải trả cho các nhân viên..");
//        System.out.println(nhanVienService.getNhanVien().getToTalOfSalary());
//        System.out.println("!================================================!");



//        System.out.println("12.\tCho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus.");
//        mayBayService.displayMayBayTamBayLonHon10000();
//        System.out.println("!================================================!");
//
//

//
//        System.out.println("15.\tCho biết tên của các phi công lái máy bay Boeing");
//        mayBayService.displayMayBayTamBayLonHon10000();
//        System.out.println("!================================================!");
//
//
//        System.out.println("17.\tGiả sử một hành khách muốn đi thẳng từ ga A đến ga B rồi quay trở về ga A. " +
//                "Cho biết các đường bay nào có thể đáp ứng yêu cầu này.");
//        mayBayService.displayMayBayTamBayLonHon10000();
//        System.out.println("!================================================!");
//
//
//
//
//
//
//
//
//
 }


}

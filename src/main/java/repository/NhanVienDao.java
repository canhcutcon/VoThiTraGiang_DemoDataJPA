package repository;

import entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface NhanVienDao extends JpaRepository<NhanVien,Long> {

    @Query(value = "SELECT * FROM nhanvien", nativeQuery = true)
    public List<NhanVien> listNhanVien();
}

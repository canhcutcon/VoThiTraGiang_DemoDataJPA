package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "nhanvien")
public class NhanVien {

    @Id
    @Column(name = "MaNV")
    private String MaNV;

    @Column(name = "Ten")
    private String Ten;

    @Column(name = "Luong")
    private int Luong;

}
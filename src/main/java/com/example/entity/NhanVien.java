package com.example.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Table(name = "nhanvien")
public class NhanVien implements Serializable {
    @Id
    @Column(name = "MaNV")
    private String MaNV;

    @Column(name = "Ten")
    private String Ten;

    @Column(name = "Luong")
    private Integer Luong;

}

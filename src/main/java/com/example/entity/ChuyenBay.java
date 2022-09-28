package com.example.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Table(name = "chuyenbay")
@ToString
public class ChuyenBay {
    @Id
    @Column(name = "MaCB", unique=true)
    private String MaCB;

    @Column(name = "GaDi")
    private String GaDi;

    @Column(name = "GaDen")
    private String GaDen;

    @Column(name = "DoDai")
    private Integer DoDai;

    @Column(name = "GioDi")
    private LocalDate GioDi;

    @Column(name = "GioDen")
    private LocalDate GioDen;

    @Column(name = "ChiPhi")
    private Integer ChiPhi;


}

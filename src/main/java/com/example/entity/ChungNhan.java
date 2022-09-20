package com.example.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Table(name = "chungnhan")
public class ChungNhan implements Serializable {
//    @EmbeddedId
//    protected  ChungNhanID chungNhanID;
    @Id
    @JoinColumn(name = "MaNV", referencedColumnName = "MaNV", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private NhanVien nhanVien;

    @Id
    @JoinColumn(name = "MaMB",referencedColumnName = "MaMB", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private MayBay mayBay;
}

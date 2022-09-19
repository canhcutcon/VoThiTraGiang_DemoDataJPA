package com.example.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class ChungNhanID implements Serializable {

    @ManyToOne
    @JoinColumn(name = "MaMV")
    private NhanVien MaNV;

    @ManyToOne
    @JoinColumn(name = "MaNB")
    private MayBay MaMB;
}

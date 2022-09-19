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
@Table(name = "maybay")
public class MayBay implements Serializable {

    @Id
    @Column(name = "MaMB")
    private Integer MaMB;

    @Column(name = "Loai")
    private String Loai;

    @Column(name = "TamBay")
    private Integer TamBay;
}

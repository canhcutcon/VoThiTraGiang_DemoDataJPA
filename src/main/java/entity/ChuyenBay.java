package entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "chuyenbay")
public class ChuyenBay {

    @Id
    @Column(name = "MaCB", unique=true)
    private String MaCB;

    @Column(name = "GaDi")
    private String GaDi;

    @Column(name = "GaDen")
    private String GaDen;

    @Column(name = "DoDai")
    private int DoDai;

    @Column(name = "GioDi")
    private int GioDi;

    @Column(name = "GioDen")
    private int GioDen;

    @Column(name = "ChiPhi")
    private int ChiPhi;
}
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
@Table(name = "maybay")
public class MayBay {

    @Id
    @GeneratedValue
    private int MaMB;

    @Column(name = "loai")
    private String loai;

    @Column(name = "TamBay")
    private int TamBay;
}
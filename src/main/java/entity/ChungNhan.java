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
@Table(name = "chungnhan")
public class ChungNhan {
    @Id
    @ManyToOne
    @JoinColumn(name = "MaNV")
    private NhanVien nhanVien;

    @Id
    @ManyToOne
    @JoinColumn(name = "MaMB")
    private MayBay mayBay;
}

package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@Entity
@Table(name = "customers")
public class ChuyenBay {
    @Id

}

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

   @EmbeddedId
    private ChungNhanID chungNhanID;
}

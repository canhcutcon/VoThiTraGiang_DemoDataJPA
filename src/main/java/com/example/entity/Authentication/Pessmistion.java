package com.example.entity.Authentication;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_permission")
@Getter
@Setter
public class Pessmistion extends BaseEntity {

    private String permissionName;

    private String permissionKey;

}
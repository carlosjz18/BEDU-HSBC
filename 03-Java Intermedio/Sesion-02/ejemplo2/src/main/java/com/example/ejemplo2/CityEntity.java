package com.example.ejemplo2;

import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@RestResource(exported = false)
public class CityEntity {
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private String province;
}

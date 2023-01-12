package com.example.ejemplo2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@RestResource(rel = "customers", path = "customer")
public class CustomerEntity {
    @Id
    private long id;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String telephone;
    @Column
    //@JsonIgnore
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String secret;
    @OneToOne
    private CityEntity city;
}

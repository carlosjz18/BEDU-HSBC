package com.example.ejemplo2;

import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@RestResource(rel = "tickets", path = "ticket")
public class TicketEntity {
    @Id
    private long id;
    @OneToOne
    private CustomerEntity customer;
    @OneToOne
    private ProductEntity product;
}

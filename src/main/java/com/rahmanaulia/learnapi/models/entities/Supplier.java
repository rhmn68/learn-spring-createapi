package com.rahmanaulia.learnapi.models.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "tbl_suppliers")
public class Supplier implements Serializable {

    private static final long longSerialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id", nullable = false)
    private Long id;

    @Column(name = "supplier_name", length = 150, nullable = false)
    private String name;

    @Column(name = "supplier_address", length = 200, nullable = false)
    private String address;

    @Column(name = "supplier_email", length = 100, nullable = false, unique = true)
    private String email;

    @ManyToMany(mappedBy = "suppliers")
    private Set<Product> products;

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

package com.rahmanaulia.learnapi.models.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_categories")
public class Category implements Serializable {

    private static final long longSerialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", nullable = false)
    private Long id;

    @Column(name = "category_name", length = 100, nullable = false, unique = true)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

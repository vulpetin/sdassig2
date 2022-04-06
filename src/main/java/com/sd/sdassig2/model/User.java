package com.sd.sdassig2.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user")
public class User {
    @Id
    @Column(unique = true,nullable = false)
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String name;
}

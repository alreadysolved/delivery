package com.example.delivery.entity;

import jakarta.persistence.*;

@Entity
public class User {
    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING) // DB에 Ordinal 형식(default)이 아닌 String 형식으로 저장
    private UserRole role;

//    @OneToMany(mappedBy = "owner")
//    private List<Menu> menuList;
}

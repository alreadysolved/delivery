package com.example.delivery.entity;

import jakarta.persistence.*;

@Entity
public class Menu {
    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String name;

    // Validation 사용해서 가격 제한할 거지만, columnDefinition으로 DB에서도 이중 체크
    @Column(nullable = false, columnDefinition = "INT CHECK (price > 0)")
    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    private String description;

    private boolean isDeleted;
}

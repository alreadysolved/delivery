package com.example.delivery.entity;

import jakarta.persistence.*;

@Entity
public class Order {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private User customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id", nullable = false)
    private Menu menu;

    @Column(nullable = false, columnDefinition = "CHECK (quantity > 0)")
    private int quantity;

    @Column(nullable = false)
    private int totalAmount;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private OrderStatus status;
}

package com.example.delivery.entity;

import com.example.delivery.order.entity.Order;
import jakarta.persistence.*;

@Entity
public class Payment {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Column(nullable = false)
    private int amount;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private PaymentMethod method;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private PaymentStatus status;
}

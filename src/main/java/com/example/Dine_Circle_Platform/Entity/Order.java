package com.example.Dine_Circle_Platform.Entity;

import com.example.Dine_Circle_Platform.Enums.OrderStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order extends BaseEntity{
    private String tableNumber;
    private Double subtotal;
    private Double tax;
    private Double discount;
    private Double finalAmount;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @ManyToOne
    private RestaurantBranch branch;

    @ManyToOne
    private User waiter;
}

package com.example.Dine_Circle_Platform.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Table {
    private String tableNumber;
    private Integer capacity;
    private Boolean occupied;

    @ManyToOne
    private RestaurantBranch branch;

    @ManyToOne
    private User assignedWaiter;
}

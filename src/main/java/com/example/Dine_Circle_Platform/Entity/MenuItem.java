package com.example.Dine_Circle_Platform.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MenuItem extends BaseEntity{
    private String dishName;
    private String category;
    private Double price;
    private Integer calories;
    private String description;
    private Integer quantity;

    @ManyToOne
    private RestaurantBranch branch;
}

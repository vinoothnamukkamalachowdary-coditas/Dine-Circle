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
public class Ingredients extends BaseEntity{
    private String ingredientName;
    private Double stockQuantity;
    private String unit;
    private String expiryDate;

    @ManyToOne
    private RestaurantBranch branch;
}

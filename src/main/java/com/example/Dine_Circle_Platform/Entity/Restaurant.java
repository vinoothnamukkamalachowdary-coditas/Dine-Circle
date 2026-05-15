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
public class Restaurant {
    private String name;
    private Boolean luxuryRestaurant;
    private Boolean liquorServed;

    @ManyToOne
    private User owner;
}

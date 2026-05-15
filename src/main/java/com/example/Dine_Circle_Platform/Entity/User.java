package com.example.Dine_Circle_Platform.Entity;

import com.example.Dine_Circle_Platform.Enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String email;
    private String phoneNumber;
    private String password;
    private String photoUrl;
    @Enumerated(EnumType.STRING)
    private Role role;
}

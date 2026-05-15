package com.example.Dine_Circle_Platform.Entity;


import com.example.Dine_Circle_Platform.Enums.InvitationStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Invitation {private String invitedEmail;
    private String token;

    @Enumerated(EnumType.STRING)
    private InvitationStatus status;
}

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
public class StaffAttendance extends BaseEntity {
    private Boolean present;
    private String coverDutyReason;

    @ManyToOne
    private User staff;
}

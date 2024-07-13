package com.medicontrol.health_manage_api.domain.DAOs;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class UserDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String username;
    public String password;
    public boolean enabled;
    @ManyToOne
    @JoinColumn(name = "staff_id")
    private StaffDAO staff;
}

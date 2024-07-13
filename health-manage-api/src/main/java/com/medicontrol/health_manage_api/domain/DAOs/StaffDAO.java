package com.medicontrol.health_manage_api.domain.DAOs;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "sfaff")
@Data
@NoArgsConstructor
public class StaffDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String name;
    public String lastName;
    public String phone;
    public String email;
    @OneToMany(mappedBy = "staff")
    private List<UserDAO> users;
}

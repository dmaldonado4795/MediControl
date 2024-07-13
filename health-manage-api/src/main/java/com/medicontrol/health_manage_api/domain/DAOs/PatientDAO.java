package com.medicontrol.health_manage_api.domain.DAOs;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "patient")
@Data
@NoArgsConstructor
public class PatientDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String name;
    public String lastName;
    public String phone;
    public String email;
    public String address;
}

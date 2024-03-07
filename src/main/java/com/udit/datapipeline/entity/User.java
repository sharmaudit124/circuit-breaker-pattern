package com.udit.datapipeline.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {
    @Id
    private String id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private String ip_address;
    private String age;
    private String country;
    private String address;
    private String phone_number;
    private String birthdate;
    @Column(length = 2000)
    private String details;
}

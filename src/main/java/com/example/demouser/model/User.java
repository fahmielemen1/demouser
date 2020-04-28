package com.example.demouser.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_user")
public class User {
    @Id
    @Column(name = "user_id",
            unique = true,
            length = 100)
    private String id;

    @Column(name = "user_name",
            length = 100)
    private String nama;

    @Column(name = "user_addres",
            length = 200)
    private String addres;

    @JoinColumn(name = "user_id",
            unique = true)

    @ManyToOne
    private Role role;
}

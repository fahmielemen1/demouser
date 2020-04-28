package com.example.demouser.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_role")
public class Role {
    @Id
    @Column(name = "role_id",
            unique = true,
            length = 100)
    private String id;

    @Column(name = "role_name",
            length = 100)
    private String nama;

    @OneToMany(mappedBy = "role")
    @JsonIgnore
    private List<User> users;
}

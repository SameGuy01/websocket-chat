package com.kirill.websocketchat.domain;

import com.kirill.websocketchat.domain.User;
import com.kirill.websocketchat.domain.enums.Roles;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="role")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    @GeneratedValue
    private Long role_id;

    @Enumerated(EnumType.STRING)
    @Column(name="role",nullable = false)
    private Roles role;

}

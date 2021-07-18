package com.kirill.websocketchat.domain.enums;

import com.kirill.websocketchat.domain.User;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="role")
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public enum Role {
    USER("ROLE_USER"),
    MODERATOR("ROLE_MODERATOR"),
    ADMIN("ROLE_ADMIN");

    @Id
    @GeneratedValue
    private Long role_id;

    @NonNull
    private String role;

    @ManyToMany
    @JoinTable(name="users_role",
    joinColumns = @JoinColumn(name="role_id"),
    inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> users;
}

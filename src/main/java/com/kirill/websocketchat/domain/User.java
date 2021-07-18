package com.kirill.websocketchat.domain;

import com.kirill.websocketchat.domain.enums.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name="users")
@Getter @Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;

    private String username;

    private String password;

    private String email;

    private boolean blocked;

    private Timestamp block_start;

    private Timestamp block_end;

    @Column(name="role")
    @Enumerated(EnumType.ORDINAL)
    private Role role;

    @OneToOne(mappedBy = "user")
    private Message message;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private Set<Room> rooms;

    @ManyToMany
    @JoinTable(name="users_role",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name="admin_room",
    joinColumns = @JoinColumn(name = "admin_id",referencedColumnName = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "room_id",referencedColumnName = "room_id"))
    private Room adminRoom;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "moderator_room",
    joinColumns = @JoinColumn(name = "moderator_id",referencedColumnName = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "room_id",referencedColumnName = "room_id"))
    private Room moderatorRoom;
}

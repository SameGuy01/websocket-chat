package com.kirill.websocketchat.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="room")
@Getter @Setter
@NoArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="room_id")
    private Long id;

    private String room_name;

    @OneToOne(mappedBy = "room")
    private Message message;

    @OneToOne(mappedBy = "adminRoom")
    private User admin_room;

    @OneToOne(mappedBy = "moderatorRoom")
    private User moderator;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private boolean status;
}

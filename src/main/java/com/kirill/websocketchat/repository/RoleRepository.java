package com.kirill.websocketchat.repository;

import com.kirill.websocketchat.domain.Role;
import com.kirill.websocketchat.domain.enums.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role getByRole(Roles roles);
}

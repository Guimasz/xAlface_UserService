package com.xAlface.microservices.user.xAlface_UserService.model;

import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import jakarta.persistence.*;

@Entity
@Table(name = "teachers")
public class Teacher extends User {
    @Column(nullable = true)
    private String department;
    // getter/setter

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_TEACHER"));
    }
}
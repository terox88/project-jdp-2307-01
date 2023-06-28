package com.kodilla.ecommercee.domain;

import com.kodilla.ecommercee.enums.UserStatus;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "USER_ID", unique = true)
    private Long id;

    @Column(name = "FIRSTNAME")
    private String firstname;

    @Column(name = "LASTNAME")
    private String lastname;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "BIRTHDAY")
    private LocalDate birthday;

    @Column(name = "USER_KEY")
    private Long userKey;

    @Enumerated(EnumType.STRING)
    @Column(name = "IS_ACTIVE")
    private UserStatus isActive;
}
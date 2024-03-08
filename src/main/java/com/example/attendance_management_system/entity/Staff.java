package com.example.attendance_management_system.entity;

import jakarta.persistence.*;

import javax.management.relation.Role;
import java.util.Date;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String teamName;
    @Column(nullable = false)
    private Date birthday;
    @Column(nullable = false)
    private Date workStartDay;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role Role;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getTeamName() {
        return teamName;
    }

    public Date getWorkStartDay() {
        return workStartDay;
    }

    public javax.management.relation.Role getRole() {
        return Role;
    }

    public Staff(String name, Date birthday, Date workStartDay, javax.management.relation.Role role) {
        this.name = name;
        this.birthday = birthday;
        this.workStartDay = workStartDay;
        Role = role;
    }

    protected Staff(){

    }
}

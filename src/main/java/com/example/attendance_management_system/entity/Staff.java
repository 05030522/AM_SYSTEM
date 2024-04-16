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
    private Role role;

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

    public Role getRole() {
        return role;
    }

    public Staff(String name, Date birthday, Date workStartDay, Role role) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다", name));
        }
        this.name = name;
        this.birthday = birthday;
        this.workStartDay = workStartDay;
        this.role = role;
    }

    protected Staff(){}
}

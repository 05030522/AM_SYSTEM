package com.example.attendance_management_system.entity;

import jakarta.persistence.*;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;

//    private enum role;
    private Long memberCount;

    private String manager;

    public String getManager() {
        return manager;
    }

    public Long getMemberCount() {
        return memberCount;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Team(String name) {
        this.name = name;
    }

    protected Team(){}
}

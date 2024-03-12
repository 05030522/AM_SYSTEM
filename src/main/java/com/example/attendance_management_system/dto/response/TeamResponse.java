package com.example.attendance_management_system.dto.response;

import com.example.attendance_management_system.entity.Team;

public class TeamResponse {
    private Long id;
    private String name;
    private String manager;
    private Long memberCount;

    public TeamResponse(Team team) {
        this.id = team.getId();
        this.name = team.getName();
        this.manager = team.getManager();
        this.memberCount = team.getMemberCount();
    }


}

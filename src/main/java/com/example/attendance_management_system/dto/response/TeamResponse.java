package com.example.attendance_management_system.dto.response;

import com.example.attendance_management_system.entity.Team;
import com.example.attendance_management_system.repository.TeamRepository;

import java.util.Optional;

public class TeamResponse {
    private Long id;
    private String name;
    private String manager;
    private Long memberCount;

    public TeamResponse(Team team, TeamRepository teamRepository) {
        this.id = team.getId();
        this.name = team.getName();
        Optional<Team> isMANAGER = teamRepository.findTeamByRoleIsMANAGER();
        this.manager = isMANAGER.isPresent() ? "MANAGER" : null;
        this.memberCount = team.getMemberCount();
    }
}

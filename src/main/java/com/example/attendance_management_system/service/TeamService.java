package com.example.attendance_management_system.service;

import com.example.attendance_management_system.dto.reqeuet.TeamSaveRequest;
import com.example.attendance_management_system.dto.response.TeamResponse;
import com.example.attendance_management_system.entity.Team;
import com.example.attendance_management_system.repository.TeamRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Transactional
    public void saveTeam(TeamSaveRequest request){
        teamRepository.save(new Team(request.getName()));
    }

    @Transactional(readOnly = true)
    public List<TeamResponse> getTeam(){
        return teamRepository
                .findAll()
                .stream()
                .map(TeamResponse::new)
                .collect(Collectors.toList());
    }
}

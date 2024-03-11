package com.example.attendance_management_system.controller;

import com.example.attendance_management_system.dto.reqeuet.StaffSaveRequest;
import com.example.attendance_management_system.dto.reqeuet.TeamSaveRequest;
import com.example.attendance_management_system.entity.Team;
import com.example.attendance_management_system.service.StaffService;
import com.example.attendance_management_system.service.TeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TempController {

    private final StaffService staffService;
    private final TeamService teamService;

    public TempController(StaffService staffService, TeamService teamService) {
        this.staffService = staffService;
        this.teamService = teamService;
    }

    @PostMapping("/save/team")
    public void saveTeam(@RequestBody TeamSaveRequest request){
        teamService.saveTeam(request);
    }

    @PostMapping("/save/staff")
    public void saveStaff(@RequestBody StaffSaveRequest request){
        staffService.saveStaff(request);
    }

//    @GetMapping("/show/team")
//    public List<Team> getTeam(){
//        return teamService.getTeam();
//    }

    @PostMapping("/start/work")
    public void startWork(){
        staffService.startWork();
    }

    @PostMapping("/start/end")
    public void endWork(){
        staffService.endWork();
    }

}

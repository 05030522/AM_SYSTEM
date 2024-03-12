package com.example.attendance_management_system.controller;

import com.example.attendance_management_system.dto.reqeuet.StaffSaveRequest;
import com.example.attendance_management_system.dto.reqeuet.TeamSaveRequest;
import com.example.attendance_management_system.dto.response.StaffResponse;
import com.example.attendance_management_system.dto.response.TeamResponse;
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

    /***********************************************************
     * 팀 저장 기능
     * POST (/save/team) 를 사용하여 팀의 정보를 DB에 저장합니다.
     ***********************************************************/
    @PostMapping("/save/team")
    public void saveTeam(@RequestBody TeamSaveRequest request) {
        teamService.saveTeam(request);
    }

    /***********************************************************
     * 직원 저장 기능
     * POST (/save/staff) 를 사용하여 직원의 정보를 DB에 저장합니다.
     ************************************************************/
    @PostMapping("/save/staff")
    public void saveStaff(@RequestBody StaffSaveRequest request) {
        staffService.saveStaff(request);
    }

    @GetMapping("/get/team")
    public List<TeamResponse> getTeam(){
        return teamService.getTeam();
    }

    @GetMapping("/get/staff")
    public List<StaffResponse> getStaff() {
        return staffService.getStaff();
    }

    @PostMapping("/start/work")
    public void startWork() {
        staffService.startWork();
    }

    @PostMapping("/start/end")
    public void endWork() {
        staffService.endWork();
    }

}

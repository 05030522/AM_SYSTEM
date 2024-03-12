package com.example.attendance_management_system.dto.response;

import com.example.attendance_management_system.entity.Staff;
import org.apache.catalina.Role;

import java.util.Date;

public class StaffResponse {
    private String name;
    private String teamName;
    private Role role;
    private Date birthday;

    private Date workStartDay;

    public StaffResponse(Staff staff) {
        this.name = staff.getName();
        this.teamName = staff.getTeamName();
        this.role = (Role) staff.getRole(); //좀더 알아볼 것
        this.birthday = staff.getBirthday();
        this.workStartDay = staff.getWorkStartDay();
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    public Role getRole() {
        return role;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Date getWorkStartDay() {
        return workStartDay;
    }
}

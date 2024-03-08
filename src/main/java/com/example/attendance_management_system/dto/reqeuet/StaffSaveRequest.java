package com.example.attendance_management_system.dto.reqeuet;

import javax.management.relation.Role;
import java.util.Date;

public class StaffSaveRequest {
    private String name;
    private Role role;
    private Date workStartDay;
    private Date birthday;

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public Date getWorkStartDay() {
        return workStartDay;
    }

    public Date getBirthday() {
        return birthday;
    }
}

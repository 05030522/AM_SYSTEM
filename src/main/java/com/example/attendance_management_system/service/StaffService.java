package com.example.attendance_management_system.service;

import com.example.attendance_management_system.dto.reqeuet.StaffSaveRequest;
import com.example.attendance_management_system.entity.Staff;
import com.example.attendance_management_system.repository.StaffRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StaffService {
    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @Transactional
    public void saveStaff(StaffSaveRequest request){
        staffRepository.save(new Staff(request.getName(), request.getBirthday(),
                request.getWorkStartDay(), request.getRole()));
    }

    @Transactional
    public void startWork(){}

    @Transactional
    public void endWork(){}
}

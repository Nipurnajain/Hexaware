package com.hexaware.dao;
import java.util.Date;

import com.hexaware.entities.Employee;

public interface ICourierAdminService {
   
    int addCourierStaff(Employee obj);

   
    boolean removeCourierStaff(int courierStaffId);

    
    String generateDeliveryReport(Date startDate, Date endDate);
}


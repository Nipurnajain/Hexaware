package com.hexaware.entities;
import java.util.Date;

public interface ICourierAdminService {
   
    int addCourierStaff(Employee obj);

   
    boolean removeCourierStaff(int courierStaffId);

    
    String generateDeliveryReport(Date startDate, Date endDate);
}


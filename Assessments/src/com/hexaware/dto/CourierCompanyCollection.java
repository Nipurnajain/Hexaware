package com.hexaware.dto;

import java.util.ArrayList;
import java.util.List;

public class CourierCompanyCollection {
    private List<CourierCompany> courierCompanies;

    public CourierCompanyCollection() {
        courierCompanies = new ArrayList<>();
    }

    public void addCourierCompany(CourierCompany courierCompany) {
        courierCompanies.add(courierCompany);
    }

    public List<CourierCompany> getCourierCompanies() {
        return courierCompanies;
    }

    // Additional methods for dynamic updates, retrieval, and manipulation

    // You can also add other utility methods as needed
}

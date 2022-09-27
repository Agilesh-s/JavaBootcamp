package com.nest;

public class StudentsData {
    Integer rollNo;
    Integer empId;

    public StudentsData(Integer rollNo, Integer empId) {
        this.rollNo = rollNo;
        this.empId = empId;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
}

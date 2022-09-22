/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author BOT
 */
public class TimeSheet{
    private String name;
    private String employee_id;
    private int salary_level_id;
    private Date date;
    private int shift_id;
    private String Status_name;

    public TimeSheet() {
    }

    public TimeSheet(String name, String employee_id, int salary_level_id, Date date, int shift_id, String Status_name) {
        this.name = name;
        this.employee_id = employee_id;
        this.salary_level_id = salary_level_id;
        this.date = date;
        this.shift_id = shift_id;
        this.Status_name = Status_name;
    }

    public int getShift_id() {
        return shift_id;
    }

    public void setShift_id(int shift_id) {
        this.shift_id = shift_id;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public int getSalary_level_id() {
        return salary_level_id;
    }

    public void setSalary_level_id(int salary_level_id) {
        this.salary_level_id = salary_level_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus_name() {
        return Status_name;
    }

    public void setStatus_name(String Status_name) {
        this.Status_name = Status_name;
    }
    
    
}

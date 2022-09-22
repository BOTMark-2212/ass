/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author BOT
 */
public class Employee {
    private String employee_id;
    private String name;
    private int salary_level_id;
    private String password;
    private String posotion_name;

    public Employee() {
    }

    public Employee(String employee_id, String name, int salary_level_id, String password, String posotion_name) {
        this.employee_id = employee_id;
        this.name = name;
        this.salary_level_id = salary_level_id;
        this.password = password;
        this.posotion_name = posotion_name;
    }

    

    

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary_level_id() {
        return salary_level_id;
    }

    public void setSalary_level_id(int salary_level_id) {
        this.salary_level_id = salary_level_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosotion_name() {
        return posotion_name;
    }

    public void setPosotion_name(String posotion_name) {
        this.posotion_name = posotion_name;
    }

    @Override
    public String toString() {
        return "Employee{" + "employee_id=" + employee_id + ", name=" + name + ", salary_level_id=" + salary_level_id + ", password=" + password + ", posotion_name=" + posotion_name + '}';
    }

    
    
    
}

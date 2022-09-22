/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employee;

/**
 *
 * @author BOT
 */
public class EmployeeDBContext {

    public Connection connection;
    public PreparedStatement ps;
    public ResultSet rs;

    public List<Employee> getListEmployee() {

        try {
            String query = "select employee_id, employee_name, salary_level_id, password, position_name from Employee\n"
                    + "join Position ON Employee.position_id=Position.position_id";

            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            List<Employee> lEmployee = new ArrayList<>();
            while (rs.next()) {
                Employee e = new Employee(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
                lEmployee.add(e);
            }
            return lEmployee;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean login(String employee_id, String password) {

        try {
            String query = "select employee_id, password from Employee";
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                if (employee_id.equals(rs.getString(1)) && password.equals(rs.getString(2))) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static void main(String[] args) {
        List<Employee> e = new EmployeeDBContext().getListEmployee();
        System.out.println(e.get(0).toString());
    }

}

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
import model.TimeSheet;

/**
 *
 * @author BOT
 */
public class TimeSheetDBContext {

    public Connection connection;
    public PreparedStatement ps;
    public ResultSet rs;

    public List<TimeSheet> getTimeSheet() {
        try {
            String query = "select Employee.employee_name, Employee.employee_id, Employee.salary_level_id, TimeSheet.date,TimeSheet.shift_id, WorkingStatus.working_status\n"
                    + "from(Employee join TimeSheet on Employee.employee_id=TimeSheet.employee_id)\n"
                    + "join WorkingStatus on TimeSheet.working_status_id=WorkingStatus.working_status_id";

            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            List<TimeSheet> lTimeSheet = new ArrayList<>();
            while (rs.next()) {
                TimeSheet ts = new TimeSheet(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDate(4), rs.getInt(5), rs.getString(6));
                lTimeSheet.add(ts);
            }
            return lTimeSheet;
        } catch (SQLException ex) {
            Logger.getLogger(TimeSheetDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

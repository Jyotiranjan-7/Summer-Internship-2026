package com.employeecrud.dao;

import com.employeecrud.model.Employee;
import com.employeecrud.util.DBConnection;

import java.sql.*;

public class EmployeeDAO {

    public void addEmployee(Employee emp) {

        String sql =
                "INSERT INTO employee(name,department,salary) VALUES(?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getDepartment());
            ps.setDouble(3, emp.getSalary());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Added Successfully");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewEmployees() {

        String sql = "SELECT * FROM employee";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("department") + " | " +
                                rs.getDouble("salary")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateEmployee(int id,
                               String name,
                               String department,
                               double salary) {

        String sql =
                "UPDATE employee SET name=?, department=?, salary=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, department);
            ps.setDouble(3, salary);
            ps.setInt(4, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Updated Successfully");
            } else {
                System.out.println("Employee Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(int id) {

        String sql = "DELETE FROM employee WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Deleted Successfully");
            } else {
                System.out.println("Employee Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

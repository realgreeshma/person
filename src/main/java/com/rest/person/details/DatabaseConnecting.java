package com.rest.person.details;


import java.sql.*;

public class DatabaseConnecting
{

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        Connection conn = null;
        Statement st = null;
        try {
            conn = DriverManager.getConnection(url, "hr", "hr");
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from Employees");

            while(rs.next()) {
                System.out.print(rs.getString(1) +" ") ;
                System.out.print(rs.getString(2) + " ");
                System.out.print(rs.getString(3) + " ");
                System.out.print(rs.getString(4) + " ");
                System.out.println(rs.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        st.close();
    }
}

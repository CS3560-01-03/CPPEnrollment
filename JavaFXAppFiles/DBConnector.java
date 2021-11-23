package com.enrollment.enrollmentproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    public static Connection getConnection() throws SQLException { //here i noticed i made the db with a typo in the name
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cppenrollement",
                "root",
                "password");
        return connection;
    }
}

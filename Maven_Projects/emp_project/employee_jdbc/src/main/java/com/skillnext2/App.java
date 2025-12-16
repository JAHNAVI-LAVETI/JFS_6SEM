package com.skillnext2;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {
        Connection conn = DBConnection.getConnection();
        if (conn != null) {
            System.out.println("Connected to MySQL successfully!");
        } else {
            System.out.println("Connection failed!");
        }
    }
}

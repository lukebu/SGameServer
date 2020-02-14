package com.lukebu.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Connector {

    private Connection c = null;
    private Statement stmt = null;

    String urlMaria = "jdbc:mariadb://localhost:3306/sgame?user=root&password=zaq12wsx";


    public void createConnectionToDb() {

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            c = DriverManager.getConnection(urlMaria);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully!!!");
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public ResultSet insertQueryStatement(final String insertQuery) {
        ResultSet rs = null;
        try {
            stmt = c.createStatement();
            rs = stmt.executeQuery(insertQuery);
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return rs;
    }

    public int insertUpdateStatement(final String updateQuery) {
        int result = 0;

        try {
            stmt = c.createStatement();
            result = stmt.executeUpdate(updateQuery);
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return result;
    }

    public void closeConnectionWithCommit() {
        try {
            c.commit();
            stmt.close();
            c.close();
            System.out.println("Connection closed");

        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}

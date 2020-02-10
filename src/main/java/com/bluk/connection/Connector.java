package com.bluk.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Connector {

    private Connection c = null;
    private Statement stmt = null;

    String url = "jdbc:postgresql://localhost/postgres";

    public void createConnectionToDb() {

        Properties  properties =  new Properties();
        properties.setProperty("user", "postgres");
        properties.setProperty("password", "zaq12wsx");
        properties.setProperty("ssl","false");

        try {
            //Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(url,properties);
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
            System.exit(0);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
/**
 *
 * @author Lab Informatika
 */
public class Connector {
    String jdbc_driver = "com.mysql.cj.jdbc.Driver";
    String nama_db = "inventory_db";
    String url_db = "jdbc:mysql://localhost:3306/"+nama_db;
    String username_db = "root";
    String pass_db = "";
    
    Connection conn;
    public Connector() {
        try {
            System.out.println("Coba connect: "+url_db);
            Class.forName(jdbc_driver);
            conn = DriverManager.getConnection(url_db, username_db, pass_db);
            System.out.println("Sukses");
            
        } catch (ClassNotFoundException | SQLException exception) {
            System.out.println("Connection Failed: "+exception.getLocalizedMessage());
        }
    }
        public Connection getConnection() {
            return this.conn;
        }
}

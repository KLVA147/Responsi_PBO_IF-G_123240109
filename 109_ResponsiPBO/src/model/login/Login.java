/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.login;

import model.Connector;
import java.sql.*;
/**
 *
 * @author Lab Informatika
 */
public class Login implements LoginDAO{
    private Connection connection;
    public Login() {
        Connector db = new Connector();
        this.connection = db.getConnection();
    }
    
    @Override
    public boolean loginValidasi(String username, String password) {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, username);
            ps.setString(2, password);
            try (ResultSet rs = ps.executeQuery()){
                if(rs.next()) {
                    System.out.println("Model: Akun ditemukan!");
                    return true;
                }
            }
        } catch (SQLException e) {
            System.out.println("Model Error(Login): "+e.getMessage());
            return false;
        }
        System.out.println("Akun Tidak Ditemukan!");
        return false;
    }
}

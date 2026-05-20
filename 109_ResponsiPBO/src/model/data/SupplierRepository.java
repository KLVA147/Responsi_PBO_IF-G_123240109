/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.data;

import java.sql.*;
import java.util.*;
import model.Supplier;
import model.Connector;

/**
 *
 * @author Lab Informatika
 */
public class SupplierRepository implements SupplierDAO{
    private Connection conn;
    public SupplierRepository() {
        Connector db = new Connector();
        this.conn = db.getConnection();
    }
    public boolean insert(Supplier data){
        String sql = "INSERT INTO supplier (id, nama, kontak, alamat) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, Supplier.getId();
            ps.setString(2, Supplier.getNama());
            ps.setString(3, Supplier.getKontak());
            ps.setString(4, Supplier.getAlamat());
            
        } catch (Exception e) {
        }
    };
    public boolean update(Supplier data){};
    public boolean delete(int id){};
    public Supplier getById(int id){};
    public List<Supplier> getAll(){};
    public List<Supplier> search(String keyword){};
}

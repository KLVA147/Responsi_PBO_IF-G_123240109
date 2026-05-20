/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.data;

import java.sql.*;
import java.util.*;
import model.Barang;
import model.Connector;
/**
 *
 * @author Lab Informatika
 */
public class BarangRepository implements BarangDAO{
    private Connection conn;
    public BarangRepository() {
        Connector db = new Connector();
        this.conn = db.getConnection();
    }
    
    public boolean insert(Barang data){
        String sql = "INSERT INTO barang (id, nama, kategori, status) VALUES (?, ?, ?, ?)";
        
    };
    public boolean update(Barang data){};
    public boolean delete(int id){};
    public Barang getById(int id){};
    public List<Barang> getAll(){};
    public List<Barang> search(String keyword){};
    
}

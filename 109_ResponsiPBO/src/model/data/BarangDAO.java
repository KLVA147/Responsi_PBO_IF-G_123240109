/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.data;

import java.util.List;
import model.Barang;
/**
 *
 * @author Lab Informatika
 */
public interface BarangDAO {
    boolean insert(Barang data);
    boolean update(Barang data);
    boolean delete(int id);
    Barang getById(int id);
    List<Barang> getAll();
    List<Barang> search(String keyword);
}

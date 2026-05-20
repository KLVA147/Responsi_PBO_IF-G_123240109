/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class Barang {
    private int id;
    private String nama;
    private String kategori;
    private String status;
    public Barang(int id, String nama, String kategori, String status) {
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.status = status;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getKategori() {
        return kategori;
    }
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus() {
        this.status = status;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
/**
 *
 * @author Lab Informatika
 */
public class MenuView extends JFrame {
    public JButton btnBarang = new JButton("Data Barang");
    public JButton btnSupplier = new JButton("Data Supplier");
    public JButton btnLogout = new JButton("Logout");

    public MenuView(String user) {
        setTitle("Menu Page");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblTitle = new JLabel("Selamat Datang! (" + user + ")");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setBounds(20, 20, 350, 30);
        add(lblTitle);

        JLabel lblSubtitle = new JLabel("Silakan pilih untuk melanjutkan.");
        lblSubtitle.setBounds(20, 50, 350, 20);
        add(lblSubtitle);

        btnBarang.setBounds(20, 90, 340, 30);
        add(btnBarang);

        btnSupplier.setBounds(20, 130, 340, 30);
        add(btnSupplier);

        btnLogout.setBounds(20, 170, 340, 30);
        add(btnLogout);
    }
    public void addBarangListener(ActionListener listener) {
        btnBarang.addActionListener(listener);
    }
    public void addSupplierListener(ActionListener listener) {
        btnSupplier.addActionListener(listener);
    }
    public void addLogoutListener(ActionListener listener) {
        btnLogout.addActionListener(listener);
    }
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
}
